package com.redveloper.filmmadekt.view.ui.fragment.movie


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast

import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.presenter.movie.MoviePresenter
import com.redveloper.filmmadekt.view.ui.activity.movie.MovieDetail
import com.redveloper.filmmadekt.view.view.MainView
import kotlinx.android.synthetic.main.fragment_movie.view.*

class MovieFragment : Fragment(), MainView.MovieView, MovieAdapter.OnItemClickListener {


    private lateinit var adapter: MovieAdapter
    private lateinit var presenter : MoviePresenter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.recyclerview_movie.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
        presenter = MoviePresenter(this)
        callMovie()
    }

    override fun callMovie() {
        presenter.getMoview(
            resources.getString(R.string.API_KEY), "2019-05-25", "2109-06-25"
        )
    }

    override fun showData(data: ArrayList<ResponMovie.ResultMovie>) {
        adapter = MovieAdapter(data)
        view?.recyclerview_movie?.adapter = adapter
        adapter.setOnItemClickListener(this)
    }

    override fun OnItemClick(pos: Int) {
        context?.let { presenter.toDetailMovie(it, pos) }
    }

    override fun makeToast(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    override fun showShimemr() {
        view?.shimmerList?.startShimmerAnimation()
    }

    override fun hideShimmer() {
        view?.shimmerList?.stopShimmerAnimation()
        view?.shimmerList?.visibility = View.GONE
    }
}
