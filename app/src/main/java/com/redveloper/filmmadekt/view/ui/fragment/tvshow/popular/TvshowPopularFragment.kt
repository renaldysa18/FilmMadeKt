package com.redveloper.filmmadekt.view.ui.fragment.tvshow.popular


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast

import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow
import com.redveloper.filmmadekt.presenter.tvshow.PopularTvShowPresenter
import com.redveloper.filmmadekt.view.ui.fragment.tvshow.TvShowAdapter
import com.redveloper.filmmadekt.view.view.TvshowView
import kotlinx.android.synthetic.main.fragment_tvshow_popular.view.*

class TvshowPopularFragment : Fragment(), TvshowView.Popular {
    private lateinit var adapter : TvShowAdapter
    private lateinit var presenter : PopularTvShowPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tvshow_popular, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = PopularTvShowPresenter(this)
        callTvShowPopular()
    }

    override fun callTvShowPopular() {
        context?.resources?.getString(R.string.API_KEY)?.let {
            presenter.getPopularTvShow(
                it, "en-US", 1
            )
        }
    }

    override fun showData(data: List<ResponTvShow.Result>?) {
        adapter = TvShowAdapter(data)
        view?.recyclerview_popular_tvshow?.layoutManager = LinearLayoutManager(activity, LinearLayout.VERTICAL, false)
        view?.recyclerview_popular_tvshow?.adapter = adapter
    }

    override fun showMessage(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}
