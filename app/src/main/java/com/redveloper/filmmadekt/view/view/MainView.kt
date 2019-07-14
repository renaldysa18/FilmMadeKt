package com.redveloper.filmmadekt.view.view

import com.redveloper.filmmadekt.model.movie.ResponMovie

interface MainView{

    interface MovieView{
        fun makeToast(msg : String)
        fun showData(data : ArrayList<ResponMovie.ResultMovie>)
        fun callMovie()
        fun showShimemr()
        fun hideShimmer()
    }

    interface MoviePresenter{
        fun getMoview(
            apikey : String,
            dateGte : String,
            dateLte : String
        )
    }
}