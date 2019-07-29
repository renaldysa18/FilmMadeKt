package com.redveloper.filmmadekt.model.tvshow

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

class ResponTopRatedTvShow{
    @SerializedName("page")
    @Expose
    var page : Int? = 0
    @SerializedName("total_results")
    @Expose
    var total_results : Int? = 0
    @SerializedName("total_pages")
    @Expose
    var total_pages : Int? = 0
    @SerializedName("results")
    @Expose
    var results : List<Result>? = null

    @Parcelize
    data class Result(
        @SerializedName("original_name")
        @Expose
        val orignal_name : String,
        @SerializedName("genre_ids")
        @Expose
        val genre_ids : List<Int>,
        @SerializedName("name")
        @Expose
        val name : String,
        @SerializedName("popularity")
        @Expose
        val popularity : Double,
        @SerializedName("origin_country")
        @Expose
        val origin_country : List<String>,
        @SerializedName("vote_count")
        @Expose
        val vote_count : Int,
        @SerializedName("first_air_date")
        @Expose
        val first_air_date : String,
        @SerializedName("backdrop_path")
        @Expose
        val backdrop_path : String,
        @SerializedName("original_language")
        @Expose
        val original_language : String,
        @SerializedName("id")
        @Expose
        val id : Int,
        @SerializedName("vote_average")
        @Expose
        val vote_average : Double,
        @SerializedName("overview")
        @Expose
        val overview : String,
        @SerializedName("poster_path")
        @Expose
        val poster_path : String
    ) : Parcelable
}