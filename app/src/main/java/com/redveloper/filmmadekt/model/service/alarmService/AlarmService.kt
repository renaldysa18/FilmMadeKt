package com.redveloper.filmmadekt.model.service.alarmService

import android.app.AlarmManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import android.os.SystemClock
import java.util.*

class AlarmService : Service(){
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        settingAlarm(true, true)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return START_NOT_STICKY
    }

    private fun settingAlarm(isNotif: Boolean, isRepeat: Boolean) {
        val alarmManager : AlarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        //set Time
        val calender = Calendar.getInstance()
        calender.set(Calendar.HOUR_OF_DAY, 7)
        calender.set(Calendar.MINUTE, 0)

        val intent = Intent(this, AlarmNotificationDailyReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent,0)

        if(isRepeat){
            alarmManager.set(AlarmManager.RTC_WAKEUP, SystemClock.elapsedRealtime()+3000,pendingIntent)
        } else {
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calender.timeInMillis, AlarmManager.INTERVAL_DAY, pendingIntent)
        }
    }

}