package com.redveloper.filmmadekt.view.ui.fragment.movie.nowplaying

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponNowPlayingMovie
import kotlinx.android.synthetic.main.list_item.view.*

class AdapterMovieNowPlaying(val items : List<ResponNowPlayingMovie.Result>?) :
    RecyclerView.Adapter<AdapterMovieNowPlaying.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.list_item, p0, false))
    }

    override fun getItemCount(): Int {
        if(items?.size != null){
            return items.size
        } else {
            return 0
        }
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.binding(p1,items?.get(p1))
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun binding(
            p1: Int,
            data: ResponNowPlayingMovie.Result?
        ) {
            Glide.with(itemView.context)
                .load(itemView.context.resources.getString(R.string.BASE_IMAGE)+data?.poster_path)
                .into(itemView.imageview_listmovie)

            itemView.textview_title_listmovie.setText(data?.original_title)
            itemView.textview_description_listmovie.setText(data?.overview)

            itemView.textview_vote_listmovie.setText(data?.vote_average.toString())
            itemView.textview_rating_listmovie.setText(data?.vote_average.toString())
            itemView.textview_popularity_listmovie.setText(data?.popularity.toString())
        }
    }

}