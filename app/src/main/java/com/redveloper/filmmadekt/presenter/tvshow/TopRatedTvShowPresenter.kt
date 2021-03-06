package com.redveloper.filmmadekt.presenter.tvshow

import android.util.Log
import com.redveloper.filmmadekt.model.service.BaseApi
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow
import com.redveloper.filmmadekt.view.view.TvshowView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class TopRatedTvShowPresenter(val view : TvshowView.TopRated) : TvshowView.TopRatedPresenter{
    private val baseApi = BaseApi.create()
    private var compositeDisposable: CompositeDisposable? = null

    override fun getTopRatedTvShow(api_key: String, languange: String, page: Int) {
        compositeDisposable = CompositeDisposable()
        compositeDisposable?.add(
            baseApi.getTvShowTopRated(
                api_key,languange,page
            ).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(
                    object : DisposableObserver<ResponTvShow>(){
                        override fun onComplete() {
                            Log.i("GetTopRated", "Complete")
                        }

                        override fun onNext(t: ResponTvShow) {
                            if(t.results != null){
                                view.showData(t.results)
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