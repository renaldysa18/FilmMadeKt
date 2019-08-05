package com.redveloper.filmmadekt.view.ui.activity

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.redveloper.filmmadekt.R
import kotlinx.android.synthetic.main.list_pict.view.*

class AdapterPict(val items : List<String>) : RecyclerView.Adapter<AdapterPict.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.list_pict, p0, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.binding(items.get(p1))
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun binding(data: String) {
            Glide.with(itemView.context)
                .load(data)
                .into(itemView.imageview_list_pict)
        }
    }
}