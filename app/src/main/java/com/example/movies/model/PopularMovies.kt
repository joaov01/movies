package com.example.movies.model

class PopularMovies(val page: Int,
                    val total_results: Int,
                    val total_pages: Int,
                    val results: List<Movie>)
