package com.redveloper.providerfilm.presenter

import android.annotation.SuppressLint
import android.content.ContentProviderClient
import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.os.RemoteException
import com.redveloper.providerfilm.model.MovieData
import com.redveloper.providerfilm.view.MainView

class MoviePresenter(val context: Context, val view: MainView.ViewMovie) : MainView.PresenterMovie {
    private val AUTHORITY = "com.redveloper.filmmadekt"
    private val ContentUri: Uri = Uri.parse(
        "content://" + AUTHORITY + "/" + "moviedb"
    )

    @SuppressLint("Recycle")
    override fun getDataMovie() {
        val contentProviderClient: ContentProviderClient? =
            context.contentResolver.acquireContentProviderClient(ContentUri)
        try {
            assert(contentProviderClient != null){
                val cursor = contentProviderClient?.query(
                    ContentUri,
                    arrayOf(
                        MovieData().VOTE_COUNT,
                        MovieData().ID,
                        MovieData().VIDEO,
                        MovieData().VOTE_AVERAGE,
                        MovieData().TITLE,
                        MovieData().POPULARITY,
                        MovieData().POSTER_PATH,
                        MovieData().ORIGINAL_LANGUANGE,
                        MovieData().ORIGINAL_TITLE,
                        MovieData().BACKDROP_PATH,
                        MovieData().ADULT,
                        MovieData().OVERVIEW,
                        MovieData().RELEASE_DATE
                    ),
                    null,
                    null,
                    null,
                    null
                )!!
                if (cursor.count > 0) {
                    view.showData(convertData(cursor))
                } else {
                    view.noData()
                }
            }
        } catch (e: RemoteException) {
            view.hideShimmer()
            view.showMessage(e.localizedMessage)
        }
    }

    override fun convertData(cursor: Cursor): ArrayList<MovieData> {
        var items: ArrayList<MovieData> = ArrayList()
        while (cursor.moveToNext()) {
            val data: MovieData = MovieData(cursor)
            items.add(data)
        }
        return items
    }
}