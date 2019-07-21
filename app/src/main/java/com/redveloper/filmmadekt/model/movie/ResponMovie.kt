package com.redveloper.filmmadekt.model.movie

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

class ResponMovie {
    @SerializedName("page")
    var page: Int? = 0

    @SerializedName("total_results")
    var total_result: Long? = 0

    @SerializedName("total_page")
    var total_page: Long? = 0

    @SerializedName("results")
    var results: List<ResultMovie>? = null

    @Entity(tableName = "resultmovie")
    @Parcelize
    data class ResultMovie(
        @SerializedName("vote_count")
        var vote_count: Long? = 0,

        @PrimaryKey
        @SerializedName("id")
        var id: Long? = 0,

        @SerializedName("video")
        var video: Boolean? = false,

        @SerializedName("vote_average")
        var vote_average: Double? = 0.0,

        @SerializedName("title")
        var title: String? = null,

        @SerializedName("popularity")
        var popularity: Double? = 0.0,

        @SerializedName("poster_path")
        var poster_path: String? = null,

        @SerializedName("original_languange")
        var original_languange: String? = null,

        @SerializedName("original_title")
        var original_title: String? = null,

        @SerializedName("backdrop_path")
        var backdrop_path: String? = null,

        @SerializedName("adult")
        var adult: Boolean? = false,

        @SerializedName("overview")
        var overview: String? = null,

        @SerializedName("release_date")
        var release_date: String? = null
    ) : Parcelable
}