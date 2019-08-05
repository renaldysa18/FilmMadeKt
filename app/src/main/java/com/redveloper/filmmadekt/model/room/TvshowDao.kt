package com.redveloper.filmmadekt.model.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow

@Dao
interface TvshowDao{
    @Insert
    fun insertTvshow(data : ResponTvShow.Result)

    @Query("SELECT * FROM tvshowdb")
    fun getAllTvshow() : List<ResponTvShow.Result>

    @Query("SELECT * FROM tvshowdb WHERE id == :id")
    fun getSelectTvshow(id : Long) : ResponTvShow.Result

    @Query("DELETE FROM tvshowdb WHERE id == :id")
    fun removeSpecific(id : Long)
}