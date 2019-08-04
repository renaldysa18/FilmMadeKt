package com.redveloper.filmmadekt.view.ui.fragment.setting


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kyleduo.switchbutton.SwitchButton

import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.view.view.SettingView
import kotlinx.android.synthetic.main.fragment_setting.view.*
import java.util.*

class SettingFragment : Fragment(), SettingView.View, View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.switchbutton_bahasa_indo.setOnClickListener(this)
        view.switchbutton_bahasa_ing.setOnClickListener(this)

        val languange = resources.configuration.locale.language
        if(languange.equals("in")){
            changeColorOn(view.switchbutton_bahasa_indo)
            changeColorOff(view.switchbutton_bahasa_ing)
        } else if(languange.equals("en")){
            changeColorOn(view.switchbutton_bahasa_ing)
            changeColorOff(view.switchbutton_bahasa_indo)
        }
    }


    override fun switchIndo() {
        if (view?.switchbutton_bahasa_indo?.isChecked == true) {
            changeColorOn(view?.switchbutton_bahasa_indo)
            changeColorOff(view?.switchbutton_bahasa_ing)
            //change languange
            changeLanguange(activity, "in")
        } else if(view?.switchbutton_bahasa_indo?.isChecked == false){
            changeColorOff(view?.switchbutton_bahasa_indo)
            changeColorOn(view?.switchbutton_bahasa_ing)
        }
    }

    override fun switchEnglish() {
        if (view?.switchbutton_bahasa_ing?.isChecked == true) {
            changeColorOn(view?.switchbutton_bahasa_ing)
            changeColorOff(view?.switchbutton_bahasa_indo)
            //change languange
            changeLanguange(activity, "en")
        } else if(view?.switchbutton_bahasa_ing?.isChecked == false){
            changeColorOff(view?.switchbutton_bahasa_ing)
            changeColorOn(view?.switchbutton_bahasa_indo)
        }
    }

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
        activity?.finish()
        activity?.startActivity(activity?.intent)
    }



    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.switchbutton_bahasa_indo -> switchIndo()
            R.id.switchbutton_bahasa_ing -> switchEnglish()
        }
    }
}
