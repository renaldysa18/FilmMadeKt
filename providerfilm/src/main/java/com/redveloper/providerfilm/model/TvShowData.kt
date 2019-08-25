package com.redveloper.providerfilm.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShowData(
    val orignal_name : String,
    val name : String,
    val popularity : Double,
    val vote_count : Int,
    val first_air_date : String,
    val backdrop_path : String,
    val original_language : String,
    val id : Int,
    val vote_average : Double,
    val overview : String,
    val poster_path : String
) : Parcelable