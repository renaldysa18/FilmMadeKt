package com.redveloper.providerfilm.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieData(
    var vote_count: Int? = 0,
    var id: Int? = 0,
    var video: Boolean = false,
    var vote_average: Double? = 0.0,
    var title: String? = null,
    var popularity: Double? = 0.0,
    var poster_path: String? = null,
    var original_languange: String? = null,
    var original_title: String? = null,
    var backdrop_path: String? = null,
    var adult: Boolean? = false,
    var overview: String? = null,
    var release_date: String? = null
) : Parcelable