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
    private val MOVIE_TABLE = ResponMovie.Result::class.java.simpleName as String
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
                    ResponMovie.Result().VOTE_COUNT,
                    ResponMovie.Result().ID,
                    ResponMovie.Result().VIDEO,
                    ResponMovie.Result().VOTE_AVERAGE,
                    ResponMovie.Result().TITLE,
                    ResponMovie.Result().POPULARITY,
                    ResponMovie.Result().POSTER_PATH,
                    ResponMovie.Result().ORIGINAL_LANGUANGE,
                    ResponMovie.Result().ORIGINAL_TITLE,
                    ResponMovie.Result().BACKDROP_PATH,
                    ResponMovie.Result().ADULT,
                    ResponMovie.Result().OVERVIEW,
                    ResponMovie.Result().RELEASE_DATE
                ),
                null,
                null,
                null,
                null
            )!!
            assert(cursor != null)
            Log.i("oioioioi",cursor.count.toString())
            if (cursor.count > 0)
                view.showData(convertData(cursor))
            else
                view.noData()
        } catch (e: RemoteException) {
            view.hideShimmer()
            view.showMessage(e.localizedMessage)
        }
    }

    override fun convertData(cursor: Cursor): ArrayList<ResponMovie.Result> {
        var items: ArrayList<ResponMovie.Result> = ArrayList()
        while (cursor.moveToNext()) {
            val data = ResponMovie.Result(cursor)
            items.add(data)
        }
        return items
    }
}