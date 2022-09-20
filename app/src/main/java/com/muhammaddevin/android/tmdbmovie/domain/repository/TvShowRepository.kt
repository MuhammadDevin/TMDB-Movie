package com.muhammaddevin.android.tmdbmovie.domain.repository

import com.muhammaddevin.android.tmdbmovie.data.model.tv.TvShow

interface TvShowRepository {
    suspend fun getTvShows(): List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?
}