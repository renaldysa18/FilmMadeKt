package com.redveloper.filmmadekt.view.ui.fragment.movie.comingsoon

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponUpComingMovie
import kotlinx.android.synthetic.main.list_item.view.*

class AdapterUpComingMovie(val items : List<ResponUpComingMovie.Result>?) : RecyclerView.Adapter<AdapterUpComingMovie.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.list_item, p0, false))
    }

    override fun getItemCount(): Int {
        if(items?.size != null){
            return items.size
        } else{
            return 0
        }
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.binding(items?.get(p1))
    }

    class ViewHolder(view : View): RecyclerView.ViewHolder(view){
        fun binding(get: ResponUpComingMovie.Result?) {
            Glide.with(itemView.context)
                .load(itemView.context.resources.getString(R.string.BASE_IMAGE) + get?.poster_path)
                .into(itemView.imageview_listmovie)

            itemView.textview_title_listmovie.setText(get?.original_title)
            itemView.textview_description_listmovie.setText(get?.overview)
            itemView.textview_vote_listmovie.setText(get?.vote_count.toString())
            itemView.textview_rating_listmovie.setText(get?.vote_average.toString())
            itemView.textview_popularity_listmovie.setText(get?.popularity.toString())
        }
    }
}