package com.example.movies.service

import com.example.movies.model.DetailsMovie
import com.example.movies.model.PopularMovies
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiContract {

    @GET("movie/popular")
    fun getPopularMovies(@Query("api_key") apiKey: String,
                         @Query("language") language: String,
                         @Query("page") page: Int): Call<PopularMovies>

    @GET("movie/{movie_id}")
    fun getDetails(@Path("movie_id") movieId: Int,
                   @Query("api_key") apiKey: String,
                   @Query("language") language: String): Call<DetailsMovie>
}