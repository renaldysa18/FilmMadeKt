package com.redveloper.filmmadekt.view.view

interface MainView{

    interface MovieView{
        fun makeToast(msg : String)
    }

    interface MoviePresenter{
        fun getMoview(
            apikey : String,
            dateGte : String,
            dateLte : String
        )
    }
}