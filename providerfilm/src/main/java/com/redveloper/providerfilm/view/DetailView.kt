package com.redveloper.providerfilm.view

import android.content.Context
import com.redveloper.providerfilm.model.ResponMovie

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
}