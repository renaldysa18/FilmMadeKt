package com.redveloper.filmmadekt.presenter.tvshow

import android.util.Log
import com.redveloper.filmmadekt.model.service.BaseApi
import com.redveloper.filmmadekt.model.tvshow.ResponPopularTvshow
import com.redveloper.filmmadekt.view.view.TvshowView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class PopularTvShowPresenter(val view : TvshowView.Popular) : TvshowView.PopularPresenter{

    private val baseApi = BaseApi.create()
    private var compositeDisposable: CompositeDisposable? = null

    override fun getPopularTvShow(api_key: String, languange: String, page: Int) {
        compositeDisposable = CompositeDisposable()
        compositeDisposable?.add(
            baseApi.getTvShowPopular(
                api_key, languange, page
            ).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(
                    object : DisposableObserver<ResponPopularTvshow>(){
                        override fun onComplete() {
                            Log.i("getTvShowPopular", "Complete")
                        }

                        override fun onNext(t: ResponPopularTvshow) {
                            if(t.results != null){
                                view.showData(t.results)
                            }
                        }

                        override fun onError(e: Throwable) {
                            view.showMessage(e.localizedMessage)
                        }
                    }
                )
        )
    }
}