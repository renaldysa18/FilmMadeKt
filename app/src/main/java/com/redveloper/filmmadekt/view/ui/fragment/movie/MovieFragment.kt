package com.redveloper.filmmadekt.view.ui.fragment.movie


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.redveloper.filmmadekt.R
import kotlinx.android.synthetic.main.fragment_movie.*
import kotlinx.android.synthetic.main.fragment_movie.view.*
import kotlinx.android.synthetic.main.fragment_movie.view.customPager_movie

class MovieFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = context?.let { MovieViewPager(childFragmentManager, it) }
        view.customPager_movie.adapter = adapter
        view.customPager_movie.setSwipe(false)
        view.tablayout_movie.setupWithViewPager(customPager_movie)
    }

}
