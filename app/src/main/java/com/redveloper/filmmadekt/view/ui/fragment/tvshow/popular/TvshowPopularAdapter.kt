package com.redveloper.filmmadekt.view.ui.fragment.tvshow.popular

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.tvshow.ResponPopularTvshow
import kotlinx.android.synthetic.main.list_item_tvshow.view.*

class TvshowPopularAdapter(val items : List<ResponPopularTvshow.ResultTvShow>?) : RecyclerView.Adapter<TvshowPopularAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.list_item_tvshow, p0, false))
    }

    override fun getItemCount(): Int {
        if(items?.size != null){
            return items?.size
        } else {
            return 0
        }
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.binding(items?.get(p1))
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun binding(get: ResponPopularTvshow.ResultTvShow?) {
            Glide.with(itemView.context)
                .load(itemView.context.resources.getString(R.string.BASE_IMAGE) + get?.poster_path)
                .into(itemView.imageview_list_tvshow)

            itemView.textview_list_title_tvshow.setText(get?.name)
            itemView.textview_release_date_list_tvshow.setText(get?.first_air_date)
            itemView.textview_description_list_tvshow.setText(get?.overview)

            var rating : Double? = get?.vote_average
            if(rating!! > 5.0){
               rating = rating - 5.0
            }
            Log.i("ratingTopRated", rating.toString())
            itemView.ratingbar_list_tvshow.rating = rating.toFloat()
        }
    }
}