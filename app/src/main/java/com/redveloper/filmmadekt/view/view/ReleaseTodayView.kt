package com.redveloper.filmmadekt.view.view

import com.redveloper.filmmadekt.model.movie.ResponMovie

interface ReleaseTodayView{
    interface View{
        fun callReleaseToday(date : String)
        fun showData(data : List<ResponMovie.ResultMovie>)
        fun showMessage(msg : String)
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter{
        fun getReleaseTodayMovie(
            api_key : String,
            date_gte : String,
            date_lte : String
        )
    }
}