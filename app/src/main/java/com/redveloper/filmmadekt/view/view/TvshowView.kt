package com.redveloper.filmmadekt.view.view

import com.redveloper.filmmadekt.model.tvshow.ResponPopularTvshow
import com.redveloper.filmmadekt.model.tvshow.ResponTopRatedTvShow

interface TvshowView{
    interface Popular{
        fun callTvShowPopular()
        fun showData(data : List<ResponPopularTvshow.ResultTvShow>?)
        fun showMessage(msg : String)
    }
    interface PopularPresenter{
        fun getPopularTvShow(
            api_key : String,
            languange : String,
            page : Int
        )
    }
    interface TopRated{
        fun callTvShowTopRated()
        fun showData(data : List<ResponTopRatedTvShow.Result>?)
        fun showMessage(msg : String)
    }
    interface TopRatedPresenter{
        fun getTopRatedTvShow(
            api_key: String,
            languange: String,
            page: Int
        )
    }
}