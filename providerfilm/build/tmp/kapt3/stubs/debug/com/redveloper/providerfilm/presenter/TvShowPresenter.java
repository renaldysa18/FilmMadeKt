package com.redveloper.providerfilm.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/redveloper/providerfilm/presenter/TvShowPresenter;", "Lcom/redveloper/providerfilm/view/MainView$PresenterTvShow;", "context", "Landroid/content/Context;", "view", "Lcom/redveloper/providerfilm/view/MainView$ViewTvShow;", "(Landroid/content/Context;Lcom/redveloper/providerfilm/view/MainView$ViewTvShow;)V", "AUTHORITY", "", "ContentUri", "Landroid/net/Uri;", "TVSHOW_TABLE", "getContext", "()Landroid/content/Context;", "getView", "()Lcom/redveloper/providerfilm/view/MainView$ViewTvShow;", "convertData", "Ljava/util/ArrayList;", "Lcom/redveloper/providerfilm/model/ResponTvShow$ResultTvShow;", "Lkotlin/collections/ArrayList;", "cursor", "Landroid/database/Cursor;", "getDataTvShow", "", "providerfilm_debug"})
public final class TvShowPresenter implements com.redveloper.providerfilm.view.MainView.PresenterTvShow {
    private final java.lang.String AUTHORITY = "com.redveloper.filmmadekt";
    private final java.lang.String TVSHOW_TABLE = null;
    private final android.net.Uri ContentUri = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.redveloper.providerfilm.view.MainView.ViewTvShow view = null;
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    @java.lang.Override()
    public void getDataTvShow() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<com.redveloper.providerfilm.model.ResponTvShow.ResultTvShow> convertData(@org.jetbrains.annotations.NotNull()
    android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.redveloper.providerfilm.view.MainView.ViewTvShow getView() {
        return null;
    }
    
    public TvShowPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.redveloper.providerfilm.view.MainView.ViewTvShow view) {
        super();
    }
}