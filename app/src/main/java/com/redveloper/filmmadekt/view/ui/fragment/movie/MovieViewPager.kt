package com.redveloper.filmmadekt.view.ui.fragment.movie

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.view.ui.fragment.movie.comingsoon.MovieComingSoonFragment
import com.redveloper.filmmadekt.view.ui.fragment.movie.nowplaying.MovieNowPlayingFragment
import com.redveloper.filmmadekt.view.ui.fragment.movie.popular.MoviePopularFragment

class MovieViewPager(fm : FragmentManager, val context: Context) : FragmentPagerAdapter(fm){
    private val pages = listOf(
        MovieNowPlayingFragment(),
        MovieComingSoonFragment(),
        MoviePopularFragment()
    )
    override fun getItem(p0: Int): Fragment {
        return when(p0){
            0 -> pages.get(0)
            1 -> pages.get(1)
            else -> pages.get(2)
        }
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> context?.resources?.getString(R.string.title_now_showing)
            1 -> context?.resources?.getString(R.string.title_coming_soon)
            else -> context?.resources?.getString(R.string.title_popular)
        }
    }
}