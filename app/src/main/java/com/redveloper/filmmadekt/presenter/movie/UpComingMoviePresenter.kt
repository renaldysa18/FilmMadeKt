package com.redveloper.filmmadekt.presenter.movie

import android.util.Log
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.service.BaseApi
import com.redveloper.filmmadekt.view.view.MovieView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class UpComingMoviePresenter(val view : MovieView.UpComing) : MovieView.UpComingPresenter{

    private val baseApi = BaseApi.create()
    private var compositeDisposable: CompositeDisposable? = null

    override fun getUpComingMovie(api_key: String, languange: String, page: Int) {
        compositeDisposable = CompositeDisposable()
        compositeDisposable?.add(
            baseApi.getUpComingMovie(
                api_key, languange, page
            ).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(
                    object  : DisposableObserver<ResponMovie>(){
                        override fun onComplete() {
                            Log.i("GetUpComing", "Complete")
                        }

                        override fun onNext(t: ResponMovie) {
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