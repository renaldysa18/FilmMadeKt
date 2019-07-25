package com.redveloper.filmmadekt.view.ui.activity.main

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.view.ui.fragment.favorite.FavoriteFragment
import com.redveloper.filmmadekt.view.ui.fragment.movie.MovieFragment
import com.redveloper.filmmadekt.view.ui.fragment.tvshow.TvshowFragment

class MainViewPager(fm : FragmentManager, val context: Context) : FragmentPagerAdapter(fm){
    private val pages = listOf(
        MovieFragment(),
        TvshowFragment(),
        FavoriteFragment()
    )

    override fun getItem(p0: Int): Fragment {
        return when(p0){
            0 -> pages.get(0)
            1 -> pages.get(1)
            else  -> pages.get(2)
        }
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> context.resources.getString(R.string.title_movie).capitalize()
            1 -> context.resources.getString(R.string.title_tvshow).capitalize()
            else -> context.resources.getString(R.string.title_favorite).capitalize()
        }
    }
}