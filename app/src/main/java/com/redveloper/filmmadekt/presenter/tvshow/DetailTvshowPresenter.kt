package com.redveloper.filmmadekt.presenter.tvshow

import android.content.Context
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.tvshow.ResponTvshow
import com.redveloper.filmmadekt.view.view.DetailView

class DetailTvshowPresenter(val view : DetailView.ViewTvshow) : DetailView.PresenterTvshow{

    override fun extractData(context: Context, data: ResponTvshow.ResultTvShow) {
        val image : String? = context.resources.getString(R.string.BASE_IMAGE) + data.poster_path
        val title : String? = data.name.toString()
        val rating : String? = data.vote_average.toString()
        val popularity : String? = data.popularity.toString()
        val description : String? = data.overview.toString()

        view.showData(
            image, title, rating, popularity, description
        )
    }

}