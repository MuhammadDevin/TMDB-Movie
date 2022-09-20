package com.muhammaddevin.android.tmdbmovie.data.model.tv


import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("page")
    val page: Int? = null,
    @SerializedName("results")
    val tvShows: List<TvShow?>? = null,
    @SerializedName("total_pages")
    val totalPages: Int? = null,
    @SerializedName("total_results")
    val totalResults: Int? = null
)