package com.redveloper.filmmadekt.presenter.tvshow

import android.content.Context
import android.content.Intent
import com.redveloper.filmmadekt.model.room.AppDatabase
import com.redveloper.filmmadekt.model.tvshow.ResponTvshow
import com.redveloper.filmmadekt.view.ui.activity.tvshow.TvshowDetail
import com.redveloper.filmmadekt.view.view.MainView

class FavoriteTvshowPresenter(val view: MainView.TvshowView) : MainView.TvshowFavortePresenter {
    private var result: ArrayList<ResponTvshow.ResultTvShow>? = null

    override fun getFavoriteTvshow(context: Context) {
        view.showShimmer()
        val data: ArrayList<ResponTvshow.ResultTvShow> =
            AppDatabase.getInstance(context).tvshowDao().getAllTvshow() as ArrayList<ResponTvshow.ResultTvShow>
        if (data != null && data.isNotEmpty()) {
            view.showData(data)
            //init
            this.result = data
        } else {
            view.hideShimmer()
            view.makeToast("Data Kosong")
        }
    }

    override fun toDetailTvshow(context: Context, pos: Int) {
        val set : Intent = Intent(context, TvshowDetail::class.java)
        set.putExtra("Data", result?.get(pos))
        context.startActivity(set)
    }
}