package com.redveloper.filmmadekt.model.tvshow

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

class ResponPopularTvshow {
    @SerializedName("page")
    var page: Int? = 0
    @SerializedName("total_results")
    var total_results: Long? = 0
    @SerializedName("total_pages")
    var total_pages: Long? = 0
    @SerializedName("results")
    var results: List<ResultTvShow>? = null

    @Entity(tableName = "tvshowdb")
    @Parcelize
    data class ResultTvShow(
        @SerializedName("original_name")
        var original_name: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("popularity")
        var popularity: Double? = 0.0,
        @SerializedName("vote_count")
        var vote_count: Long? = 0,
        @SerializedName("first_air_date")
        var first_air_date: String? = null,
        @SerializedName("backdrop_path")
        var backdrop_path: String? = null,
        @SerializedName("original_languange")
        var original_languange: String? = null,
        @PrimaryKey
        @SerializedName("id")
        var id: Long? = 0,
        @SerializedName("vote_average")
        var vote_average: Double? = 0.0,
        @SerializedName("overview")
        var overview: String? = null,
        @SerializedName("poster_path")
        var poster_path: String? = null
        ) : Parcelable
}