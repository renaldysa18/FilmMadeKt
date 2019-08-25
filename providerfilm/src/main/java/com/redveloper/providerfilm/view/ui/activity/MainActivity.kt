package com.redveloper.providerfilm.view.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.redveloper.providerfilm.R
import com.redveloper.providerfilm.adapter.MainTabAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter : MainTabAdapter = MainTabAdapter(supportFragmentManager, applicationContext)

        vpMain.adapter = adapter
        tabsMain.setupWithViewPager(vpMain)
    }
}
