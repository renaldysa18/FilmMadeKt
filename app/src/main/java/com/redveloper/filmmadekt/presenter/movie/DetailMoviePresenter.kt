package com.redveloper.filmmadekt.presenter.movie

import android.content.Context
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.view.view.DetailView

class DetailMoviePresenter(val view: DetailView.ViewMovie) : DetailView.PresenterMovie{

    override fun extractData(context: Context, data: ResponMovie.ResultMovie) {
        val image : String = context.resources.getString(R.string.BASE_IMAGE) + data.poster_path
        val title : String = data.title.toString()
        val releaseDate : String = data.release_date.toString()
        val rating : String = data.vote_average.toString()
        val popularity : String = data.popularity.toString()
        val description : String = data.overview.toString()
        view.showData(
            image, title, releaseDate, rating, popularity, description
        )
    }

}