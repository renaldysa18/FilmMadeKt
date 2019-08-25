package com.redveloper.filmmadekt.model.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.database.Cursor
import com.redveloper.filmmadekt.model.movie.ResponMovie

@Dao
interface MovieDao{
    @Insert
    fun insertMovie(data : ResponMovie.Result)

    @Query("SELECT * FROM moviedb")
    fun getAllMovie() : List<ResponMovie.Result>

    @Query("SELECT * FROM moviedb WHERE id == :id")
    fun getSelectMovie(id : Long) : ResponMovie.Result

    @Query("DELETE FROM moviedb WHERE id == :id")
    fun removeSpecific(id : Long)

    @Query("SELECT * FROM moviedb")
    fun getAllMovieCursor() : Cursor
}