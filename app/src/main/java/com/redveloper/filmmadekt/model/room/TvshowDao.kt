package com.redveloper.filmmadekt.model.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.redveloper.filmmadekt.model.tvshow.ResponTvshow

@Dao
interface TvshowDao{
    @Insert
    fun insertTvshow(data : ResponTvshow.ResultTvShow)

    @Query("SELECT * FROM tvshowdb")
    fun getAllTvshow() : ResponTvshow.ResultTvShow

    @Query("SELECT * FROM tvshowdb WHERE id == :id")
    fun getSelectTvshow(id : Long) : ResponTvshow.ResultTvShow

    @Query("DELETE FROM tvshowdb WHERE id == :id")
    fun removeSpecific(id : Long)
}