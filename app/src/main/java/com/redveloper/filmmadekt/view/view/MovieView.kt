package com.redveloper.filmmadekt.view.view

import com.redveloper.filmmadekt.model.movie.ResponNowPlayingMovie
import com.redveloper.filmmadekt.model.movie.ResponPopularMovie
import com.redveloper.filmmadekt.model.movie.ResponUpComingMovie

interface MovieView{

    interface NowPlaying{
        fun callMovie()
        fun showData(data : List<ResponNowPlayingMovie.Result>?)
        fun showMessage(msg : String)
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
        fun showData(data: List<ResponUpComingMovie.Result>?)
        fun showMessage(msg : String)
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
        fun showData(data : List<ResponPopularMovie.Result>?)
        fun showMessage(msg : String)
    }

    interface PopularPresenter{
        fun getPopularMovie(
            api_key: String,
            languange: String,
            page: Int
        )
    }

}