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
        var original_name : String? = null,
        @SerializedName("name")
        @Expose
        var name : String? = null,
        @SerializedName("popularity")
        @Expose
        var popularity : Double? = null,
        @SerializedName("vote_count")
        @Expose
        var vote_count : Int? = 0,
        @SerializedName("first_air_date")
        @Expose
        var first_air_date : String? = null,
        @SerializedName("backdrop_path")
        @Expose
        var backdrop_path : String? = null,
        @SerializedName("original_language")
        @Expose
        var original_language : String? = null,
        @PrimaryKey
        @SerializedName("id")
        @Expose
        var id : Int? = 0,
        @SerializedName("vote_average")
        @Expose
        var vote_average : Double? = 0.0,
        @SerializedName("overview")
        @Expose
        var overview : String?= null,
        @SerializedName("poster_path")
        @Expose
        var poster_path : String? = null
    ) : Parcelable{
        fun contentValue() : ContentValues{
            var contentValues = ContentValues()
            contentValues.put("original_name", original_name)
            contentValues.put("name", name)
            contentValues.put("popularity", popularity)
            contentValues.put("vote_count", vote_count)
            contentValues.put("first_air_date", first_air_date)
            contentValues.put("backdrop_path", backdrop_path)
            contentValues.put("original_language", original_language)
            contentValues.put("id", id)
            contentValues.put("vote_average", vote_average)
            contentValues.put("overview", overview)
            contentValues.put("poster_path", poster_path)
            return contentValues
        }
    }
}