package com.redveloper.filmmadekt.view.ui.fragment.favorite

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.redveloper.filmmadekt.R

class FavoriteAdapter(val fm : FragmentManager, val context : Context) : FragmentPagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        when(p0){
            0 -> return FavoriteMovieFragment()
            else -> return FavoriteTvshowFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return context.resources.getString(R.string.title_movie)
            else -> return context.resources.getString(R.string.title_tvshow)
        }
    }
}