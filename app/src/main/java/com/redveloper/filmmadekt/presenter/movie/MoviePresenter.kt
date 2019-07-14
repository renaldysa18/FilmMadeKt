package com.redveloper.filmmadekt.presenter.movie

import android.content.Context
import android.content.Intent
import android.util.Log
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.service.BaseApi
import com.redveloper.filmmadekt.view.ui.activity.movie.MovieDetail
import com.redveloper.filmmadekt.view.view.MainView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class MoviePresenter(val view: MainView.MovieView) : MainView.MoviePresenter {

    val baseApi = BaseApi.create()
    private var compositeDisposable: CompositeDisposable? = null
    private var result : ArrayList<ResponMovie.ResultMovie>? = null

    override fun getMoview(apikey: String, dateGte: String, dateLte: String) {
        view.showShimemr()

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
                            view.showData(t.results as ArrayList<ResponMovie.ResultMovie>)
                            view.hideShimmer()

                            //set result
                            if(t.results == null){
                                result = ArrayList()
                            } else {
                                result = t.results as ArrayList<ResponMovie.ResultMovie>
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

    override fun toDetailMovie(context: Context, pos: Int) {
        val set : Intent = Intent(context, MovieDetail::class.java)
        set.putExtra("Data", result?.get(pos))
        context.startActivity(set)
    }
}