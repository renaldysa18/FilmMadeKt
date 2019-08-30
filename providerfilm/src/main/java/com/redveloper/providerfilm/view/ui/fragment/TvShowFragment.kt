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
import com.redveloper.providerfilm.adapter.TvShowAdapter
import com.redveloper.providerfilm.model.ResponTvShow
import com.redveloper.providerfilm.presenter.TvShowPresenter
import com.redveloper.providerfilm.utils.gone
import com.redveloper.providerfilm.utils.visible
import com.redveloper.providerfilm.view.MainView
import kotlinx.android.synthetic.main.fragment_tv_show.view.*
import kotlinx.android.synthetic.main.fragment_tv_show.view.shimmerList

class TvShowFragment : Fragment(), MainView.ViewTvShow, SwipeRefreshLayout.OnRefreshListener {

    private var presenter : TvShowPresenter? = null
    private lateinit var adapter : TvShowAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = context?.let { TvShowPresenter(it.applicationContext, this) }
        presenter?.getDataTvShow()
        view.swipe_tvshow.setOnRefreshListener(this)
    }

    override fun onRefresh() {
        presenter?.getDataTvShow()
        view?.swipe_tvshow?.isRefreshing = false
    }


    override fun showData(data: ArrayList<ResponTvShow.ResultTvShow>) {
        view?.recyclerview_tvshow_fragment?.layoutManager = LinearLayoutManager(activity, LinearLayout.VERTICAL, false)
        adapter = TvShowAdapter(data)
        view?.recyclerview_tvshow_fragment?.adapter = adapter
        hideShimmer()
    }

    override fun noData() {
        view?.textview_empety_data_tvshow?.visible()
        view?.recyclerview_tvshow_fragment?.gone()
        hideShimmer()
    }

    override fun showShimmer() {
        view?.shimmerList?.startShimmerAnimation()
    }

    override fun hideShimmer() {
        view?.shimmerList?.stopShimmerAnimation()
        view?.shimmerList?.gone()
    }

    override fun showMessage(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }



}
