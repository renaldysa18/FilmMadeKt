package com.redveloper.filmmadekt.presenter.movie

import android.util.Log
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.service.BaseApi
import com.redveloper.filmmadekt.view.view.MainView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import retrofit2.Response

class MoviePresenter : MainView.MoviePresenter{
    private val baseApi = BaseApi.create()
    private var compositeDisposable: CompositeDisposable? = null

    private var dataMovie : List<ResponMovie.Result>? = null

    override fun searchMovie(api_key: String, languange: String, query: String) {
        compositeDisposable = CompositeDisposable()
        compositeDisposable?.add(
            baseApi.searchMovie(
                api_key, languange, query
            ).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(
                    object : DisposableObserver<Response<ResponMovie>>(){
                        override fun onComplete() {
                            Log.i("searchMovie", "Complete")
                        }

                        override fun onNext(t: Response<ResponMovie>) {
                            if(t.code() == 200 && t.isSuccessful){
                                dataMovie = t.body()?.results
                            }
                        }

                        override fun onError(e: Throwable) {

                        }
                    }
                )
        )
    }


    override fun getMovie(): List<ResponMovie.Result> {
        if(!dataMovie.isNullOrEmpty()){
            return dataMovie as List<ResponMovie.Result>
        } else {
            return ArrayList()
        }
    }
}