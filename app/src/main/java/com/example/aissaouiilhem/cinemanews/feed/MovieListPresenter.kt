package com.example.aissaouiilhem.cinemanews.feed

interface MovieListPresenter {
    fun presentMovies()
    fun refresh()
    fun search()
    fun stop()
    fun presentMore()
}
