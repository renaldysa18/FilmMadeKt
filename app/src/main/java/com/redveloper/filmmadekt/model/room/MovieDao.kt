package com.redveloper.filmmadekt.model.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.redveloper.filmmadekt.model.movie.ResponMovie

@Dao
interface MovieDao{
    @Insert
    fun insertMovie(data : ResponMovie.ResultMovie)

    @Query("SELECT * FROM movieentities")
    fun getAllMovie()
}