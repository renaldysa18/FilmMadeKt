package com.redveloper.filmmadekt.model.service

import com.google.gson.GsonBuilder
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow
import io.reactivex.Observable
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

interface BaseApi {

    //movie
    //now playing
    @GET("movie/now_playing?")
    fun getNowPlayingMovie(
        @Query("api_key") api_key: String,
        @Query("language") languange: String,
        @Query("page") page : Int
    ): Observable<ResponMovie>

    //popular
    @GET("movie/popular?")
    fun getPopularMovie(
        @Query("api_key") api_key: String,
        @Query("languange") languange: String,
        @Query("page") page: Int
    ) : Observable<ResponMovie>

    //comingsoon
    @GET("movie/upcoming?")
    fun getUpComingMovie(
        @Query("api_key") api_key: String,
        @Query("languange") languange: String,
        @Query("page") page: Int
    ) : Observable<ResponMovie>

    //tv show

    //popular
    @GET("tv/popular?")
    fun getTvShowPopular(
        @Query("api_key") api_key: String,
        @Query("languange") languange : String,
        @Query("page") page : Int
    ) : Observable<ResponTvShow>

    //top rated
    @GET("tv/top_rated?")
    fun getTvShowTopRated(
        @Query("api_key") api_key: String,
        @Query("language") languange: String,
        @Query("page") page : Int
    ) : Observable<ResponTvShow>

    companion object {
        var URL: String = "https://api.themoviedb.org/3/"
        fun create(): BaseApi {
            val gson = GsonBuilder()
                .setLenient()
                .create()

            val clientBuilder = OkHttpClient.Builder()
            clientBuilder.connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build()
            val client = clientBuilder.build()
            val retrofit = Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            return retrofit.create(BaseApi::class.java)
        }
    }
}