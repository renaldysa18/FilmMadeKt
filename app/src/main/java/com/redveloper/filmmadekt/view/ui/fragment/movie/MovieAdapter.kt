package com.redveloper.filmmadekt.view.ui.fragment.movie

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponMovie
import kotlinx.android.synthetic.main.list_item.view.*

class MovieAdapter(val items : List<ResponMovie.ResultMovie>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>(){

    private lateinit var itemClickListener : OnItemClickListener

    fun setOnItemClickListener(itemClickListener: OnItemClickListener){
        this.itemClickListener = itemClickListener
    }

    interface OnItemClickListener{
        fun OnItemClick(pos : Int)
    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.list_item, p0, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.binding(items.get(p1), itemClickListener)
    }

    class ViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview){
        fun binding(
            data: ResponMovie.ResultMovie,
            itemClickListener: OnItemClickListener
        ) {
            itemView.textview_title_list.setText(data.title)
            itemView.textview_description_list.setText(data.overview)

            Glide.with(itemView.context)
                .load(itemView.context.resources.getString(R.string.BASE_IMAGE) + data.poster_path)
                .into(itemView.imageview_list)

            itemView.setOnClickListener{
                if(itemClickListener != null){
                    val pos : Int = adapterPosition
                    if(pos != RecyclerView.NO_POSITION){
                        itemClickListener.OnItemClick(pos)
                    }
                }
            }
        }
    }

}