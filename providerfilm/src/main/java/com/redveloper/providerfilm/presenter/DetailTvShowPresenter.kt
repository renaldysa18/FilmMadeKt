package com.redveloper.providerfilm.presenter

import android.content.Context
import com.redveloper.providerfilm.model.ResponTvShow
import com.redveloper.providerfilm.view.DetailView

class DetailTvShowPresenter(val view : DetailView.ViewTvShow) : DetailView.PresenterTvShow{

    override fun extractData(context: Context, data: ResponTvShow.ResultTvShow) {
        val image : String? = data.backdrop_path
        val title : String? = data.original_name
        val releaseDate : String? = data.first_air_date
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