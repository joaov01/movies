package com.example.movies.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.movies.ID_MOVIE
import com.example.movies.R
import com.example.movies.URL_BASE_IMAGE
import com.example.movies.model.DetailsMovie
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details_move.*

class DetailsMoveActivity : AppCompatActivity() {

    private var idMovie = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_move)

        getActionbar()
        verifyHasIntentExtra()
    }

    private fun fillData(movie: DetailsMovie) {
        tvTitle.text = movie.title
        Picasso.get().load(URL_BASE_IMAGE + movie.poster_path).into(ivMovie)
        tvHomePage.text = movie.homepage
        tvOverview.text = movie.overview
    }

    private fun verifyHasIntentExtra() {
        var intent = intent
        if (intent.hasExtra(ID_MOVIE)) {
            idMovie = intent.getIntExtra(ID_MOVIE, 0)
        }
    }

    private fun getActionbar() {
        supportActionBar?.title = getString(R.string.text_movie_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return super.onOptionsItemSelected(item)
    }
}
