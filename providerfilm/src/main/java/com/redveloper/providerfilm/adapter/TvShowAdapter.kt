package com.redveloper.providerfilm.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.redveloper.providerfilm.R
import com.redveloper.providerfilm.model.ResponTvShow
import com.redveloper.providerfilm.utils.Constant
import com.redveloper.providerfilm.view.ui.activity.TvShowDetailActivity
import kotlinx.android.synthetic.main.view_list_film.view.*

class TvShowAdapter(val items : ArrayList<ResponTvShow.ResultTvShow>) : RecyclerView.Adapter<TvShowAdapter.ViewHolder>(){

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
        fun binding(data: ResponTvShow.ResultTvShow) {
            Glide.with(itemView.context)
                .load(itemView.context.resources.getString(R.string.BASE_IMAGE)+data.poster_path)
                .into(itemView.imgvListFilm)

            itemView.tvTitleListFilm.text = data.name
            itemView.tvDesListFilm.text = data.overview
            itemView.setOnClickListener {
                toDetail(itemView.context, data)
            }

        }

        private fun toDetail(context : Context, data : ResponTvShow.ResultTvShow){
            val intent = Intent(context, TvShowDetailActivity::class.java)
            intent.putExtra(Constant.dataTvShow, data)
            context.startActivity(intent)
        }
    }
}