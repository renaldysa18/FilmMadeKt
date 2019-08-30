package com.redveloper.providerfilm.view.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J \u0010\u0018\u001a\u00020\n2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/redveloper/providerfilm/view/ui/fragment/MovieFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/redveloper/providerfilm/view/MainView$ViewMovie;", "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "adapter", "Lcom/redveloper/providerfilm/adapter/MovieAdapter;", "presenter", "Lcom/redveloper/providerfilm/presenter/MoviePresenter;", "hideShimmer", "", "noData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRefresh", "onStart", "onViewCreated", "view", "showData", "data", "Ljava/util/ArrayList;", "Lcom/redveloper/providerfilm/model/ResponMovie$ResultMovie;", "Lkotlin/collections/ArrayList;", "showMessage", "msg", "", "showShimmer", "providerfilm_debug"})
public final class MovieFragment extends android.support.v4.app.Fragment implements com.redveloper.providerfilm.view.MainView.ViewMovie, android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener {
    private com.redveloper.providerfilm.presenter.MoviePresenter presenter;
    private com.redveloper.providerfilm.adapter.MovieAdapter adapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void showData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.redveloper.providerfilm.model.ResponMovie.ResultMovie> data) {
    }
    
    @java.lang.Override()
    public void noData() {
    }
    
    @java.lang.Override()
    public void showShimmer() {
    }
    
    @java.lang.Override()
    public void hideShimmer() {
    }
    
    public MovieFragment() {
        super();
    }
}