package com.redveloper.filmmadekt.presenter.setting

import android.app.Activity
import android.content.Context
import com.kyleduo.switchbutton.SwitchButton
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.view.view.SettingView
import java.util.*

class SettingPresenter(val view : SettingView.View) : SettingView.Presenter{
    override fun changeColorOn(switchbutton: SwitchButton?) {
        switchbutton?.setCheckedNoEvent(true)
        switchbutton?.setThumbColorRes(android.R.color.white)
        switchbutton?.setBackColorRes(R.color.colorGreen)
    }

    override fun changeColorOff(switchbutton: SwitchButton?) {
        switchbutton?.setCheckedNoEvent(false)
        switchbutton?.setThumbColorRes(R.color.colorGreen)
        switchbutton?.setBackColorRes(android.R.color.white)
    }

    override fun changeLanguange(context: Context?, lang: String) {
        val myLocale = Locale(lang)
        Locale.setDefault(myLocale)
        val config = android.content.res.Configuration()
        config.locale = myLocale
        context?.resources?.updateConfiguration(config, context.resources?.displayMetrics)
        (context as Activity)?.finish()
        (context as Activity)?.startActivity((context as Activity)?.intent)
    }
}