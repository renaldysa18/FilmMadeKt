package com.redveloper.filmmadekt.view.ui.activity.tvshow

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.presenter.tvshow.DetailTvshowPresenter
import com.redveloper.filmmadekt.view.view.DetailView
import kotlinx.android.synthetic.main.activity_tvshow_detail.*
import kotlinx.android.synthetic.main.content_tvshow_detail.*

class TvshowDetail : AppCompatActivity(), DetailView.ViewTvshow {

    private lateinit var presenter: DetailTvshowPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tvshow_detail)
        setSupportActionBar(toolbar)
        presenter = DetailTvshowPresenter(this)
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

    override fun showData(image: String?, title: String?, rating: String?, popularity: String?, description: String?) {
        Glide.with(applicationContext)
            .load(image)
            .into(imageview_detailtvshow)
        textview_title_detailtvshow.text = title
        textview_vote_detailtvshow.text = rating
        textview_release_detailtvshow.text = popularity
        textview_description_detailtvshow.text = description
    }
}
