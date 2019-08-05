package com.redveloper.filmmadekt.view.ui.fragment.movie

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.utils.Constant
import com.redveloper.filmmadekt.view.ui.activity.movie.MovieDetailActivity
import kotlinx.android.synthetic.main.list_item.view.*

class AdapterMovie(val items: List<ResponMovie.Result>?) :
    RecyclerView.Adapter<AdapterMovie.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(p0.context).inflate(
                R.layout.list_item,
                p0,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        if (items?.size != null) {
            return items.size
        } else {
            return 0
        }
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.binding(p1, items?.get(p1))
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        private lateinit var dataGlobal: ResponMovie.Result

        fun binding(
            p1: Int,
            data: ResponMovie.Result?
        ) {
            Glide.with(itemView.context)
                .load(itemView.context.resources.getString(R.string.BASE_IMAGE) + data?.poster_path)
                .into(itemView.imageview_listmovie)

            itemView.textview_title_listmovie.text = data?.original_title
            itemView.textview_description_listmovie.text = data?.overview

            itemView.textview_vote_listmovie.text = data?.vote_average.toString()
            itemView.textview_rating_listmovie.text = data?.vote_average.toString()
            itemView.textview_popularity_listmovie.text = data?.popularity.toString()

            itemView.button_detail_listmovie.setOnClickListener(this)

            if (data != null) {
                this.dataGlobal = data
            }
        }

        override fun onClick(v: View?) {
            when (v?.id) {
                R.id.button_detail_listmovie -> toDetail(dataGlobal)
            }
        }

        private fun toDetail(data: ResponMovie.Result) {
            val intent : Intent = Intent(itemView.context, MovieDetailActivity::class.java)
            intent.putExtra(Constant.dataMovie, data)
            itemView.context.startActivity(intent)
        }
    }
}