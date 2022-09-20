package com.muhammaddevin.android.tmdbmovie.domain.usecase

import com.muhammaddevin.android.tmdbmovie.data.model.artist.Artist
import com.muhammaddevin.android.tmdbmovie.domain.repository.ArtistRepository

class UpdateArtistUsecase (private val artistRepository: ArtistRepository) {
    suspend fun excute(): List<Artist>? = artistRepository.updateArtists()

}