package com.redveloper.filmmadekt.model.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.redveloper.filmmadekt.model.tvshow.ResponPopularTvshow

@Dao
interface TvshowDao{
    @Insert
    fun insertTvshow(data : ResponPopularTvshow.ResultTvShow)

    @Query("SELECT * FROM tvshowdb")
    fun getAllTvshow() : List<ResponPopularTvshow.ResultTvShow>

    @Query("SELECT * FROM tvshowdb WHERE id == :id")
    fun getSelectTvshow(id : Long) : ResponPopularTvshow.ResultTvShow

    @Query("DELETE FROM tvshowdb WHERE id == :id")
    fun removeSpecific(id : Long)
}