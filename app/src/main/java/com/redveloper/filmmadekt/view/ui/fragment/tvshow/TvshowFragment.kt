package com.redveloper.filmmadekt.view.ui.fragment.tvshow


import android.app.AlertDialog
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
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow
import com.redveloper.filmmadekt.presenter.tvshow.TvShowPresenter
import com.redveloper.filmmadekt.utils.gone
import com.redveloper.filmmadekt.utils.visible
import com.redveloper.filmmadekt.view.view.MainView
import kotlinx.android.synthetic.main.dialog_fragment_search.view.*
import kotlinx.android.synthetic.main.fragment_tvshow.*
import kotlinx.android.synthetic.main.fragment_tvshow.view.*
import kotlinx.android.synthetic.main.fragment_tvshow.view.customPager_tvshow

class TvshowFragment : Fragment(), MainView.TvShow, View.OnClickListener{

    private lateinit var presenter : TvShowPresenter
    private lateinit var adapter : TvShowAdapter
    private lateinit var progress : ProgressDialog
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tvshow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = TvShowPresenter(this)
        progress = ProgressDialog(context)

        val adapter = context?.let { TvShowViewPager(childFragmentManager, it) }
        view.customPager_tvshow.adapter = adapter
        view.customPager_tvshow.setSwipe(false)
        view.tablayout_tvshow.setupWithViewPager(customPager_tvshow)

        view.fab_search_tvshow.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.fab_search_tvshow -> showDialogFragment()
        }
    }

    override fun searchTvshow(query: String) {
        presenter.searchTvShow(
            resources.getString(R.string.API_KEY), "en-Us", query
        )
    }

    override fun showDialogFragment() {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.dialog_fragment_search, null)
        val alertBuilder = AlertDialog.Builder(context)
        alertBuilder.setView(view)


        alertBuilder.setCancelable(false)
        val alertDialog = alertBuilder.create()
        alertDialog.show()

        view.button_search_df.setOnClickListener {
            searchTvshow(view.edittext_search_df.text.toString())
            alertDialog.dismiss()
        }

        view.button_exit_df.setOnClickListener {
            alertDialog.cancel()
        }
    }

    override fun showDialog() {
        progress.setCancelable(false)
        progress.setMessage(resources.getString(R.string.please_wait))
        progress.show()
    }

    override fun showMessage(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    override fun hideDialog() {
        progress.dismiss()
    }

    override fun showData(data: List<ResponTvShow.ResultTvShow>) {
        changeLayout()

        adapter = TvShowAdapter(data)

        view?.recyclerview_tvshow_search?.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
        view?.recyclerview_tvshow_search?.adapter = adapter
    }

    override fun changeLayout() {
        view?.tablayout_tvshow?.gone()
        view?.customPager_tvshow?.gone()
        view?.recyclerview_tvshow_search?.visible()
    }
}
