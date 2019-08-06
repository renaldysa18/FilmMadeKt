package com.redveloper.filmmadekt.view.ui.fragment.favorite

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow
import kotlinx.android.synthetic.main.list_item_favorite.view.*

class AdapterFavoriteTvShow(val items : List<ResponTvShow.Result>) : RecyclerView.Adapter<AdapterFavoriteTvShow.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.list_item_favorite, p0, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.binding(items.get(p1))
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val baseImage = itemView.context.resources.getString(R.string.BASE_IMAGE)

        fun binding(data: ResponTvShow.Result) {
            Glide.with(itemView.context)
                .load(baseImage + data.poster_path)
                .into(itemView.imageview_list_favorite)
        }
    }
}