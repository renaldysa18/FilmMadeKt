package com.redveloper.filmmadekt.view.ui.fragment.setting


import android.app.ProgressDialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.pixplicity.easyprefs.library.Prefs
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.presenter.setting.SettingPresenter
import com.redveloper.filmmadekt.utils.Commons
import com.redveloper.filmmadekt.utils.Constant
import com.redveloper.filmmadekt.view.view.SettingView
import kotlinx.android.synthetic.main.fragment_setting.view.*

class SettingFragment : Fragment(), SettingView.View, View.OnClickListener {

    private lateinit var presenter: SettingPresenter
    private lateinit var progress : ProgressDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = SettingPresenter(this)

        progress = ProgressDialog(activity)

        view.switchbutton_bahasa_indo.setOnClickListener(this)
        view.switchbutton_bahasa_ing.setOnClickListener(this)
        view.switchbutton_alarm_daily.setOnClickListener(this)
        view.switchbutton_alarm_relase_movie_today.setOnClickListener(this)

        val languange = resources.configuration.locale.language
        if (languange.equals("in")) {
            presenter.changeColorOn(view.switchbutton_bahasa_indo)
            presenter.changeColorOff(view.switchbutton_bahasa_ing)
        } else if (languange.equals("en")) {
            presenter.changeColorOn(view.switchbutton_bahasa_ing)
            presenter.changeColorOff(view.switchbutton_bahasa_indo)
        }

        val alarmDaily : Boolean = Prefs.getBoolean(Constant.CONST_SWITCH_ALARM_DAILY, false)
        if(alarmDaily){
            presenter.changeColorOn(view.switchbutton_alarm_daily)
        } else {
            presenter.changeColorOff(view.switchbutton_alarm_daily)
        }

        val alarmReleaseMovieToday : Boolean = Prefs.getBoolean(Constant.CONST_SWITCH_ALARM_RELEASE_MOVIE_TODAY, false)
        if(alarmReleaseMovieToday){
            presenter.changeColorOn(view.switchbutton_alarm_relase_movie_today)
        } else {
            presenter.changeColorOff(view.switchbutton_alarm_relase_movie_today)
        }
    }

    override fun showLoading() {
        progress.setMessage(context?.resources?.getString(R.string.loading))
        progress.show()
    }

    override fun hideLoading() {
        progress.dismiss()
    }

    override fun showMessage(msg : String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    override fun switchIndo() {
        if (view?.switchbutton_bahasa_indo?.isChecked == true) {
            presenter.changeColorOn(view?.switchbutton_bahasa_indo)
            presenter.changeColorOff(view?.switchbutton_bahasa_ing)
            //change languange
            presenter.changeLanguange(activity, "in")
        } else if (view?.switchbutton_bahasa_indo?.isChecked == false) {
            presenter.changeColorOff(view?.switchbutton_bahasa_indo)
            presenter.changeColorOn(view?.switchbutton_bahasa_ing)
        }
    }

    override fun switchEnglish() {
        if (view?.switchbutton_bahasa_ing?.isChecked == true) {
            presenter.changeColorOn(view?.switchbutton_bahasa_ing)
            presenter.changeColorOff(view?.switchbutton_bahasa_indo)
            //change languange
            presenter.changeLanguange(activity, "en")
        } else if (view?.switchbutton_bahasa_ing?.isChecked == false) {
            presenter.changeColorOff(view?.switchbutton_bahasa_ing)
            presenter.changeColorOn(view?.switchbutton_bahasa_indo)
        }
    }

    override fun switchReleaseMovieToday() {
        if(view?.switchbutton_alarm_relase_movie_today?.isChecked == true){
            Prefs.putBoolean(Constant.CONST_SWITCH_ALARM_RELEASE_MOVIE_TODAY, true)
            presenter.changeColorOn(view?.switchbutton_alarm_relase_movie_today)

            context?.resources?.getString(R.string.API_KEY)?.let {
                presenter.getDataReleaseToday(
                    it, Commons().getDateToday(), Commons().getDateToday(), context
                )
            }

        } else {
            Prefs.putBoolean(Constant.CONST_SWITCH_ALARM_RELEASE_MOVIE_TODAY, false)
            presenter.changeColorOff(view?.switchbutton_alarm_relase_movie_today)
            context?.let { presenter.settingReleaseTodayMovieAlarm(false, false, it, null) }
        }
    }

    override fun switchDailyAlarm() {
        if (view?.switchbutton_alarm_daily?.isChecked == true) {
            Prefs.putBoolean(Constant.CONST_SWITCH_ALARM_DAILY, true)
            context?.let { presenter.settingDailyAlarm(true, true, it) }
            presenter.changeColorOn(view?.switchbutton_alarm_daily)
        } else {
            Prefs.putBoolean(Constant.CONST_SWITCH_ALARM_DAILY, false)
            context?.let { presenter.settingDailyAlarm(false, false, it) }
            presenter.changeColorOff(view?.switchbutton_alarm_daily)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.switchbutton_bahasa_indo -> switchIndo()
            R.id.switchbutton_bahasa_ing -> switchEnglish()
            R.id.switchbutton_alarm_daily -> switchDailyAlarm()
            R.id.switchbutton_alarm_relase_movie_today -> switchReleaseMovieToday()
        }
    }
}
