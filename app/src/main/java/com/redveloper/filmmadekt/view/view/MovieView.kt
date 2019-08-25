package com.redveloper.filmmadekt.view.view

import com.redveloper.filmmadekt.model.movie.ResponMovie

interface MovieView{

    interface NowPlaying{
        fun callMovie()
        fun showData(data : List<ResponMovie.Result>?)
        fun showMessage(msg : String)
        fun showLoading()
        fun hideLoading()
    }

    interface NowPlayingPresenter{
        fun getNowPlayingMovie(
            api_key : String,
            languange : String,
            page : Int
        )
    }

    interface UpComing{
        fun CallUpComingMovie()
        fun showData(data: List<ResponMovie.Result>?)
        fun showMessage(msg : String)
        fun showLoading()
        fun hideLoading()
    }

    interface UpComingPresenter{
        fun getUpComingMovie(
            api_key: String,
            languange: String,
            page: Int
        )
    }

    interface Popular{
        fun CallPopularMovie()
        fun showData(data : List<ResponMovie.Result>?)
        fun showMessage(msg : String)
        fun showLoading()
        fun hideLoading()
    }

    interface PopularPresenter{
        fun getPopularMovie(
            api_key: String,
            languange: String,
            page: Int
        )
    }

}