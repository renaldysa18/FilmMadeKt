package com.redveloper.providerfilm.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.redveloper.providerfilm.R
import com.redveloper.providerfilm.model.MovieData
import kotlinx.android.synthetic.main.view_list_film.view.*

class MovieAdapter(val items : ArrayList<MovieData>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(p0.context).inflate(R.layout.view_list_film, p0, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.binding(items.get(p1))
    }

    class ViewHolder(itemsView : View) : RecyclerView.ViewHolder(itemsView){
        fun binding(data: MovieData) {
            Glide.with(itemView.context)
                .load(itemView.context.resources.getString(R.string.BASE_IMAGE)+data.POSTER_PATH)
                .into(itemView.imgvListFilm)

            itemView.tvTitleListFilm.text = data.title
            itemView.tvDesListFilm.text = data.overview

        }
    }
}