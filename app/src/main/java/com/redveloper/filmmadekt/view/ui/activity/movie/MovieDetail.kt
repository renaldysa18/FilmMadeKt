package com.redveloper.filmmadekt.view.ui.activity.movie

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.presenter.movie.DetailMoviePresenter
import com.redveloper.filmmadekt.view.view.DetailView
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetail : AppCompatActivity(), DetailView.ViewMovie {

    private lateinit var presenter: DetailView.PresenterMovie

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        presenter = DetailMoviePresenter(this)
        getData()
    }

    override fun getData() {
        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            presenter.extractData(
                applicationContext,
                bundle.getParcelable("Data")
            )
        }
    }

    override fun showData(
        image: String,
        title: String,
        releaseDate: String,
        rating: String,
        popularity: String,
        description: String
    ) {
        Glide.with(applicationContext)
            .load(image)
            .into(imageview_detail_movie)

        textview_title_detailmovie.setText(title)
        textview_release_detailmovie.setText(releaseDate)
        textview_rating_detailmovie.setText(rating)
        textview_popularity_detailmovie.setText(popularity)
        textview_description_detailmovie.setText(description)
    }
}
