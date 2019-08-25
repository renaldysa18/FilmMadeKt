package com.redveloper.providerfilm.view.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.redveloper.providerfilm.R
import com.redveloper.providerfilm.view.MainView

class MovieFragment : Fragment(), MainView.ViewMovie {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun showData() {

    }

    override fun showShimmer() {

    }

    override fun hideShimmer() {

    }
}
