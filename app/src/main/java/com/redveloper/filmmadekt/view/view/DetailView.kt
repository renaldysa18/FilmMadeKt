package com.redveloper.filmmadekt.view.view

import android.content.Context
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow

interface DetailView{
    interface ViewMovie{
        fun getData()
        fun showData(
            image : String,
            title : String,
            releaseDate : String,
            rating : String,
            popularity : String,
            description : String,
            vote : String,
            year : String,
            backdrop : String,
            languange : String,
            adult : String
        )
        fun setFavorite()
        fun addToFavoriteMovie()
        fun removeToFavoriteMovie()
        fun favoriteState()
    }
    interface PresenterMovie{
        fun extractData(
            context: Context,
            data: ResponMovie.Result
        )
        fun insertFavorite(
            context: Context
        )
        fun removeFavorite(
            context: Context
        )
        fun checkFavorite(
            context: Context
        ) : Boolean
    }

    interface ViewTvshow{
        fun getData()
        fun showData(
            image : String?,
            title : String?,
            releaseDate : String?,
            rating : String?,
            popularity : String?,
            description : String?,
            vote : String?,
            year : String?,
            backdrop : String?
        )
        fun setFavorite()
        fun addToFavoriteMovie()
        fun removeToFavoriteMovie()
        fun favoriteState()
    }

    interface PresenterTvshow{
        fun extractData(
            context: Context,
            data : ResponTvShow.Result
        )
        fun insertFavorite(
            context: Context
        )
        fun removeFavorite(
            context: Context
        )
        fun checkFavorite(
            context: Context
        ) : Boolean
    }
}