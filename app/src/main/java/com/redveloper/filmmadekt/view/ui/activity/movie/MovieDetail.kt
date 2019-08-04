package com.redveloper.filmmadekt.view.ui.activity.movie

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.presenter.movie.DetailMoviePresenter
import com.redveloper.filmmadekt.utils.Constant
import com.redveloper.filmmadekt.view.view.DetailView
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetail : AppCompatActivity(), DetailView.ViewMovie {

    private lateinit var presenter: DetailView.PresenterMovie
    private var menuItem: Menu? = null
    private var isFavorite: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        presenter = DetailMoviePresenter(this)
        getData()
        favoriteState()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_favorite, menu)
        menuItem = menu
        setFavorite()
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.add_to_favorite -> {
                if (isFavorite) {
                    removeToFavoriteMovie()
                } else {
                    addToFavoriteMovie()
                }
                isFavorite = !isFavorite
                setFavorite()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun getData() {
        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            presenter.extractData(
                applicationContext,
                bundle.getParcelable(Constant.dataMovie)
            )
        }
    }

    override fun setFavorite() {
        if (isFavorite) {
            menuItem?.getItem(0)?.icon = ContextCompat.getDrawable(this, R.drawable.ic_star_fill)
        } else {
            menuItem?.getItem(0)?.icon = ContextCompat.getDrawable(this, R.drawable.ic_star_no_fill)
        }
    }

    override fun addToFavoriteMovie() {
        presenter.insertFavorite(applicationContext)
    }

    override fun removeToFavoriteMovie() {
        presenter.removeFavorite(applicationContext)
    }

    override fun favoriteState() {
        if (presenter.checkFavorite(applicationContext)) {
            isFavorite = true
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

        textview_title_detailmovie.text = title
        textview_release_detailmovie.text = releaseDate
        textview_rating_detailmovie.text = rating
        textview_popularity_detailmovie.text = popularity
        textview_description_detailmovie.text = description
    }
}
