package com.muhammaddevin.android.tmdbmovie.domain.usecase

import com.muhammaddevin.android.tmdbmovie.data.model.tv.TvShow
import com.muhammaddevin.android.tmdbmovie.domain.repository.TvShowRepository

class GetTvShowUsecase(private val tvShowRepository: TvShowRepository) {
    suspend fun excute(): List<TvShow>? = tvShowRepository.getTvShows()
}