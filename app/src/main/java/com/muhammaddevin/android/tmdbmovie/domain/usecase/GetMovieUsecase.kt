package com.muhammaddevin.android.tmdbmovie.domain.usecase

import com.muhammaddevin.android.tmdbmovie.data.model.movie.Movie
import com.muhammaddevin.android.tmdbmovie.domain.repository.MovieRepository

class GetMovieUsecase(private val movieRepository: MovieRepository){
    suspend fun excute() : List<Movie>? = movieRepository.getMovies()
}