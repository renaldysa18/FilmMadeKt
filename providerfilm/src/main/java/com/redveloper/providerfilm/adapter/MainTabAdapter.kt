package com.redveloper.providerfilm.adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.redveloper.providerfilm.R
import com.redveloper.providerfilm.view.ui.fragment.MovieFragment
import com.redveloper.providerfilm.view.ui.fragment.TvShowFragment

class MainTabAdapter(val fm : FragmentManager, val context : Context) : FragmentPagerAdapter(fm) {
    private val items = listOf(MovieFragment(), TvShowFragment())

    override fun getItem(p0: Int): Fragment {
        when(p0){
            0 -> return items.get(0)
            else -> return items.get(1)
        }
    }

    override fun getCount(): Int {
        return items.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return context.resources.getString(R.string.movie)
            else -> return context.resources.getString(R.string.tvshow)
        }
    }
}