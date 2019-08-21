package com.redveloper.filmmadekt.model.service.widgetService

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.widget.RemoteViews
import android.widget.RemoteViewsService
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.room.AppDatabase
import java.net.URL

class StackRemoteViewsFactory(val context: Context) : RemoteViewsService.RemoteViewsFactory {

    private var bitmaps: ArrayList<Bitmap> = ArrayList()

    override fun onCreate() {
    }

    override fun getLoadingView(): RemoteViews? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun onDataSetChanged() {
        bitmaps.clear()
        val movies = AppDatabase.getInstance(context).movieDao().getAllMovie()
        for (i in 0 until movies.size) {
            val url: URL = URL(context.resources.getString(R.string.BASE_IMAGE) + movies.get(i).poster_path)
            bitmaps.add(BitmapFactory.decodeStream(url.openConnection().getInputStream()))
        }

        val tvshows = AppDatabase.getInstance(context).tvshowDao().getAllTvshow()
        for (i in 0 until tvshows.size ){
            val url = URL(context.resources.getString(R.string.BASE_IMAGE) + tvshows.get(i).poster_path)
            bitmaps.add(BitmapFactory.decodeStream(url.openConnection().getInputStream()))
        }
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getViewAt(position: Int): RemoteViews {
        val views: RemoteViews = RemoteViews(context.packageName, R.layout.widget_item)
        views.setImageViewBitmap(R.id.imageView_stack_widget, bitmaps.get(position))

        return views
    }

    override fun getCount(): Int {
        return bitmaps.size
    }

    override fun getViewTypeCount(): Int {
        return 1
    }

    override fun onDestroy() {
    }
}