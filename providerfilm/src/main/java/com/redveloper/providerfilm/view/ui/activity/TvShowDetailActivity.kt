package com.redveloper.providerfilm.view.ui.activity

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.redveloper.providerfilm.R
import com.redveloper.providerfilm.presenter.DetailTvShowPresenter
import com.redveloper.providerfilm.utils.Constant
import com.redveloper.providerfilm.view.DetailView
import kotlinx.android.synthetic.main.activity_detail_tv_show.*
import kotlinx.android.synthetic.main.content_detail_tv_show.*

class TvShowDetailActivity : AppCompatActivity(), DetailView.ViewTvShow {

    private lateinit var presenter : DetailTvShowPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tv_show)
        setSupportActionBar(toolbar)

        presenter = DetailTvShowPresenter(this)
        getData()
    }

    override fun getData() {
        val bundle : Bundle? = intent.extras
        if(bundle != null){
            presenter.extractData(
                applicationContext,
                bundle.getParcelable(Constant.dataTvShow)
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
            .into(image_view_toolbar_tvshow)

        textview_title_detailTvShow.setText(title)
        textview_vote_detailTvShow.setText(popularity)
        textview_description_detailTvShow.setText(description)
        textview_release_detailTvShow.setText(releaseDate)
    }
}
