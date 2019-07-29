package com.redveloper.filmmadekt.view.view

import android.content.Context
import com.redveloper.filmmadekt.model.tvshow.ResponPopularTvshow

interface MainView {

    interface MovieView {

    }


    interface MovieFavoritePresenter{
//        fun getFavoriteMovie(context: Context)
        fun toDetailMovie(context: Context, pos : Int)
    }

    interface TvshowView {

    }


    interface TvshowFavortePresenter{
//        fun getFavoriteTvshow(context: Context)
        fun toDetailTvshow(context: Context, pos : Int)
    }
}