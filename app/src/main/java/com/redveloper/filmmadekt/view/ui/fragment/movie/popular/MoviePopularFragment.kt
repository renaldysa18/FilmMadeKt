package com.redveloper.filmmadekt.view.ui.fragment.movie.popular


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.azoft.carousellayoutmanager.CarouselLayoutManager
import com.azoft.carousellayoutmanager.CarouselZoomPostLayoutListener
import com.azoft.carousellayoutmanager.CenterScrollListener

import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponPopularMovie
import com.redveloper.filmmadekt.presenter.movie.PopularMoviePresenter
import com.redveloper.filmmadekt.view.view.MovieView
import kotlinx.android.synthetic.main.fragment_movie_popular.view.*

class MoviePopularFragment : Fragment(), MovieView.Popular {

    private lateinit var presenter : PopularMoviePresenter
    private lateinit var adapter : AdapterPopularMovie

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_popular, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = PopularMoviePresenter(this)
        CallPopularMovie()

    }

    override fun CallPopularMovie() {
        context?.resources?.getString(R.string.API_KEY)?.let {
            presenter.getPopularMovie(
                it,"en-US", 1
            )
        }
    }

    override fun showData(data: List<ResponPopularMovie.Result>?) {
        val layoutManager: CarouselLayoutManager = CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL, true)
        layoutManager.setPostLayoutListener(CarouselZoomPostLayoutListener())
        view?.recyclerview_movie_popular?.layoutManager = layoutManager
        view?.recyclerview_movie_popular?.setHasFixedSize(true)

        adapter = AdapterPopularMovie(data)

        view?.recyclerview_movie_popular?.adapter = adapter
        view?.recyclerview_movie_popular?.addOnScrollListener(CenterScrollListener())

    }

    override fun showMessage(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}
