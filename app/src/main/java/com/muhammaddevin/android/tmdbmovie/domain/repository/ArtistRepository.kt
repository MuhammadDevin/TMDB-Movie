package com.muhammaddevin.android.tmdbmovie.domain.repository

import com.muhammaddevin.android.tmdbmovie.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}