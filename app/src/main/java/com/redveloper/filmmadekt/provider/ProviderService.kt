package com.redveloper.filmmadekt.provider

import android.content.ContentProvider
import android.content.ContentValues
import android.content.UriMatcher
import android.database.Cursor
import android.net.Uri
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.room.AppDatabase
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow
import java.util.*

class ProviderService : ContentProvider() {

    private val AUTORITY = context.packageName
    private val MOVIE = 1
    private val TVSHOW = 2
    private var urimatcher: UriMatcher = UriMatcher(UriMatcher.NO_MATCH)
    private val MOVIE_TABLE = ResponMovie.Result::class.simpleName
    private val TVSHOW_TABLE = ResponTvShow.Result::class.simpleName

    init {
        urimatcher.addURI(AUTORITY, MOVIE_TABLE, MOVIE)
        urimatcher.addURI(AUTORITY, TVSHOW_TABLE, TVSHOW)
    }


    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        Objects.requireNonNull(context).contentResolver.notifyChange(uri, null)
        return uri
    }

    override fun query(
        uri: Uri,
        projection: Array<String>?,
        selection: String?,
        selectionArgs: Array<String>?,
        sortOrder: String?
    ): Cursor? {
        when (urimatcher.match(uri)) {
            MOVIE -> {
                val movieDao = AppDatabase.getInstance(context).movieDao()
                return movieDao.getAllMovieCursor()
            }
            TVSHOW -> {
                val tvshowDao = AppDatabase.getInstance(context).tvshowDao()
                return tvshowDao.getAllTvshowCursor()
            }
            else -> return null
        }
    }

    override fun onCreate(): Boolean {
        return true
    }

    override fun update(uri: Uri, values: ContentValues?, selection: String?, selectionArgs: Array<String>?): Int {
        return 0
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int {
        Objects.requireNonNull(context).contentResolver.notifyChange(uri, null)
        return 0
    }

    override fun getType(uri: Uri): String? {
        return null
    }
}