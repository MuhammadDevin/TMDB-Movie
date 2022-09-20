package com.muhammaddevin.android.tmdbmovie.domain.repository

import com.muhammaddevin.android.tmdbmovie.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}