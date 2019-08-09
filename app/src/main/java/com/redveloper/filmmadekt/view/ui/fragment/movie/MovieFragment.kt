package com.redveloper.filmmadekt.view.ui.fragment.movie


import android.app.AlertDialog
import android.app.ProgressDialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.azoft.carousellayoutmanager.CarouselLayoutManager
import com.azoft.carousellayoutmanager.CarouselZoomPostLayoutListener
import com.azoft.carousellayoutmanager.CenterScrollListener
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.presenter.movie.MoviePresenter
import com.redveloper.filmmadekt.utils.gone
import com.redveloper.filmmadekt.utils.visible
import com.redveloper.filmmadekt.view.view.MainView
import kotlinx.android.synthetic.main.dialog_fragment_search.view.*
import kotlinx.android.synthetic.main.fragment_movie.*
import kotlinx.android.synthetic.main.fragment_movie.view.*

class MovieFragment : Fragment(), View.OnClickListener, MainView.Movie {

    private lateinit var adapterMovie: AdapterMovie
    private lateinit var presenter: MoviePresenter

    private lateinit var progressDialog: ProgressDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = MoviePresenter(this)
        progressDialog = ProgressDialog(context)

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

    override fun showDialog() {
        progressDialog.setCancelable(false)
        progressDialog.setMessage(resources.getString(R.string.please_wait))
        progressDialog.show()
    }

    override fun hideDialog() {
        progressDialog.dismiss()
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
            searchMovie(view.edittext_search_df.text.toString())
            alertDialog.dismiss()
        }

        view.button_exit_df.setOnClickListener {
            alertDialog.cancel()
        }
    }

    override fun searchMovie(query: String) {
        showDialog()

        presenter.searchMovie(
            resources.getString(R.string.API_KEY), "en-US", query
        )
    }

    override fun showMessage(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    override fun changeLayout() {
        view?.recyclerview_movie_search?.visible()
        view?.tablayout_movie?.gone()
        view?.customPager_movie?.gone()
    }

    override fun showData(data: List<ResponMovie.Result>?) {
        changeLayout()

        val layoutManager: CarouselLayoutManager = CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL, true)
        layoutManager.setPostLayoutListener(CarouselZoomPostLayoutListener())
        view?.recyclerview_movie_search?.layoutManager = layoutManager
        adapterMovie = AdapterMovie(data)
        view?.recyclerview_movie_search?.adapter = adapterMovie
        view?.recyclerview_movie_search?.addOnScrollListener(CenterScrollListener())

    }
}
