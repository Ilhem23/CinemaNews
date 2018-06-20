package com.example.aissaouiilhem.cinemanews.data

import rx.Observable

interface MovieService {
    fun getMovies(page: Int) : Observable<Movie>
    fun search(q: String, page:Int) : Observable<Movie>
}