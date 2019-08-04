package com.redveloper.filmmadekt.model.movie

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

class ResponMovie {
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

    @Entity(tableName = "moviedb")
    @Parcelize
    data class Result(
        @SerializedName("vote_count")
        @Expose
        var vote_count : Int? = 0,
        @PrimaryKey
        @SerializedName("id")
        @Expose
        var id : Int? =0,
        @SerializedName("video")
        @Expose
        var video : Boolean = false,
        @SerializedName("vote_average")
        @Expose
        var vote_average : Double? = 0.0,
        @SerializedName("title")
        @Expose
        var title : String? = null,
        @SerializedName("popularity")
        @Expose
        var popularity : Double? = 0.0,
        @SerializedName("poster_path")
        @Expose
        var poster_path : String? = null,
        @SerializedName("original_languange")
        @Expose
        var original_languange : String? = null,
        @SerializedName("original_title")
        @Expose
        var original_title : String? = null,
        @SerializedName("backdrop_path")
        @Expose
        var backdrop_path : String? = null,
        @SerializedName("adult")
        @Expose
        var adult : Boolean? = false,
        @SerializedName("overview")
        @Expose
        var overview : String? = null,
        @SerializedName("release_date")
        @Expose
        var release_date : String? = null
    ) : Parcelable
}