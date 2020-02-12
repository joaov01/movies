package com.example.movies.repository

import com.example.movies.API_KEY
import com.example.movies.LANGUAGE
import com.example.movies.PAGE
import com.example.movies.model.DetailsMovie
import com.example.movies.model.PopularMovies
import com.example.movies.service.ApiContract
import com.example.movies.service.retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    private val service = retrofit.create<ApiContract>(ApiContract::class.java)


    fun getPopularMovies(){
        val popularMovies = service.getPopularMovies(API_KEY ,LANGUAGE, PAGE)
        popularMovies.enqueue(object: Callback<PopularMovies>{
            override fun onFailure(call: Call<PopularMovies>, t: Throwable) {

            }

            override fun onResponse(call: Call<PopularMovies>, response: Response<PopularMovies>) {

            }
        })
    }

    fun getDetails(id: Int){
        val detailsMovie = service.getDetails(id, API_KEY, LANGUAGE)
        detailsMovie.enqueue(object : Callback<DetailsMovie>{
            override fun onFailure(call: Call<DetailsMovie>, t: Throwable) {
            }

            override fun onResponse(call: Call<DetailsMovie>, response: Response<DetailsMovie>) {

            }

        })
    }
}