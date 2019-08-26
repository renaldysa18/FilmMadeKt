package com.redveloper.providerfilm.model

import android.database.Cursor
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize



@Parcelize
data class MovieData(
    var vote_count: Int? = 0,
    var id: Int? = 0,
    var video: Boolean = false,
    var vote_average: Double? = 0.0,
    var title: String? = null,
    var popularity: Double? = 0.0,
    var poster_path: String? = null,
    var original_languange: String? = null,
    var original_title: String? = null,
    var backdrop_path: String? = null,
    var adult: Boolean? = false,
    var overview: String? = null,
    var release_date: String? = null

) : Parcelable {
    val VOTE_COUNT = "VOTE_COUNT"
    val ID  = "ID"
    val VIDEO = "VIDEO"
    val VOTE_AVERAGE = "VOTE_AVERAGE"
    val TITLE = "TITLE"
    val POPULARITY = "POPULARITY"
    val POSTER_PATH = "POSTER_PATH"
    val ORIGINAL_LANGUANGE = "ORIGINAL_LANGUANGE"
    val ORIGINAL_TITLE = "ORIGINAL_TITLE"
    val BACKDROP_PATH = "BACKDROP_PATH"
    val ADULT = "ADULT"
    val OVERVIEW = "OVERVIEW"
    val RELEASE_DATE = "RELEASE_DATE"

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