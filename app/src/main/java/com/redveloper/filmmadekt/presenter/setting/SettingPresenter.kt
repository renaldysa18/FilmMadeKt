package com.redveloper.filmmadekt.presenter.setting

import android.app.Activity
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import com.kyleduo.switchbutton.SwitchButton
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.service.BaseApi
import com.redveloper.filmmadekt.model.service.alarmService.AlarmNotificationDailyReceiver
import com.redveloper.filmmadekt.model.service.alarmService.AlarmNotificationReleaseTodayReceiver
import com.redveloper.filmmadekt.utils.Constant
import com.redveloper.filmmadekt.view.view.SettingView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import retrofit2.Response
import java.util.*

class SettingPresenter(val view: SettingView.View) : SettingView.Presenter {

    private val baseApi = BaseApi.create()
    private var compositeDisposable: CompositeDisposable? = null


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
        (context as Activity).finish()
        context.startActivity(context.intent)
    }

    override fun settingDailyAlarm(isNotif: Boolean, isRepeat: Boolean, context: Context) {
        val alarmManager: AlarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager

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

        val intent = Intent(context, AlarmNotificationDailyReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0)

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

    override fun settingReleaseTodayMovieAlarm(isNotif: Boolean, isRepeat: Boolean, context: Context,
                                               data : ResponMovie.ResultMovie?) {
        val alarmManager: AlarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager

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

        val intent = Intent(context, AlarmNotificationReleaseTodayReceiver::class.java)
        intent.putExtra(Constant.dataMovie, data)
        val pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0)

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

    override fun getDataReleaseToday(api_key: String, date_gte: String, date_lte: String, context: Context?) {
        view.showLoading()

        compositeDisposable?.add(
            baseApi.releaseTodayMovie(
                api_key, date_gte, date_lte
            ).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(
                    object : DisposableObserver<Response<ResponMovie>>(){
                        override fun onComplete() {
                        }

                        override fun onNext(t: Response<ResponMovie>) {
                            if(t.code() == 200){
                                view.hideLoading()
                                context?.let { settingReleaseTodayMovieAlarm(true, true, it, t.body()?.results?.get(0)) }
                            } else {
                                view.hideLoading()
                                view.showMessage("Error "+t.code())
                            }
                        }

                        override fun onError(e: Throwable) {
                            view.hideLoading()
                            view.showMessage(e.localizedMessage)
                        }
                    }
                )
        )
    }
}