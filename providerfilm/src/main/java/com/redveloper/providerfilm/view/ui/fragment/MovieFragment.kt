package com.redveloper.providerfilm.view.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast

import com.redveloper.providerfilm.R
import com.redveloper.providerfilm.adapter.MovieAdapter
import com.redveloper.providerfilm.model.ResponMovie
import com.redveloper.providerfilm.presenter.MoviePresenter
import com.redveloper.providerfilm.utils.gone
import com.redveloper.providerfilm.utils.visible
import com.redveloper.providerfilm.view.MainView
import kotlinx.android.synthetic.main.fragment_movie.view.*

class MovieFragment : Fragment(), MainView.ViewMovie, SwipeRefreshLayout.OnRefreshListener {

    private var presenter : MoviePresenter? = null
    private lateinit var adapter : MovieAdapter

    override fun onStart() {
        super.onStart()
        showShimmer()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = context?.let { MoviePresenter(it.applicationContext, this) }
        presenter?.getDataMovie()
        view.swipe_movie.setOnRefreshListener(this)
    }

    override fun onRefresh() {
        presenter?.getDataMovie()
        view?.swipe_movie?.isRefreshing = false
    }

    override fun showMessage(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    override fun showData(data: ArrayList<ResponMovie.Result>) {
        view?.recyclerview_movie_fragment?.layoutManager = LinearLayoutManager(activity, LinearLayout.VERTICAL, false)
        adapter = MovieAdapter(data)
        view?.recyclerview_movie_fragment?.adapter = adapter
        hideShimmer()
    }

    override fun noData() {
        view?.textview_empety_data_movie?.visible()
        view?.recyclerview_movie_fragment?.gone()
        hideShimmer()
    }

    override fun showShimmer() {
        view?.shimmerList?.startShimmerAnimation()
    }

    override fun hideShimmer() {
        view?.shimmerList?.stopShimmerAnimation()
        view?.shimmerList?.gone()
    }
}
