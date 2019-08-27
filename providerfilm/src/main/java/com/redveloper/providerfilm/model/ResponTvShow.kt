package com.redveloper.providerfilm.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.database.Cursor
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

class ResponTvShow {
    @SerializedName("page")
    @Expose
    var page: Int? = 0
    @SerializedName("total_results")
    @Expose
    var total_results: Int? = 0
    @SerializedName("total_pages")
    @Expose
    var total_pages: Int? = 0
    @SerializedName("results")
    @Expose
    var results: List<ResultTvShow>? = null

    @Entity(tableName = "tvshowdb")
    @Parcelize
    data class ResultTvShow(
        @SerializedName("original_name")
        @Expose
        var orignal_name: String? = null,
        @SerializedName("name")
        @Expose
        var name: String? = null,
        @SerializedName("popularity")
        @Expose
        var popularity: Double? = 0.0,
        @SerializedName("vote_count")
        @Expose
        var vote_count: Int? = 0,
        @SerializedName("first_air_date")
        @Expose
        var first_air_date: String? = null,
        @SerializedName("backdrop_path")
        @Expose
        var backdrop_path: String? = null,
        @SerializedName("original_language")
        @Expose
        var original_language: String? = null,
        @PrimaryKey
        @SerializedName("id")
        @Expose
        var id: Int? = 0,
        @SerializedName("vote_average")
        @Expose
        var vote_average: Double? = 0.0,
        @SerializedName("overview")
        @Expose
        var overview: String? = null,
        @SerializedName("poster_path")
        @Expose
        var poster_path: String? = null
    ) : Parcelable {
        val ORIGINAL_NAME = "original_name"
        val NAME = "name"
        val POPULARITY = "popularity"
        val VOTE_COUNT = "vote_count"
        val FIRST_AIR_DATE = "first_air_date"
        val BACKDROP_PATH = "backdrop_path"
        val ORIGINAL_LANGUANGE = "original_languange"
        val ID = "id"
        val VOTE_AVERAGE = "vote_average"
        val OVERVIEW = "overview"
        val POSTER_PATH = "poster_path"

        constructor(cursor: Cursor) : this() {
            orignal_name = (cursor.getString(cursor.getColumnIndex(ORIGINAL_NAME)))
            name = (cursor.getString(cursor.getColumnIndex(NAME)))
            popularity = (cursor.getDouble(cursor.getColumnIndex(POPULARITY)))
            vote_count = (cursor.getInt(cursor.getColumnIndex(VOTE_COUNT)))
            first_air_date = (cursor.getString(cursor.getColumnIndex(FIRST_AIR_DATE)))
            backdrop_path = (cursor.getString(cursor.getColumnIndex(BACKDROP_PATH)))
            original_language = (cursor.getString(cursor.getColumnIndex(ORIGINAL_LANGUANGE)))
            id = (cursor.getInt(cursor.getColumnIndex(ID)))
            vote_average = (cursor.getDouble(cursor.getColumnIndex(VOTE_AVERAGE)))
            overview = (cursor.getString(cursor.getColumnIndex(OVERVIEW)))
            poster_path = (cursor.getString(cursor.getColumnIndex(POSTER_PATH)))
        }
    }
}