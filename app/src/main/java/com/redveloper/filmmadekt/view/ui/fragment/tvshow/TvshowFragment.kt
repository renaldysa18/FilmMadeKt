package com.redveloper.filmmadekt.view.ui.fragment.tvshow


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.redveloper.filmmadekt.R
import kotlinx.android.synthetic.main.fragment_tvshow.*
import kotlinx.android.synthetic.main.fragment_tvshow.view.*
import kotlinx.android.synthetic.main.fragment_tvshow.view.customPager_tvshow

class TvshowFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tvshow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = context?.let { TvShowViewPager(childFragmentManager, it) }
        view.customPager_tvshow.adapter = adapter
        view.customPager_tvshow.setSwipe(false)
        view.tablayout_tvshow.setupWithViewPager(customPager_tvshow)
    }
}
