package com.redveloper.filmmadekt.model.service.widgetService

import android.content.Intent
import android.widget.RemoteViewsService

class StackWidgetService : RemoteViewsService(){
    override fun onGetViewFactory(intent: Intent?): RemoteViewsFactory {
        return StackRemoteViewsFactory(this.applicationContext)
    }
}