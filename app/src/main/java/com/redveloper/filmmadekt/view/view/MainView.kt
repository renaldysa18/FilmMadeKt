package com.redveloper.filmmadekt.view.view

import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.tvshow.ResponTvshow

interface MainView {

    interface MovieView {
        fun makeToast(msg: String)
        fun showData(data: ArrayList<ResponMovie.ResultMovie>)
        fun callMovie()
        fun showShimemr()
        fun hideShimmer()
    }

    interface MoviePresenter {
        fun getMoview(
            apikey: String,
            dateGte: String,
            dateLte: String
        )
    }

    interface TvshowView {
        fun makeToast(msg: String)
        fun showShimmer()
        fun hideShimmer()
        fun showData(results: List<ResponTvshow.ResultTvShow>?)
        fun callTvshow()
    }

    interface TvshowPresenter {
        fun getTvshow(
            apikey: String,
            languange: String,
            page: String
        )
    }
}