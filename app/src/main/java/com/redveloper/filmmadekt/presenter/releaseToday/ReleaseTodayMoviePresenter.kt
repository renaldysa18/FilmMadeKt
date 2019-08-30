package com.redveloper.filmmadekt.presenter.releaseToday

import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.service.BaseApi
import com.redveloper.filmmadekt.view.view.ReleaseTodayView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*

class ReleaseTodayMoviePresenter(val view : ReleaseTodayView.View) : ReleaseTodayView.Presenter{

    private val baseApi = BaseApi.create()
    private val compositeDisposable = CompositeDisposable()

    override fun getReleaseTodayMovie(api_key: String, date_gte: String, date_lte: String) {
        compositeDisposable.add(
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
                                t.body()?.results?.let { view.showData(it) }
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

    override fun getDateToday(): String {
        val format = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())
        return format.toString()
    }
}