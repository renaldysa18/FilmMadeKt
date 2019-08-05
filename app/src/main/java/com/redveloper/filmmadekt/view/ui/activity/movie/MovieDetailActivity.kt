package com.redveloper.filmmadekt.view.ui.activity.movie

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.presenter.movie.DetailMoviePresenter
import com.redveloper.filmmadekt.utils.Constant
import com.redveloper.filmmadekt.view.ui.activity.AdapterPict
import com.redveloper.filmmadekt.view.view.DetailView
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.content_movie_detail.*
import kotlinx.android.synthetic.main.content_detail_appar.*

class MovieDetailActivity : AppCompatActivity(), DetailView.ViewMovie, View.OnClickListener {

    private lateinit var presenter : DetailMoviePresenter
    private lateinit var adapter : AdapterPict
    private var isFavorite : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        presenter = DetailMoviePresenter(this)

        getData()

        favoriteState()
        setFavorite()

        button_favorite_movie.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button_favorite_movie -> clickFavorite()
        }
    }

    private fun clickFavorite() {
        if(isFavorite){
            removeToFavoriteMovie()
        } else {
            addToFavoriteMovie()
        }
        isFavorite = !isFavorite
        setFavorite()
    }

    override fun getData() {
        val bundle = intent.extras
        if(bundle != null){
            presenter.extractData(
                applicationContext,
                bundle.getParcelable(Constant.dataMovie)
            )
        }
    }

    override fun showData(
        image: String,
        title: String,
        releaseDate: String,
        rating: String,
        popularity: String,
        description: String,
        vote : String,
        year : String,
        backdrop : String,
        languange : String,
        adult : String
    ) {
        //image
        val images = listOf<String>(
            image,
            backdrop
        )
        setAdapter(images)

        //appbar
        Glide.with(applicationContext)
            .load(backdrop)
            .into(imageview_appbar_movie_detail)

        textview_title_appbar__detail.setText(title)
        textview_year__detail.setText(year)
        textview_rating_appbar__detail.setText(rating)
        textview_vote_appbar__detail.setText(vote)

        var ratingLong = rating.toDouble()
        if(ratingLong > 5.0){
            ratingLong = ratingLong - 5.0
        }

        ratingbar_appbar__detail.rating = ratingLong.toFloat()

        //content
        textview_storyline_movie_detail.setText(description)
        textview_original_title_movie_detail.setText(title)
        textview_release_date_movie_detail.setText(releaseDate)
        textview_original_languange_movie_detail.setText(languange)
        textview_adult_movie_detail.setText(adult)
    }

    private fun setAdapter(data : List<String>){
        recyclerview_pict.layoutManager = LinearLayoutManager(applicationContext, LinearLayout.HORIZONTAL, false)
        adapter = AdapterPict(data)
        recyclerview_pict.adapter = adapter
        adapter.notifyDataSetChanged()
    }

    override fun setFavorite() {
        if(isFavorite){
            button_favorite_movie.setBackgroundResource(R.drawable.rounded_corner_yellow)
            button_favorite_movie.setTextColor(resources.getColorStateList(android.R.color.white))
        } else {
            button_favorite_movie.setBackgroundResource(R.drawable.rounded_corner_white)
            button_favorite_movie.setTextColor(resources.getColorStateList(R.color.colorYellow))
        }

    }

    override fun addToFavoriteMovie() {
        presenter.insertFavorite(applicationContext)
    }

    override fun removeToFavoriteMovie() {
        presenter.removeFavorite(applicationContext)
    }

    override fun favoriteState() {
        if(presenter.checkFavorite(applicationContext)){
            isFavorite = true
        }
    }
}
