package com.redveloper.filmmadekt.view.ui.fragment.releaseTodayMovie


import android.app.ProgressDialog
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
import com.redveloper.filmmadekt.presenter.releaseToday.ReleaseTodayMoviePresenter
import com.redveloper.filmmadekt.utils.Commons
import com.redveloper.filmmadekt.view.ui.fragment.movie.AdapterMovie
import com.redveloper.filmmadekt.view.view.ReleaseTodayView
import kotlinx.android.synthetic.main.fragment_release_today_movie.view.*

class ReleaseTodayMovieFragment : Fragment(), ReleaseTodayView.View {

    private lateinit var presenter : ReleaseTodayMoviePresenter
    private lateinit var adapter : AdapterReleaseTodayMovie
    private lateinit var loading : ProgressDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_release_today_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = ReleaseTodayMoviePresenter(this)
        loading = ProgressDialog(context)

        showLoading()
        callReleaseToday(Commons().getDateToday())
    }

    override fun showLoading() {
        loading.setMessage(context?.resources?.getString(R.string.loading))
        loading.setCancelable(false)
        loading.show()
    }

    override fun hideLoading() {
        loading.dismiss()
    }

    override fun callReleaseToday(date : String) {
        context?.resources?.getString(R.string.API_KEY)?.let {
            presenter.getReleaseTodayMovie(
                it, date, date
            )
        }
    }

    override fun showData(data: List<ResponMovie.ResultMovie>) {
        view?.recyclerview_release_today_movie?.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
        adapter = AdapterReleaseTodayMovie(data)
        view?.recyclerview_release_today_movie?.adapter = adapter

        hideLoading()
    }

    override fun showMessage(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}
