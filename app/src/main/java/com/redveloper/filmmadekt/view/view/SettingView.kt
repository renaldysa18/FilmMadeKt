package com.redveloper.filmmadekt.view.view

import android.content.Context
import com.kyleduo.switchbutton.SwitchButton

interface SettingView{
    interface View{
        fun switchIndo()
        fun switchEnglish()
        fun switchDailyAlarm()
        fun switchReleaseMovieToday()
    }

    interface Presenter{
        fun changeColorOn(switchbutton: SwitchButton?)
        fun changeColorOff(switchbutton: SwitchButton?)
        fun changeLanguange(context : Context?, lang : String)
        fun settingDailyAlarm(isNotif : Boolean, isRepeat : Boolean, context: Context)
    }

}