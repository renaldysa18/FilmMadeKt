package com.redveloper.filmmadekt.model.tvshow

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.content.ContentValues
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
    var results : List<ResultTvShow>? = null

    @Entity(tableName = "tvshowdb")
    @Parcelize
    data class ResultTvShow(
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
    ) : Parcelable{
        fun contentValue() : ContentValues{
            var contentValues = ContentValues()
            contentValues.put("original_name", orignal_name)
            contentValues.put("name", name)
            contentValues.put("popularity", popularity)
            contentValues.put("vote_count", vote_count)
            contentValues.put("first_air_date", first_air_date)
            contentValues.put("backdrop_path", backdrop_path)
            contentValues.put("original_languange", original_language)
            contentValues.put("id", id)
            contentValues.put("vote_average", vote_average)
            contentValues.put("overview", overview)
            contentValues.put("poster_path", poster_path)
            return contentValues
        }
    }
}