package com.redveloper.filmmadekt.view.ui.fragment.movie.comingsoon


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
import com.redveloper.filmmadekt.model.movie.ResponUpComingMovie
import com.redveloper.filmmadekt.presenter.movie.UpComingMoviePresenter
import com.redveloper.filmmadekt.view.view.MovieView
import kotlinx.android.synthetic.main.fragment_movie_coming_soon.view.*

class MovieComingSoonFragment : Fragment(), MovieView.UpComing {
    private lateinit var presenter : UpComingMoviePresenter
    private lateinit var adapter : AdapterUpComingMovie

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_coming_soon, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = UpComingMoviePresenter(this)
        CallUpComingMovie()
    }

    override fun CallUpComingMovie() {
        context?.resources?.getString(R.string.API_KEY)?.let {
            presenter.getUpComingMovie(
                it,
                "en-US",
                1
            )
        }
    }

    override fun showData(data: List<ResponUpComingMovie.Result>?) {
        val layoutManager: CarouselLayoutManager = CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL, true)
        layoutManager.setPostLayoutListener(CarouselZoomPostLayoutListener())
        view?.recyclerview_movie_comingsoon?.layoutManager = layoutManager
        view?.recyclerview_movie_comingsoon?.setHasFixedSize(true)

        adapter = AdapterUpComingMovie(data)

        view?.recyclerview_movie_comingsoon?.adapter = adapter
        view?.recyclerview_movie_comingsoon?.addOnScrollListener(CenterScrollListener())
    }

    override fun showMessage(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}
