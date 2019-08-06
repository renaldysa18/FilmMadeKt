package com.redveloper.filmmadekt.view.ui.fragment.favorite


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.redveloper.filmmadekt.R
import com.redveloper.filmmadekt.model.movie.ResponMovie
import com.redveloper.filmmadekt.model.tvshow.ResponTvShow
import com.redveloper.filmmadekt.presenter.favorite.FavoritePresenter
import com.redveloper.filmmadekt.utils.visible
import com.redveloper.filmmadekt.view.view.FavoriteView
import kotlinx.android.synthetic.main.fragment_favorite.view.*

class FavoriteFragment : Fragment(), FavoriteView.View {

    private lateinit var adapter: AdapterFavoriteMovie
    private lateinit var adapterTv: AdapterFavoriteTvShow
    private lateinit var presenter: FavoritePresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = FavoritePresenter()

        listFavoriteMovie(
            activity?.let { presenter.getFavoriteMovie(it) }
        )

        listFavoriteTvshow(
            activity?.let { presenter.getFavoriteTvShow(it) }
        )
    }

    override fun listFavoriteMovie(data: List<ResponMovie.Result>?) {
        if (!data.isNullOrEmpty()) {
            view?.recyclerview_favorite_movie?.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
            adapter = AdapterFavoriteMovie(data)
            view?.recyclerview_favorite_movie?.adapter = adapter
        } else {
            view?.text_data_empety_movie?.visible()
        }
    }

    override fun listFavoriteTvshow(data: List<ResponTvShow.Result>?) {
        if(!data.isNullOrEmpty()){
           view?.recyclerview_favorite_tvshow?.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
            adapterTv  = AdapterFavoriteTvShow(data)
            view?.recyclerview_favorite_tvshow?.adapter = adapterTv
        } else {
            view?.text_data_empety_tvshow?.visible()
        }
    }
}
