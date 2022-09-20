package com.muhammaddevin.android.tmdbmovie.data.model.tv


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "popular_tvShows")
data class TvShow(
    @SerializedName("first_air_date")
    val firstAirDate: String? = null,

    @PrimaryKey
    @SerializedName("id")
    val id: Int? = null,

    @SerializedName("name")
    val name: String? = null,
    @SerializedName("overview")
    val overview: String? = null,
    @SerializedName("poster_path")
    val posterPath: String? = null,
)