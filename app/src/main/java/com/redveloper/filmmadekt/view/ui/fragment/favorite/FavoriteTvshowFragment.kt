package com.redveloper.filmmadekt.view.ui.fragment.favorite


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast

import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.tvshow.ResponTvshow
import com.redveloper.filmmadekt.presenter.tvshow.FavoriteTvshowPresenter
import com.redveloper.filmmadekt.view.ui.fragment.tvshow.TvshowAdapter
import com.redveloper.filmmadekt.view.view.MainView
import kotlinx.android.synthetic.main.fragment_favorite_tvshow.view.*

class FavoriteTvshowFragment : Fragment(), MainView.TvshowView, TvshowAdapter.OnItemClickListener {


    private lateinit var presenter : FavoriteTvshowPresenter
    private lateinit var adapter : TvshowAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite_tvshow, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.recyclerview_favorite_tvshow.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
        presenter = FavoriteTvshowPresenter(this, context)
        callTvshow()
    }

    override fun makeToast(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    override fun showShimmer() {
        view?.shimmerList?.startShimmerAnimation()
    }

    override fun hideShimmer() {
        view?.shimmerList?.stopShimmerAnimation()
        view?.shimmerList?.visibility = View.GONE
    }

    override fun showData(results: List<ResponTvshow.ResultTvShow>?) {
        hideShimmer()
        adapter = TvshowAdapter(results as ArrayList<ResponTvshow.ResultTvShow>)
        view?.recyclerview_favorite_tvshow?.adapter = adapter
        adapter.setOnClickListener(this)
    }

    override fun OnClickItem(pos: Int) {
        context?.let { presenter.toDetailTvshow(it, pos) }
        adapter.notifyDataSetChanged()
    }

    override fun callTvshow() {
        context?.let { presenter.getFavoriteTvshow(it) }
    }
}
