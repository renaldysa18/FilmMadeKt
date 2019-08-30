package com.redveloper.providerfilm.view

import android.content.Context
import com.redveloper.providerfilm.model.ResponMovie
import com.redveloper.providerfilm.model.ResponTvShow

interface DetailView{
    interface ViewMovie{
        fun getData()
        fun showData(
            image : String?,
            title : String?,
            releaseDate : String?,
            rating : String?,
            popularity : String?,
            description : String?
        )
    }

    interface PresenterMovie{
        fun extractData(
            context: Context,
            data: ResponMovie.ResultMovie
        )
    }

    interface ViewTvShow{
        fun getData()
        fun showData(
            image : String?,
            title : String?,
            releaseDate : String?,
            rating : String?,
            popularity : String?,
            description : String?
        )
    }

    interface PresenterTvShow{
        fun extractData(
            context: Context,
            data: ResponTvShow.ResultTvShow
        )
    }
}