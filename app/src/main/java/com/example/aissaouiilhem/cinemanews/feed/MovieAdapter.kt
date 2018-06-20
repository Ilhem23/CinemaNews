package com.example.aissaouiilhem.cinemanews.feed

import android.view.ViewGroup
import com.example.aissaouiilhem.cinemanews.data.Movie

class MovieAdapter : android.support.v7.widget.RecyclerView.Adapter<MovieViewHolder>() {

    val data = java.util.Vector<Movie>()
    val movieClickListener:  com.example.aissaouiilhem.cinemanews.feed.MovieAdapter.MovieClickListener? = null

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = android.view.LayoutInflater.from(parent?.context)
        val view = inflater.inflate( com.example.aissaouiilhem.cinemanews.R.layout.view_movie, parent, false)

        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = data.get(position)

        holder?.bind(movie, movieClickListener)
    }

    fun addMovie(movie:  com.example.aissaouiilhem.cinemanews.data.Movie) {
        data.add(movie)
        notifyItemInserted(data.size -1)
    }

    interface MovieClickListener {
        fun onMovieClick(m:  com.example.aissaouiilhem.cinemanews.data.Movie)
    }

    fun clear() {
        data.clear()
        notifyDataSetChanged()
    }
}


