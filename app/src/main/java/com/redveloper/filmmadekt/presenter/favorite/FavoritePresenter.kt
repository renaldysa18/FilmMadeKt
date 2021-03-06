package com.redveloper.filmmadekt.presenter.favorite

import android.content.Context
import android.content.Intent
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.room.AppDatabase
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow
import com.redveloper.filmmadekt.utils.Constant
import com.redveloper.filmmadekt.view.ui.activity.movie.MovieDetailActivity
import com.redveloper.filmmadekt.view.ui.activity.tvshow.TvshowDetailActivity
import com.redveloper.filmmadekt.view.view.FavoriteView

class FavoritePresenter : FavoriteView.Presenter{

    private var movieResult : List<ResponMovie.ResultMovie>? = ArrayList()
    private var tvResult : List<ResponTvShow.ResultTvShow>? = ArrayList()

    override fun getFavoriteMovie(context: Context) : List<ResponMovie.ResultMovie> {
        val data = AppDatabase.getInstance(context).movieDao().getAllMovie()
        if(!data.isNullOrEmpty()){
            this.movieResult = data

            return data
        } else {
            return ArrayList()
        }
    }

    override fun toDetailMovie(context: Context, data: ResponMovie.ResultMovie) {
        val intent : Intent = Intent(context, MovieDetailActivity::class.java)
        intent.putExtra(Constant.dataMovie, data)
        context.startActivity(intent)
    }

    override fun getFavoriteTvShow(context: Context) : List<ResponTvShow.ResultTvShow> {
        val data = AppDatabase.getInstance(context).tvshowDao().getAllTvshow()
        if(!data.isNullOrEmpty()){
            this.tvResult = data

            return data
        } else {
            return ArrayList()
        }
    }

    override fun toDetailTvShow(context: Context, data: ResponTvShow.ResultTvShow) {
        val intent = Intent(context, TvshowDetailActivity::class.java)
        intent.putExtra(Constant.dataTvShow, data)
        context.startActivity(intent)
    }
}