package com.redveloper.filmmadekt.view.ui.fragment.tvshow

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.view.ui.fragment.tvshow.popular.TvshowPopularFragment
import com.redveloper.filmmadekt.view.ui.fragment.tvshow.toprated.TvshowTopRatedFragment

class TvShowViewPager(fm : FragmentManager, val context: Context) : FragmentPagerAdapter(fm){
    private val pages = listOf(
        TvshowPopularFragment(),
        TvshowTopRatedFragment()
    )
    override fun getItem(p0: Int): Fragment {
        return when(p0){
            0 -> pages.get(0)
            else -> pages.get(1)
        }
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> context?.resources?.getString(R.string.title_popular)
            else -> context?.resources?.getString(R.string.title_top_rated)
        }
    }
}