package com.redveloper.providerfilm.view.ui.activity

import android.content.Context
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.redveloper.providerfilm.R
import com.redveloper.providerfilm.model.ResponMovie
import com.redveloper.providerfilm.presenter.DetailMoviePresenter
import com.redveloper.providerfilm.utils.Constant
import com.redveloper.providerfilm.view.DetailView
import com.redveloper.providerfilm.view.MainView
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.content_movie_detail.*

class MovieDetailActivity : AppCompatActivity(), DetailView.ViewMovie {

    private lateinit var presenter : DetailMoviePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        setSupportActionBar(toolbar)

        presenter = DetailMoviePresenter(this)
        getData()

    }

    override fun getData() {
        val bundle : Bundle? = intent.extras
        if(bundle != null){
            presenter.extractData(
                applicationContext,
                bundle.getParcelable(Constant.dataMovie)
            )
        }
    }

    override fun showData(
        image: String?,
        title: String?,
        releaseDate: String?,
        rating: String?,
        popularity: String?,
        description: String?
    ) {

        Glide.with(applicationContext)
            .load(resources.getString(R.string.BASE_IMAGE) + image)
            .into(image_view_toolbar_movie)

        textview_title_detailMovie.setText(title)
        textview_vote_detailMovie.setText(popularity)
        textview_description_detailMovie.setText(description)
        textview_release_detailMovie.setText(releaseDate)
    }

}
