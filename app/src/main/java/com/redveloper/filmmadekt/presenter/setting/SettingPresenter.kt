package com.redveloper.filmmadekt.presenter.setting

import android.app.Activity
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.SystemClock
import com.kyleduo.switchbutton.SwitchButton
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.service.alarmService.AlarmNotificationDailyReceiver
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

    override fun settingDailyAlarm(isNotif: Boolean, isRepeat: Boolean, context: Context) {
        val alarmManager : AlarmManager = context?.getSystemService(Context.ALARM_SERVICE) as AlarmManager

        //set Time
        val calender = Calendar.getInstance()
        calender.set(Calendar.HOUR_OF_DAY, 7)
        calender.set(Calendar.MINUTE, 0)

        val intent = Intent(context, AlarmNotificationDailyReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(context, 0, intent,0)

        if(isRepeat){
            alarmManager.set(AlarmManager.RTC_WAKEUP, SystemClock.elapsedRealtime()+3000,pendingIntent)
        } else {
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calender.timeInMillis, AlarmManager.INTERVAL_DAY, pendingIntent)
        }
    }
}