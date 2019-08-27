package com.redveloper.providerfilm.presenter

import android.annotation.SuppressLint
import android.content.ContentProviderClient
import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.os.RemoteException
import android.util.Log
import com.redveloper.providerfilm.model.ResponMovie
import com.redveloper.providerfilm.model.ResponTvShow
import com.redveloper.providerfilm.view.MainView

class TvShowPresenter(val context: Context, val view: MainView.ViewTvShow) : MainView.PresenterTvShow {
    private val AUTHORITY = "com.redveloper.filmmadekt"
    private val TVSHOW_TABLE = ResponTvShow.ResultTvShow::class.java.simpleName as String
    private val ContentUri: Uri = Uri.parse(
        "content://" + AUTHORITY + "/" + TVSHOW_TABLE
    )

    @SuppressLint("Recycle")
    override fun getDataTvShow() {
        val contentProviderClient: ContentProviderClient =
            context.contentResolver.acquireContentProviderClient(ContentUri)
        try {
            assert(contentProviderClient != null)
            val cursor = contentProviderClient.query(
                ContentUri,
                arrayOf(
                    ResponTvShow.ResultTvShow().ORIGINAL_NAME,
                    ResponTvShow.ResultTvShow().NAME,
                    ResponTvShow.ResultTvShow().POPULARITY,
                    ResponTvShow.ResultTvShow().VOTE_COUNT,
                    ResponTvShow.ResultTvShow().FIRST_AIR_DATE,
                    ResponTvShow.ResultTvShow().BACKDROP_PATH,
                    ResponTvShow.ResultTvShow().ORIGINAL_LANGUANGE,
                    ResponTvShow.ResultTvShow().ID,
                    ResponTvShow.ResultTvShow().VOTE_AVERAGE,
                    ResponTvShow.ResultTvShow().OVERVIEW,
                    ResponTvShow.ResultTvShow().POSTER_PATH
                ),
                null,
                null,
                null,
                null
            )!!
            assert(cursor != null)
            if (cursor.count > 0)
                view.showData(convertData(cursor))
            else
                view.noData()
        } catch (e: RemoteException) {
            view.hideShimmer()
            view.showMessage(e.localizedMessage)
        }
    }

    override fun convertData(cursor: Cursor): ArrayList<ResponTvShow.ResultTvShow> {
        var items: ArrayList<ResponTvShow.ResultTvShow> = ArrayList()
        while (cursor.moveToNext()) {
            val data = ResponTvShow.ResultTvShow(cursor)
            items.add(data)
        }
        return items
    }
}