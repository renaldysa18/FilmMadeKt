package com.redveloper.providerfilm.presenter

import android.content.Context
import com.redveloper.providerfilm.model.ResponMovie
import com.redveloper.providerfilm.view.DetailView

class DetailMoviePresenter(val view : DetailView.ViewMovie) : DetailView.PresenterMovie{

    override fun extractData(context: Context, data: ResponMovie.ResultMovie) {
        val image : String? = data.backdrop_path
        val title : String? = data.title
        val releaseDate : String? = data.release_date
        val rating : String? = data.vote_average.toString()
        val popularity : String? = data.popularity.toString()
        val description : String? = data.overview

        view.showData(
            image,
            title,
            releaseDate,
            rating,
            popularity,
            description
        )

    }

}