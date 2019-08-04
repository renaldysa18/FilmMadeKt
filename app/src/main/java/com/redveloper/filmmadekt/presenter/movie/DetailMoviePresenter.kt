package com.redveloper.filmmadekt.presenter.movie

import android.content.Context
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.room.AppDatabase
import com.redveloper.filmmadekt.view.view.DetailView

class DetailMoviePresenter(val view: DetailView.ViewMovie) : DetailView.PresenterMovie {

    private lateinit var dataGlobal: ResponMovie.Result
    private var idMovie: Long = 0

    override fun extractData(context: Context, data: ResponMovie.Result) {
        val image: String = context.resources.getString(R.string.BASE_IMAGE) + data.poster_path
        val title: String = data.title.toString()
        val releaseDate: String = data.release_date.toString()
        val rating: String = data.vote_average.toString()
        val popularity: String = data.popularity.toString()
        val description: String = data.overview.toString()
        view.showData(
            image, title, releaseDate, rating, popularity, description
        )
        //input data global
        this.dataGlobal = data

        if (data.id != null) {
            this.idMovie = data.id!!.toLong()
        }
    }

    override fun insertFavorite(context: Context) {
        AppDatabase.getInstance(context).movieDao().insertMovie(dataGlobal)
    }

    override fun removeFavorite(context: Context) {
        AppDatabase.getInstance(context).movieDao().removeSpecific(idMovie)
    }

    override fun checkFavorite(context: Context): Boolean {
        return AppDatabase.getInstance(context).movieDao().getSelectMovie(idMovie) != null
    }
}