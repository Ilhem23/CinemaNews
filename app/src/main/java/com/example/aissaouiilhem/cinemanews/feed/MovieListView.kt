package com.example.aissaouiilhem.cinemanews.feed

import com.example.aissaouiilhem.cinemanews.data.Movie

interface MovieListView {
    fun showMovie(movie: com.example.aissaouiilhem.cinemanews.data.Movie)
    fun getPage() : Int
    fun setPage(page: Int)
    fun hideProgress()
    fun clearMovieList()
    fun getQuery() : String
    fun isProgressVisible() : Boolean
    fun showProgress()
    fun showEnableNetworksDialog()
    fun isNetworksEnabled(): Boolean
}
