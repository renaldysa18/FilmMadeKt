package com.redveloper.filmmadekt.presenter.movie

import android.util.Log
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.service.BaseApi
import com.redveloper.filmmadekt.view.view.MainView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class MoviePresenter(val view: MainView.MovieView) : MainView.MoviePresenter {

    val baseApi = BaseApi.create()
    private var compositeDisposable: CompositeDisposable? = null

    override fun getMoview(apikey: String, dateGte: String, dateLte: String) {
        compositeDisposable = CompositeDisposable()
        compositeDisposable?.add(
            baseApi.getDiscoverMoview(apikey, dateGte, dateLte)
                .observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())
                .subscribeWith(
                    object : DisposableObserver<ResponMovie>() {
                        override fun onComplete() {
                            Log.i("getMovieDiscover", "Complete")
                        }

                        override fun onNext(t: ResponMovie) {
                            view.makeToast(t.toString())
                        }

                        override fun onError(e: Throwable) {
                            view.makeToast(e.message.toString())
                        }

                    }
                )
        )
    }
}