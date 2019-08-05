package com.redveloper.filmmadekt.presenter.tvshow

import android.content.Context
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.room.AppDatabase
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow
import com.redveloper.filmmadekt.view.view.DetailView

class DetailTvshowPresenter(val view : DetailView.ViewTvshow) : DetailView.PresenterTvshow{

    private lateinit var dataGlobal : ResponTvShow.Result

    private var idTvshow : Long = 0

    override fun extractData(context: Context, data: ResponTvShow.Result) {
        val image : String? = context.resources.getString(R.string.BASE_IMAGE) + data.poster_path
        val title : String? = data.name.toString()
        val rating : String? = data.vote_average.toString()
        val popularity : String? = data.popularity.toString()
        val description : String? = data.overview.toString()

        view.showData(
            image, title, rating, popularity, description
        )

        this.dataGlobal = data
        idTvshow = data.id.toLong()
    }

    override fun insertFavorite(context: Context) {
        AppDatabase.getInstance(context).tvshowDao().insertTvshow(dataGlobal)
    }

    override fun removeFavorite(context: Context) {
        AppDatabase.getInstance(context).tvshowDao().removeSpecific(idTvshow)
    }

    override fun checkFavorite(context: Context): Boolean {
        return AppDatabase.getInstance(context).tvshowDao().getSelectTvshow(idTvshow) != null
    }
}