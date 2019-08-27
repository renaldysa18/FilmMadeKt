package com.redveloper.filmmadekt.view.view

import android.content.Context
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow

interface FavoriteView{
    interface Presenter{
        fun getFavoriteMovie(context: Context) : List<ResponMovie.ResultMovie>
        fun toDetailMovie(context: Context, data : ResponMovie.ResultMovie)
        fun getFavoriteTvShow(context: Context) : List<ResponTvShow.ResultTvShow>
        fun toDetailTvShow(context: Context, data : ResponTvShow.ResultTvShow)
    }
    interface View{
        fun listFavoriteMovie(data : List<ResponMovie.ResultMovie>?)
        fun listFavoriteTvshow(data : List<ResponTvShow.ResultTvShow>?)

    }
}