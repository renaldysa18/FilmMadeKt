package com.redveloper.filmmadekt.view.view

import android.content.Context
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow

interface FavoriteView{
    interface Presenter{
        fun getFavoriteMovie(context: Context) : List<ResponMovie.Result>
        fun toDetailMovie(context: Context, data : ResponMovie.Result)
        fun getFavoriteTvShow(context: Context) : List<ResponTvShow.Result>
        fun toDetailTvShow(context: Context, data : ResponTvShow.Result)
    }
    interface View{
        fun listFavoriteMovie(data : List<ResponMovie.Result>?)
        fun listFavoriteTvshow(data : List<ResponTvShow.Result>?)

    }
}