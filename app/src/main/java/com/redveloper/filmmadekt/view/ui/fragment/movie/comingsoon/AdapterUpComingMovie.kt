package com.redveloper.filmmadekt.view.ui.fragment.movie.comingsoon

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponNowPlayingMovie

class AdapterUpComingMovie(val items : List<ResponNowPlayingMovie.Result>?) : RecyclerView.Adapter<AdapterUpComingMovie.ViewHolder>(){
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

    }

    class ViewHolder(view : View): RecyclerView.ViewHolder(view){

    }
}