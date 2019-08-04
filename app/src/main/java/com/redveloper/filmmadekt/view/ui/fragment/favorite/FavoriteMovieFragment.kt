package com.redveloper.filmmadekt.view.ui.fragment.favorite


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

import com.redveloper.filmmadekt.R
import kotlinx.android.synthetic.main.fragment_favorite_movie.view.*

class FavoriteMovieFragment : Fragment(){

//    private lateinit var adapter : MovieAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite_movie, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.recyclerview_favorite_movie.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
//        callMovie()
    }

//    override fun makeToast(msg: String) {
//        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
//    }
//
//    override fun showData(data: ArrayList<ResponMovie.ResultMovie>) {
//        hideShimmer()
//        adapter = MovieAdapter(data)
//        view?.recyclerview_favorite_movie?.adapter = adapter
//        adapter.notifyDataSetChanged()
//        adapter.setOnItemClickListener(this)
//    }
//
//    override fun OnItemClick(pos: Int) {
//        context?.let { presenter.toDetailMovie(it, pos) }
//    }
//
//    override fun callMovie() {
//        context?.let { presenter.getFavoriteMovie(it) }
//    }
//
//    override fun showShimemr() {
//        view?.shimmerList?.startShimmerAnimation()
//    }
//
//    override fun hideShimmer() {
//        view?.shimmerList?.stopShimmerAnimation()
//        view?.shimmerList?.visibility = View.GONE
//    }
}
