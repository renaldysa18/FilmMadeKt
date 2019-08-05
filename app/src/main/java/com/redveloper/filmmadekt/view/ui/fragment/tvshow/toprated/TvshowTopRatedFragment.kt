package com.redveloper.filmmadekt.view.ui.fragment.tvshow.toprated


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
import com.redveloper.filmmadekt.presenter.tvshow.TopRatedTvShowPresenter
import com.redveloper.filmmadekt.view.ui.fragment.tvshow.TvShowAdapter
import com.redveloper.filmmadekt.view.view.TvshowView
import kotlinx.android.synthetic.main.fragment_tvshow_top_rated.view.*

class TvshowTopRatedFragment : Fragment(), TvshowView.TopRated {

    private lateinit var adapter : TvShowAdapter
    private lateinit var presenter: TopRatedTvShowPresenter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tvshow_top_rated, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = TopRatedTvShowPresenter(this)
        callTvShowTopRated()
    }

    override fun callTvShowTopRated() {
        context?.resources?.getString(R.string.API_KEY)?.let {
            presenter.getTopRatedTvShow(
                it, "en-US", 1
            )
        }
    }

    override fun showData(data: List<ResponTvShow.Result>?) {
        view?.recyclerview_toprated_tvshow?.layoutManager = LinearLayoutManager(activity, LinearLayout.VERTICAL, false)
        adapter = TvShowAdapter(data)
        view?.recyclerview_toprated_tvshow?.adapter = adapter
    }

    override fun showMessage(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}
