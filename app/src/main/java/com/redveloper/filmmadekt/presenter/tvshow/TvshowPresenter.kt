package com.redveloper.filmmadekt.presenter.tvshow

import android.content.Context
import android.content.Intent
import android.util.Log
import com.redveloper.filmmadekt.model.service.BaseApi
import com.redveloper.filmmadekt.model.tvshow.ResponTvshow
import com.redveloper.filmmadekt.view.ui.activity.tvshow.TvshowDetail
import com.redveloper.filmmadekt.view.view.MainView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class TvshowPresenter(val view : MainView.TvshowView) : MainView.TvshowPresenter{
    val baseApi = BaseApi.create()
    private var compositeDisposable : CompositeDisposable? = null
    private var data : ArrayList<ResponTvshow.ResultTvShow>? = null

    override fun getTvshow(apikey: String, languange: String, page: String) {
        compositeDisposable = CompositeDisposable()
        view.showShimmer()

        compositeDisposable?.add(
            baseApi.getTvShow(
                apikey, languange, page
            ).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())
                .subscribeWith(
                    object  : DisposableObserver<ResponTvshow>(){
                        override fun onComplete() {
                            Log.i("getTvshow", "Complete")
                        }

                        override fun onNext(t: ResponTvshow) {
                            view.showData(t.results)
                            view.hideShimmer()

                            if(t.results == null){
                                data = ArrayList()
                            } else {
                                data = t.results as ArrayList<ResponTvshow.ResultTvShow>
                            }
                        }

                        override fun onError(e: Throwable) {
                            view.hideShimmer()
                            view.makeToast(e.message.toString())
                        }

                    }
                )
        )
    }

    override fun toDetailTvshow(context: Context, pos: Int) {
        val set : Intent = Intent(context, TvshowDetail::class.java)
        set.putExtra("Data", data?.get(pos))
        context.startActivity(set)
    }
}