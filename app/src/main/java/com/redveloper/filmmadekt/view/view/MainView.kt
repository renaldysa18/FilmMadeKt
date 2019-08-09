package com.redveloper.filmmadekt.view.view

import com.redveloper.filmmadekt.model.movie.ResponMovie

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
        fun showData(data: List<ResponMovie.Result>?)
        fun changeLayout()
    }

    interface TvShowPresenter
}