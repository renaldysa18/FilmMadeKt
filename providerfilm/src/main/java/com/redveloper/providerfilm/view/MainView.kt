package com.redveloper.providerfilm.view

import android.database.Cursor
import com.redveloper.providerfilm.model.MovieData

interface MainView{
    interface ViewMovie{
        fun showData(data : ArrayList<MovieData>)
        fun noData()
        fun showShimmer()
        fun hideShimmer()
        fun showMessage(msg : String)
    }

    interface ViewTvShow{

    }

    interface PresenterMovie{
        fun getDataMovie()
        fun convertData(cursor: Cursor) : ArrayList<MovieData>
    }
    interface PresenterTvShow{

    }
}