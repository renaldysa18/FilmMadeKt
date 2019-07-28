package com.redveloper.filmmadekt.model.movie

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

class ResponNowPlayingMovie {
    @SerializedName("results")
    @Expose
    var results: List<Result>? = null
    @SerializedName("page")
    @Expose
    var page: Int? = 0
    @SerializedName("total_results")
    @Expose
    var total_results: Int? = 0
    @SerializedName("dates")
    @Expose
    var dates: Dates? = null
    @SerializedName("total_pages")
    @Expose
    var total_pages: Int? = 0

    inner class Dates{
        @SerializedName("maximum")
        @Expose
        var maximum : String? = null
        @SerializedName("minimum")
        @Expose
        var minimum : String? = null
    }

    @Parcelize
    data class Result(
        @SerializedName("vote_count")
        @Expose
        val vote_count : Int? = 0,
        @SerializedName("id")
        @Expose
        val id : Int? =0,
        @SerializedName("video")
        @Expose
        val video : Boolean = false,
        @SerializedName("vote_average")
        @Expose
        val vote_average : Double? = 0.0,
        @SerializedName("title")
        @Expose
        val title : String? = null,
        @SerializedName("popularity")
        @Expose
        val popularity : Double? = 0.0,
        @SerializedName("poster_path")
        @Expose
        val poster_path : String? = null,
        @SerializedName("original_path")
        @Expose
        val original_path : String? = null,
        @SerializedName("original_title")
        @Expose
        val original_title : String? = null,
        @SerializedName("genre_ids")
        @Expose
        val genre_ids : List<Int>? = null,
        @SerializedName("backdrop_path")
        @Expose
        val backdrop_path : String? = null,
        @SerializedName("adult")
        @Expose
        val adult : Boolean? = false,
        @SerializedName("overview")
        @Expose
        val overview : String? = null,
        @SerializedName("release_date")
        @Expose
        val release_date : String? = null
    ) : Parcelable
}