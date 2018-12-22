package com.example.darfe.movies.data.api

import com.example.darfe.movies.data.models.Movie
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("movie/now_playing")
    fun getMovies(
        @Query("api_key") apiKey: String,
        @Query("language") l: String
    ):Deferred<Results>

}

class Results(val results:List<Movie>)