package com.redveloper.filmmadekt.view.ui.fragment.releaseTodayMovie

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
import kotlinx.android.synthetic.main.list_item_release_today.view.*

class AdapterReleaseTodayMovie(val items: List<ResponMovie.ResultMovie>?) :
    RecyclerView.Adapter<AdapterReleaseTodayMovie.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(p0.context).inflate(
                R.layout.list_item_release_today,
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

        private lateinit var dataGlobal: ResponMovie.ResultMovie

        fun binding(
            p1: Int,
            data: ResponMovie.ResultMovie?
        ) {
            Glide.with(itemView.context)
                .load(itemView.context.resources.getString(R.string.BASE_IMAGE) + data?.backdrop_path)
                .into(itemView.imageview_list_release_today)

            itemView.textview_list_title_release_today_movie.text = data?.original_title
            itemView.textview_list_description_release_today_movie.text = data?.overview

            itemView.setOnClickListener(this)

            if (data != null) {
                this.dataGlobal = data
            }
        }

        override fun onClick(v: View?) {
            toDetail(dataGlobal)
        }

        private fun toDetail(data: ResponMovie.ResultMovie) {
            val intent : Intent = Intent(itemView.context, MovieDetailActivity::class.java)
            intent.putExtra(Constant.dataMovie, data)
            itemView.context.startActivity(intent)
        }
    }
}