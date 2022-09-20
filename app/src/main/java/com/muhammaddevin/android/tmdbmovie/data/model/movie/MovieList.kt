package com.muhammaddevin.android.tmdbmovie.data.model.movie


import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("results")
    val movies: List<Movie?>? = null,
)