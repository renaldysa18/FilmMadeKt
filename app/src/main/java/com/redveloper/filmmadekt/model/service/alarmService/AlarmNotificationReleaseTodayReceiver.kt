package com.redveloper.filmmadekt.model.service.alarmService

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.PendingIntent.FLAG_ONE_SHOT
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import android.support.v4.app.NotificationCompat
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.utils.Constant
import com.redveloper.filmmadekt.view.ui.activity.main.MainActivity
import com.redveloper.filmmadekt.view.ui.fragment.releaseTodayMovie.ReleaseTodayMovieFragment

class AlarmNotificationReleaseTodayReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val builder = NotificationCompat.Builder(context)

        val intent = Intent(context, MainActivity::class.java)
        intent.putExtra(Constant.CONST_NOTIF_RELEASE_MOVIE_TODAY, true)
        val pendingIntent = PendingIntent.getActivity(context, 0, intent, FLAG_ONE_SHOT)

        builder.setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .setDefaults(Notification.DEFAULT_ALL)
            .setWhen(System.currentTimeMillis())
            .setSmallIcon(R.drawable.ic_movie)
            .setLargeIcon(BitmapFactory.decodeResource(context?.resources, R.drawable.ic_movie))
            .setContentTitle(context?.resources?.getString(R.string.app_name))
            .setContentText(context?.resources?.getString(R.string.today_release_movie))
            .setDefaults(Notification.DEFAULT_LIGHTS.or(Notification.DEFAULT_SOUND))
            .setContentInfo(context?.resources?.getString(R.string.info))

        val notifyManager: NotificationManager =
            context?.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel =
                NotificationChannel(Constant.channelID, Constant.channelName, NotificationManager.IMPORTANCE_DEFAULT)

            builder.setChannelId(Constant.channelID)

            notifyManager.createNotificationChannel(channel)
        }

        val notification = builder.build()

        notifyManager.notify(Constant.NOTIFICATION_ID, notification)

    }
}