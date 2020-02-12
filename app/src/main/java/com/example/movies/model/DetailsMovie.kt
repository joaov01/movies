package com.example.movies.model

class DetailsMovie (val adult: Boolean,
                    val backdrop_path: String,
                    val budget: Int,
                    val genres: List<Genre>,
                    val homepage: String,
                    val original_title: String,
                    val overview: String,
                    val title: String,
                    val tagline: String,
                    val vote_average: Double,
                    val vote_count: Int,
                    val revenue: Int,
                    val release_date: String,
                    val poster_path: String)