package com.redveloper.filmmadekt.presenter.tvshow

import android.util.Log
import com.redveloper.filmmadekt.model.service.BaseApi
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow
import com.redveloper.filmmadekt.view.view.MainView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import retrofit2.Response

class TvShowPresenter(val view : MainView.TvShow) : MainView.TvShowPresenter{
    private val baseApi = BaseApi.create()
    private var compositeDisposable: CompositeDisposable? = null

    override fun searchTvShow(api_key: String, languange: String, query: String) {
        view.showDialog()

        compositeDisposable = CompositeDisposable()
        compositeDisposable?.add(
            baseApi.searchTvShow(
                api_key, languange, query
            ).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(
                    object : DisposableObserver<Response<ResponTvShow>>(){
                        override fun onComplete() {
                            Log.i("SearchTvShow", "Complete")
                            view.hideDialog()
                        }

                        override fun onNext(t: Response<ResponTvShow>) {
                            if(t.isSuccessful && t.code() == 200){
                                t.body()?.results?.let { view.showData(it) }
                                view.hideDialog()
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