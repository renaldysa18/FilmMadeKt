package com.redveloper.filmmadekt.presenter.movie

import android.content.Context
import android.content.Intent
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.room.AppDatabase
import com.redveloper.filmmadekt.view.ui.activity.movie.MovieDetail
import com.redveloper.filmmadekt.view.view.MainView

class FavoriteMoviePresenter(val view: MainView.MovieView) : MainView.MovieFavoritePresenter {

    private var result : ArrayList<ResponMovie.ResultMovie>? = null

    override fun getFavoriteMovie(context: Context) {
        view.showShimemr()
        val data = AppDatabase.getInstance(context).movieDao().getAllMovie()
        if ( data != null  && data.isNotEmpty() ) {
            view.showData(data as ArrayList<ResponMovie.ResultMovie>)
            //init data
            this.result = data
        } else {
            view.hideShimmer()
            view.makeToast("Data Kosong")
        }
    }

    override fun toDetailMovie(context: Context, pos: Int) {
        val set : Intent = Intent(context, MovieDetail::class.java)
        set.putExtra("Data", result?.get(pos))
        context.startActivity(set)
    }
}