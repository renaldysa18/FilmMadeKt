package com.redveloper.filmmadekt.view.ui.activity

import android.content.Intent
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

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_movie -> {
                moveFragment(MovieFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_tvshow -> {
                moveFragment(TvshowFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_favorite -> {
                moveFragment(FavoriteFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_view.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        //default
        moveFragment(MovieFragment())
    }

    fun moveFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frame, fragment)
            .commit()
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
