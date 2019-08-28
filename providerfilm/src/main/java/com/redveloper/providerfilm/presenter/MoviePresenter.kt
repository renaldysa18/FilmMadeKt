package com.redveloper.providerfilm.presenter

import android.annotation.SuppressLint
import android.content.ContentProviderClient
import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.os.RemoteException
import android.util.Log
import com.redveloper.providerfilm.model.ResponMovie
import com.redveloper.providerfilm.view.MainView

class MoviePresenter(val context: Context, val view: MainView.ViewMovie) : MainView.PresenterMovie {
    private val AUTHORITY = "com.redveloper.filmmadekt"
    private val MOVIE_TABLE = ResponMovie.ResultMovie::class.java.simpleName as String
    private val ContentUri: Uri = Uri.parse(
        "content://" + AUTHORITY + "/" + MOVIE_TABLE
    )

    @SuppressLint("Recycle")
    override fun getDataMovie() {
        val contentProviderClient: ContentProviderClient =
            context.contentResolver.acquireContentProviderClient(ContentUri)
        try {
            assert(contentProviderClient != null)
            val cursor = contentProviderClient.query(
                ContentUri,
                arrayOf(
                    ResponMovie.ResultMovie().VOTE_COUNT,
                    ResponMovie.ResultMovie().ID,
                    ResponMovie.ResultMovie().VIDEO,
                    ResponMovie.ResultMovie().VOTE_AVERAGE,
                    ResponMovie.ResultMovie().TITLE,
                    ResponMovie.ResultMovie().POPULARITY,
                    ResponMovie.ResultMovie().POSTER_PATH,
                    ResponMovie.ResultMovie().ORIGINAL_LANGUANGE,
                    ResponMovie.ResultMovie().ORIGINAL_TITLE,
                    ResponMovie.ResultMovie().BACKDROP_PATH,
                    ResponMovie.ResultMovie().ADULT,
                    ResponMovie.ResultMovie().OVERVIEW,
                    ResponMovie.ResultMovie().RELEASE_DATE
                ),
                null,
                null,
                null,
                null
            )
            assert(cursor != null)
            if (cursor.count > 0)
                view.showData(convertData(cursor))
            else
                view.noData()
            cursor.close()
        } catch (e: RemoteException) {
            view.hideShimmer()
            view.showMessage(e.localizedMessage)
        }
    }

    override fun convertData(cursor: Cursor): ArrayList<ResponMovie.ResultMovie> {
        var items: ArrayList<ResponMovie.ResultMovie> = ArrayList()
        while (cursor.moveToNext()) {
            val data = ResponMovie.ResultMovie(cursor)
            items.add(data)
        }
        return items
    }
}