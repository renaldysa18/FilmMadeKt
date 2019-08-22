package com.redveloper.filmmadekt.view.ui.fragment.setting


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.presenter.setting.SettingPresenter
import com.redveloper.filmmadekt.view.view.SettingView
import kotlinx.android.synthetic.main.fragment_setting.view.*

class SettingFragment : Fragment(), SettingView.View, View.OnClickListener {

    private lateinit var presenter : SettingPresenter

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

        view.switchbutton_bahasa_indo.setOnClickListener(this)
        view.switchbutton_bahasa_ing.setOnClickListener(this)

        val languange = resources.configuration.locale.language
        if (languange.equals("in")) {
            presenter.changeColorOn(view.switchbutton_bahasa_indo)
            presenter.changeColorOff(view.switchbutton_bahasa_ing)
        } else if (languange.equals("en")) {
            presenter.changeColorOn(view.switchbutton_bahasa_ing)
            presenter.changeColorOff(view.switchbutton_bahasa_indo)
        }
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


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.switchbutton_bahasa_indo -> switchIndo()
            R.id.switchbutton_bahasa_ing -> switchEnglish()
        }
    }
}
