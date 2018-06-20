package com.example.aissaouiilhem.cinemanews.feed

import com.example.aissaouiilhem.cinemanews.data.Movie
import com.example.aissaouiilhem.cinemanews.data.PosterConfiguration
import rx.Subscriber

class MovieListSubscriber(val view: MovieListView,
                          val posterConfiguration: PosterConfiguration) : Subscriber<Movie>() {

    override fun onCompleted() {
        view.hideProgress()
        val page = view.getPage() + 1
        view.setPage(page)
    }

    override fun onError(e: Throwable?) {
        view.hideProgress()
    }

    override fun onNext(t: Movie?) {
        t?.posterConfiguration = posterConfiguration
        view.showMovie(t as Movie)
    }
}