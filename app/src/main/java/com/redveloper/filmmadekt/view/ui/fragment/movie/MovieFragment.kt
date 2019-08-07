package com.redveloper.filmmadekt.view.ui.fragment.movie


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.presenter.movie.MoviePresenter
import kotlinx.android.synthetic.main.fragment_movie.*
import kotlinx.android.synthetic.main.fragment_movie.view.*

class MovieFragment : Fragment(), View.OnClickListener {

    private lateinit var adapterMovie: AdapterMovie
    private lateinit var presenter: MoviePresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = MoviePresenter()

        val adapter = context?.let { MovieViewPager(childFragmentManager, it) }
        view.customPager_movie.adapter = adapter
        view.customPager_movie.setSwipe(false)
        view.tablayout_movie.setupWithViewPager(customPager_movie)

        view.fab_search_movie.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.fab_search_movie -> showDialogFragment()
        }
    }

    private fun showDialogFragment() {

    }
}
