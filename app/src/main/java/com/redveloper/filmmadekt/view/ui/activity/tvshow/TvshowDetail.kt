package com.redveloper.filmmadekt.view.ui.activity.tvshow

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.presenter.tvshow.DetailTvshowPresenter
import com.redveloper.filmmadekt.view.view.DetailView
import kotlinx.android.synthetic.main.activity_tvshow_detail.*
import kotlinx.android.synthetic.main.content_tvshow_detail.*

class TvshowDetail : AppCompatActivity(), DetailView.ViewTvshow {

    private lateinit var presenter: DetailTvshowPresenter
    private var isFavorite: Boolean = false
    private var menuItem: Menu? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tvshow_detail)
        setSupportActionBar(toolbar)
        presenter = DetailTvshowPresenter(this)
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
                bundle.getParcelable("Data")
            )
        }
    }

    override fun showData(image: String?, title: String?, rating: String?, popularity: String?, description: String?) {
        Glide.with(applicationContext)
            .load(image)
            .into(imageview_detailtvshow)
        textview_title_detailtvshow.text = title
        textview_vote_detailtvshow.text = rating
        textview_release_detailtvshow.text = popularity
        textview_description_detailtvshow.text = description
    }

    override fun setFavorite() {
        if (isFavorite) {
            menuItem?.getItem(0)?.icon = ContextCompat.getDrawable(applicationContext, R.drawable.ic_star_fill)
        } else {
            menuItem?.getItem(0)?.icon = ContextCompat.getDrawable(applicationContext, R.drawable.ic_star_no_fill)
        }
    }

    override fun addToFavoriteMovie() {
        presenter.insertFavorite(applicationContext)
    }

    override fun removeToFavoriteMovie() {
        presenter.removeFavorite(applicationContext)
    }

    override fun favoriteState() {
        if (presenter.checkFavorite(applicationContext)){
            isFavorite = true
        }
    }
}
