package com.redveloper.providerfilm.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.database.Cursor
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
    ) : Parcelable {
        val VOTE_COUNT = "vote_count"
        val ID  = "id"
        val VIDEO = "video"
        val VOTE_AVERAGE = "vote_average"
        val TITLE = "title"
        val POPULARITY = "popularity"
        val POSTER_PATH = "poster_path"
        val ORIGINAL_LANGUANGE = "original_languange"
        val ORIGINAL_TITLE = "original_title"
        val BACKDROP_PATH = "backdrop_path"
        val ADULT = "adult"
        val OVERVIEW = "overview"
        val RELEASE_DATE = "release_date"

        constructor(cursor: Cursor) : this() {
            vote_count = (cursor.getInt(cursor.getColumnIndex(VOTE_COUNT)))
            id = (cursor.getInt(cursor.getColumnIndex(ID)))
            video = (cursor.getString(cursor.getColumnIndex(VIDEO)).toBoolean())
            vote_average = (cursor.getDouble(cursor.getColumnIndex(VOTE_AVERAGE)))
            title = (cursor.getString(cursor.getColumnIndex(TITLE)))
            popularity = (cursor.getDouble(cursor.getColumnIndex(POPULARITY)))
            poster_path = (cursor.getString(cursor.getColumnIndex(POSTER_PATH)))
            original_languange = (cursor.getString(cursor.getColumnIndex(ORIGINAL_LANGUANGE)))
            original_title = (cursor.getString(cursor.getColumnIndex(ORIGINAL_TITLE)))
            backdrop_path = (cursor.getString(cursor.getColumnIndex(BACKDROP_PATH)))
            adult = (cursor.getString(cursor.getColumnIndex(ADULT)).toBoolean())
            overview = (cursor.getString(cursor.getColumnIndex(OVERVIEW)))
            release_date = (cursor.getString(cursor.getColumnIndex(RELEASE_DATE)))
        }
    }
}