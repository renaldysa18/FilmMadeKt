package com.redveloper.filmmadekt.view.view

import com.redveloper.filmmadekt.model.tvshow.ResponTvShow

interface TvshowView{
    interface Popular{
        fun callTvShowPopular()
        fun showData(data : List<ResponTvShow.ResultTvShow>?)
        fun showMessage(msg : String)
        fun showLoading()
        fun hideLoading()
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
        fun showData(data : List<ResponTvShow.ResultTvShow>?)
        fun showMessage(msg : String)
        fun showLoading()
        fun hideLoading()
    }
    interface TopRatedPresenter{
        fun getTopRatedTvShow(
            api_key: String,
            languange: String,
            page: Int
        )
    }
}