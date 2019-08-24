package com.redveloper.filmmadekt.view.ui.activity.main

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.widget.TextView
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.view.ui.fragment.favorite.FavoriteFragment
import com.redveloper.filmmadekt.view.ui.fragment.movie.MovieFragment
import com.redveloper.filmmadekt.view.ui.fragment.releaseTodayMovie.ReleaseTodayMovieFragment
import com.redveloper.filmmadekt.view.ui.fragment.setting.SettingFragment
import com.redveloper.filmmadekt.view.ui.fragment.tvshow.TvshowFragment

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var title: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        title = toolbar.findViewById(R.id.toolbar_title)
        setSupportActionBar(toolbar)
        title.text = toolbar.title
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)


        //default fragment
        moveFragment(MovieFragment())
        title.text = applicationContext.resources.getString(R.string.title_movie)

    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_movie -> {
                moveFragment(MovieFragment())
                title.text = applicationContext.resources.getString(R.string.title_movie)
            }
            R.id.nav_tvshow -> {
                moveFragment(TvshowFragment())
                title.text = applicationContext.resources.getString(R.string.title_tvshow)
            }
            R.id.nav_favorite -> {
                moveFragment(FavoriteFragment())
                title.text = applicationContext.resources.getString(R.string.title_favorite)
            }
            R.id.nav_release_today_movie -> {
                moveFragment(ReleaseTodayMovieFragment())
                title.text = resources.getString(R.string.today_release_movie)
            }
            R.id.nav_tools -> {
                moveFragment(SettingFragment())
                title.text = applicationContext.resources.getString(R.string.title_setting)
            }
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    fun moveFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frame, fragment)
            .commit()
    }
}
