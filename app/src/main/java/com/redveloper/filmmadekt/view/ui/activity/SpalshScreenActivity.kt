package com.redveloper.filmmadekt.view.ui.activity

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.view.ui.activity.main.MainActivity

class SpalshScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh_screen)

        if (isNetworkConnected()) {
            Handler().postDelayed({
                startActivity(Intent(applicationContext, MainActivity::class.java))
                finish()
            }, 3000)
        } else {
            Toast.makeText(applicationContext, resources.getString(R.string.no_connection), Toast.LENGTH_SHORT).show()
        }
    }

    private fun isNetworkConnected(): Boolean {
        val cm: ConnectivityManager? = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (cm != null) {
            val info = cm.allNetworkInfo
            if (info != null)
                for (i in info)
                    if (i.state == NetworkInfo.State.CONNECTED) {
                        return true
                    }
        }
        return false
    }
}
