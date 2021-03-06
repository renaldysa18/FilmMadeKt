package com.redveloper.filmmadekt.presenter.movie

import android.content.Context
import android.net.Uri
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.room.AppDatabase
import com.redveloper.filmmadekt.view.view.DetailView

class DetailMoviePresenter(val view: DetailView.ViewMovie) : DetailView.PresenterMovie {

    private lateinit var dataGlobal: ResponMovie.ResultMovie
    private var idMovie: Long = 0

    private val AUTHORY = "com.redveloper.filmmadekt"
    private val SCHEME = "content"
    private val CONTENT_URI : Uri = Uri.Builder()
        .scheme(SCHEME)
        .authority(AUTHORY)
        .appendPath(ResponMovie.ResultMovie::class.java.simpleName as String)
        .build()

    override fun extractData(context: Context, data: ResponMovie.ResultMovie) {
        val image: String = context.resources.getString(R.string.BASE_IMAGE) + data.poster_path
        val title: String = data.title.toString()
        val releaseDate: String = data.release_date.toString()
        val rating: String = data.vote_average.toString()
        val popularity: String = data.popularity.toString()
        val description: String = data.overview.toString()
        val vote: String = data.vote_count.toString()
        val backdrop : String = context.resources.getString(R.string.BASE_IMAGE) +data.backdrop_path
        val languange : String = data.original_languange.toString()
        val adult : String = data.adult.toString()

        view.showData(
            image, title, releaseDate, rating, popularity, description, vote, getYear(releaseDate), backdrop
            , languange, adult
        )
        //input data global
        this.dataGlobal = data

        if (data.id != null) {
            this.idMovie = data.id!!.toLong()
        }
    }

    private fun getYear(date: String): String {
        val year = date.split("-")
        return year.get(0)
    }

    override fun insertFavorite(context: Context) {
        AppDatabase.getInstance(context).movieDao().insertMovie(dataGlobal)
        context.contentResolver.insert(CONTENT_URI, dataGlobal.contentValue())
    }

    override fun removeFavorite(context: Context) {
        AppDatabase.getInstance(context).movieDao().removeSpecific(idMovie)
    }

    override fun checkFavorite(context: Context): Boolean {
        return AppDatabase.getInstance(context).movieDao().getSelectMovie(idMovie) != null
    }
}