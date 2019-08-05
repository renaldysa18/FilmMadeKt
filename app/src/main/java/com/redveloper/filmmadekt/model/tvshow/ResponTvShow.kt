package com.redveloper.filmmadekt.model.tvshow

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

class ResponTvShow{
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

    @Entity(tableName = "tvshowdb")
    @Parcelize
    data class Result(
        @SerializedName("original_name")
        @Expose
        val orignal_name : String,
        @SerializedName("name")
        @Expose
        val name : String,
        @SerializedName("popularity")
        @Expose
        val popularity : Double,
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
        @PrimaryKey
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