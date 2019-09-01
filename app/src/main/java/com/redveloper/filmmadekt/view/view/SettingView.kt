package com.redveloper.filmmadekt.view.view

import android.content.Context
import com.kyleduo.switchbutton.SwitchButton
import com.redveloper.filmmadekt.model.movie.ResponMovie

interface SettingView{
    interface View{
        fun switchIndo()
        fun switchEnglish()
        fun switchDailyAlarm()
        fun switchReleaseMovieToday()
        fun showLoading()
        fun hideLoading()
        fun showMessage(msg : String)
    }

    interface Presenter{
        fun changeColorOn(switchbutton: SwitchButton?)
        fun changeColorOff(switchbutton: SwitchButton?)
        fun changeLanguange(context : Context?, lang : String)
        fun settingDailyAlarm(isNotif : Boolean, isRepeat : Boolean, context: Context)
        fun settingReleaseTodayMovieAlarm(isNotif : Boolean, isRepeat : Boolean, context: Context, data : ResponMovie.ResultMovie?)
        fun getDataReleaseToday(api_key: String, date_gte: String, date_lte: String, context: Context?)
    }

}