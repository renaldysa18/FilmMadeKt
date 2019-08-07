package com.redveloper.filmmadekt.view.view

import com.redveloper.filmmadekt.model.movie.ResponMovie

interface MainView{
    interface MoviePresenter{
        fun searchMovie(api_key : String,  languange : String, query : String)
        fun getMovie() : List<ResponMovie.Result>
    }
    interface TvShowPresenter{

    }
}