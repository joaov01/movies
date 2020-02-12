package com.example.movies.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.movies.R
import com.example.movies.adapter.PopularMoviesAdapter
import com.example.movies.model.PopularMovies
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getActionbar()
     }

    private fun populateAdapter(it: PopularMovies) {
        rvMovies.adapter = PopularMoviesAdapter(it, this)
        rvMovies.layoutManager = GridLayoutManager(this, 2)
    }

    private fun getActionbar() {
        supportActionBar?.title= getString(R.string.text_title_actionbar_main_activity)
    }
}
