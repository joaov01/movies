package com.example.movies.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.ID_MOVIE
import com.example.movies.R
import com.example.movies.URL_BASE_IMAGE
import com.example.movies.model.PopularMovies
import com.example.movies.ui.DetailsMoveActivity
import com.squareup.picasso.Picasso

class PopularMoviesAdapter(private val popularMovies: PopularMovies,
                           private val contex: Context):
    RecyclerView.Adapter<PopularMoviesAdapter.ViewHolderMovies>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMovies {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.movie_item_list_layout, parent, false)
        return ViewHolderMovies(v)
    }

    override fun getItemCount(): Int {
        return popularMovies.results.size
    }

    override fun onBindViewHolder(holder: ViewHolderMovies, position: Int) {
            val movie = popularMovies.results[position]
            holder.title.text = movie.title
            val urlImage = URL_BASE_IMAGE + movie.poster_path
            Picasso.get().load(urlImage).into(holder.image)
            holder.llMain.setOnClickListener{
                val intent = Intent(contex, DetailsMoveActivity::class.java)
                intent.putExtra(ID_MOVIE, movie.id)
                contex.startActivity(intent)
            }
    }

    class ViewHolderMovies(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title:TextView = itemView.findViewById(R.id.tvTitle)
        var image:ImageView = itemView.findViewById(R.id.ivMovie)
        var llMain: LinearLayout = itemView.findViewById(R.id.llMain)
    }
}
