package com.redveloper.providerfilm.view.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J \u0010\u0017\u001a\u00020\n2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/redveloper/providerfilm/view/ui/fragment/TvShowFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/redveloper/providerfilm/view/MainView$ViewTvShow;", "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "adapter", "Lcom/redveloper/providerfilm/adapter/TvShowAdapter;", "presenter", "Lcom/redveloper/providerfilm/presenter/TvShowPresenter;", "hideShimmer", "", "noData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRefresh", "onViewCreated", "view", "showData", "data", "Ljava/util/ArrayList;", "Lcom/redveloper/providerfilm/model/ResponTvShow$ResultTvShow;", "Lkotlin/collections/ArrayList;", "showMessage", "msg", "", "showShimmer", "providerfilm_debug"})
public final class TvShowFragment extends android.support.v4.app.Fragment implements com.redveloper.providerfilm.view.MainView.ViewTvShow, android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener {
    private com.redveloper.providerfilm.presenter.TvShowPresenter presenter;
    private com.redveloper.providerfilm.adapter.TvShowAdapter adapter;
    private java.util.HashMap _$_findViewCache;
    
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
    public void showData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.redveloper.providerfilm.model.ResponTvShow.ResultTvShow> data) {
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
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public TvShowFragment() {
        super();
    }
}