package com.muhammaddevin.android.tmdbmovie.data.model.artist


import com.google.gson.annotations.SerializedName

// untuk get responnya
data class ArtistList(
    @SerializedName("results")
    val artist: List<Artist?>? = null,
)