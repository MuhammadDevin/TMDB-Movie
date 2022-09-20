package com.muhammaddevin.android.tmdbmovie.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.muhammaddevin.android.tmdbmovie.data.model.artist.Artist
import com.muhammaddevin.android.tmdbmovie.data.model.movie.Movie

@Database(entities = [Movie::class, TvShowDao::class, Artist::class],
    version = 1,
    exportSchema = false
)

abstract class TMDBDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao
    abstract fun tvShowDao(): TvShowDao
    abstract fun artistDao(): ArtistDao

}