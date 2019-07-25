package com.redveloper.filmmadekt.view.ui.activity.main

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.provider.Settings
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.view.ui.fragment.favorite.FavoriteFragment
import com.redveloper.filmmadekt.view.ui.fragment.movie.MovieFragment
import com.redveloper.filmmadekt.view.ui.fragment.tvshow.TvshowFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = MainViewPager(supportFragmentManager, applicationContext)
        customPager_main.adapter = adapter
        customPager_main.setSwipe(false)
        tablayout_main.setupWithViewPager(customPager_main)
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        if(newConfig?.orientation == Configuration.ORIENTATION_LANDSCAPE){
        } else if(newConfig?.orientation == Configuration.ORIENTATION_PORTRAIT){
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.getItemId() == R.id.action_settings) {
            val mIntent = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(mIntent)
        }
        return super.onOptionsItemSelected(item)
    }
}
