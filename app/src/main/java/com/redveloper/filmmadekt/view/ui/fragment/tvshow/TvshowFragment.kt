package com.redveloper.filmmadekt.view.ui.fragment.tvshow


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
import com.redveloper.filmmadekt.presenter.tvshow.TvshowPresenter
import com.redveloper.filmmadekt.view.view.MainView
import kotlinx.android.synthetic.main.fragment_tvshow.view.*

class TvshowFragment : Fragment(), MainView.TvshowView, TvshowAdapter.OnItemClickListener {
    private lateinit var adapter: TvshowAdapter
    private lateinit var presenter: TvshowPresenter
    private lateinit var dataGlobal: ArrayList<ResponTvshow.ResultTvShow>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tvshow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.recyclerview_tvshow.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
        if (savedInstanceState != null) {
            showData(savedInstanceState.getParcelableArrayList("DataTvshow"))
        } else {
            presenter = TvshowPresenter(this)
            callTvshow()
        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if (outState != null) {
            outState.putParcelableArrayList("DataTvshow", dataGlobal)
        }
    }

    override fun callTvshow() {
        presenter.getTvshow(
            resources.getString(R.string.API_KEY), "en-Us", "1"
        )
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
        adapter = TvshowAdapter(results as ArrayList<ResponTvshow.ResultTvShow>)
        view?.recyclerview_tvshow?.adapter = adapter

        adapter.setOnClickListener(this)

        //init data
        this.dataGlobal = results
    }

    override fun OnClickItem(pos: Int) {
        context?.let { presenter.toDetailTvshow(it, pos) }
    }
}
