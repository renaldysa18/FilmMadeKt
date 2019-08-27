package com.redveloper.filmmadekt.view.view

import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow

interface MainView {
    interface MoviePresenter {
        fun searchMovie(api_key: String, languange: String, query: String)
    }

    interface Movie {
        fun searchMovie(query: String)
        fun showDialogFragment()
        fun showDialog()
        fun showMessage(message: String)
        fun hideDialog()
        fun showData(data: List<ResponMovie.ResultMovie>?)
        fun changeLayout()
    }

    interface TvShowPresenter{
        fun searchTvShow(api_key: String, languange: String, query: String)
    }

    interface TvShow{
        fun searchTvshow(query: String)
        fun showDialogFragment()
        fun showDialog()
        fun showMessage(message : String)
        fun hideDialog()
        fun showData(data : List<ResponTvShow.ResultTvShow>)
        fun changeLayout()
    }
}