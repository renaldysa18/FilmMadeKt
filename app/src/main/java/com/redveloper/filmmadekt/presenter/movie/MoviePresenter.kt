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

class MoviePresenter(val view: MainView.Movie) : MainView.MoviePresenter {
    private val baseApi = BaseApi.create()
    private var compositeDisposable: CompositeDisposable? = null

    private var dataMovie: List<ResponMovie.Result>? = null

    override fun searchMovie(api_key: String, languange: String, query: String) {
        view.showDialog()

        compositeDisposable = CompositeDisposable()
        compositeDisposable?.add(
            baseApi.searchMovie(
                api_key, languange, query
            ).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(
                    object : DisposableObserver<Response<ResponMovie>>() {
                        override fun onComplete() {
                            Log.i("searchMovie", "Complete")
                            view.hideDialog()

                        }

                        override fun onNext(t: Response<ResponMovie>) {
                            if (t.code() == 200 && t.isSuccessful) {
                                dataMovie = t.body()?.results
                                view.showData(dataMovie)
                            }
                        }

                        override fun onError(e: Throwable) {
                            view.hideDialog()
                            view.showMessage(e.localizedMessage)
                        }
                    }
                )
        )
    }

}