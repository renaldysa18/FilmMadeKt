package com.redveloper.filmmadekt.model.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.redveloper.filmmadekt.model.movie.ResponMovie

@Database(entities = [(ResponMovie.ResultMovie::class)], version = 5, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao

    companion object {
        private var instance: AppDatabase? = null

        @Synchronized
        fun getInstance(context: Context): AppDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "favorite")
                    .allowMainThreadQueries()
                    .build()
            }
            return instance!!
        }
    }
}