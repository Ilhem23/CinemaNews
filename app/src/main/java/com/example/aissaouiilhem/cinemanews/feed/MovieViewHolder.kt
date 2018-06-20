package com.example.aissaouiilhem.cinemanews.feed

import com.example.aissaouiilhem.cinemanews.R

class MovieViewHolder(view: android.view.View) : android.support.v7.widget.RecyclerView.ViewHolder(view) {

    val dateFormat = java.text.SimpleDateFormat("yyyy-MM-dd")
    val yearFormat = java.text.SimpleDateFormat("yyyy")

    val textTitle: android.widget.TextView = view.findViewById(com.example.aissaouiilhem.cinemanews.R.id.text_title_movie)
    val imagePoster: android.widget.ImageView = view.findViewById(com.example.aissaouiilhem.cinemanews.R.id.image_poster_movie)
    val textRelease: android.widget.TextView = view.findViewById(com.example.aissaouiilhem.cinemanews.R.id.text_release_movie)
    val textOverview: android.widget.TextView = view.findViewById(com.example.aissaouiilhem.cinemanews.R.id.text_overview_movie)

    fun bind(movie: com.example.aissaouiilhem.cinemanews.data.Movie, movieClickListener: MovieAdapter.MovieClickListener?) {

        textTitle.text = movie.title
        textTitle.setOnClickListener { movieClickListener?.onMovieClick(movie) }

        textOverview.text = movie.overview

        if(!movie.release.isEmpty()) {
            val date = dateFormat.parse(movie.release)
            textRelease.text = yearFormat.format(date)
        } else {
            textRelease.text = textRelease.context.getString(com.example.aissaouiilhem.cinemanews.R.string.unknown)
        }

        if(movie.posterConfiguration != null ){

            var iSize = movie.posterConfiguration?.sizes?.indexOf(com.example.aissaouiilhem.cinemanews.feed.MovieViewHolder.Companion.W342)

            if(iSize == -1)
                iSize = 0

            val size = movie.posterConfiguration?.sizes?.get(iSize as Int)
            val baseUrl = movie.posterConfiguration?.baseUrl

            val url = "$baseUrl/$size/${movie.poster}"

            com.squareup.picasso.Picasso.with(imagePoster.context)
                    .load(url)
                    .into(imagePoster)

            imagePoster.visibility = android.view.View.VISIBLE

        } else {
            imagePoster.visibility = android.view.View.GONE
        }
    }

    companion object {
        val W342 = "w342"
    }
}