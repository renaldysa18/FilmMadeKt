package com.redveloper.providerfilm.view

import android.database.Cursor
import com.redveloper.providerfilm.model.ResponMovie
import com.redveloper.providerfilm.model.ResponTvShow

interface MainView{
    interface ViewMovie{
        fun showData(data: ArrayList<ResponMovie.ResultMovie>)
        fun noData()
        fun showShimmer()
        fun hideShimmer()
        fun showMessage(msg : String)
    }

    interface ViewTvShow{
        fun showData(data: ArrayList<ResponTvShow.ResultTvShow>)
        fun noData()
        fun showShimmer()
        fun hideShimmer()
        fun showMessage(msg : String)
    }

    interface PresenterMovie{
        fun getDataMovie()
        fun convertData(cursor: Cursor) : ArrayList<ResponMovie.ResultMovie>
    }
    interface PresenterTvShow{
        fun getDataTvShow()
        fun convertData(cursor: Cursor) : ArrayList<ResponTvShow.ResultTvShow>
    }
}