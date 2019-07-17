package com.redveloper.filmmadekt.model.room

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.redveloper.filmmadekt.model.movie.ResponMovie

@Entity
class MovieEntities{

    @PrimaryKey(autoGenerate = true)
    var id : Int = 0

    @ColumnInfo(name = "movieId")
    var movieId : String? = null

    @ColumnInfo(name = "dataMovie")
    var dataMovie : ResponMovie.ResultMovie? = null
}