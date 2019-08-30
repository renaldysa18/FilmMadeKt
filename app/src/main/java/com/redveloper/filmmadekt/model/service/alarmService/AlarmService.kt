package com.redveloper.filmmadekt.model.service.alarmService

import android.app.AlarmManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import com.pixplicity.easyprefs.library.Prefs
import com.redveloper.filmmadekt.utils.Constant
import java.util.*

class AlarmService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        val alarmDaily: Boolean = Prefs.getBoolean(Constant.CONST_SWITCH_ALARM_DAILY, false)
        val alarmReleaseMovieToday: Boolean = Prefs.getBoolean(Constant.CONST_SWITCH_ALARM_RELEASE_MOVIE_TODAY, false)


        if (alarmDaily) {
            settingAlarmDaily(true, true)
        } else {
            settingAlarmDaily(false, false)
        }

        if (alarmReleaseMovieToday) {
            settingAlarmReleaseToday(true, true)
        } else {
            settingAlarmReleaseToday(false, false)
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return START_NOT_STICKY
    }

    private fun settingAlarmDaily(isNotif: Boolean, isRepeat: Boolean) {
        val alarmManager: AlarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        //set Time
        val calender = Calendar.getInstance()
        val calenderDaily = Calendar.getInstance()

        calender.set(Calendar.HOUR_OF_DAY, 7)
        calender.set(Calendar.MINUTE, 0)
        calender.set(Calendar.SECOND, 0)
        calender.set(Calendar.MILLISECOND, 0)

        if (calenderDaily.after(calender)) {
            calender.add(Calendar.DATE, 1)
        }

        val intent = Intent(this, AlarmNotificationDailyReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

        if (isRepeat) {
            alarmManager.setRepeating(
                AlarmManager.RTC_WAKEUP,
                calender.timeInMillis,
                AlarmManager.INTERVAL_DAY,
                pendingIntent
            )
        } else {
            alarmManager.cancel(pendingIntent)
        }
    }

    private fun settingAlarmReleaseToday(isNotif: Boolean, isRepeat: Boolean) {
        val alarmManager: AlarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        //set Time
        val calender = Calendar.getInstance()
        val calenderDaily = Calendar.getInstance()

        calender.set(Calendar.HOUR_OF_DAY, 8)
        calender.set(Calendar.MINUTE, 0)
        calender.set(Calendar.SECOND, 0)
        calender.set(Calendar.MILLISECOND, 0)

        if (calenderDaily.after(calender)) {
            calender.add(Calendar.DATE, 1)
        }

        val intent = Intent(this, AlarmNotificationReleaseTodayReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

        if (isRepeat) {
            alarmManager.setRepeating(
                AlarmManager.RTC_WAKEUP,
                calender.timeInMillis,
                AlarmManager.INTERVAL_DAY,
                pendingIntent
            )
        } else {
//            alarmManager.set(AlarmManager.RTC_WAKEUP, SystemClock.elapsedRealtime()+3000, pendingIntent)
            alarmManager.cancel(pendingIntent)
        }
    }

}