package com.redveloper.filmmadekt.model.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.redveloper.filmmadekt.model.service.alarmService.AlarmService

class BootReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        val intent = Intent(context, AlarmService::class.java)
        context?.startService(intent)
    }
}