package com.redveloper.providerfilm.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/redveloper/providerfilm/view/MainView;", "", "PresenterMovie", "PresenterTvShow", "ViewMovie", "ViewTvShow", "providerfilm_debug"})
public abstract interface MainView {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J \u0010\u0005\u001a\u00020\u00032\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lcom/redveloper/providerfilm/view/MainView$ViewMovie;", "", "hideShimmer", "", "noData", "showData", "data", "Ljava/util/ArrayList;", "Lcom/redveloper/providerfilm/model/ResponMovie$ResultMovie;", "Lkotlin/collections/ArrayList;", "showMessage", "msg", "", "showShimmer", "providerfilm_debug"})
    public static abstract interface ViewMovie {
        
        public abstract void showData(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.redveloper.providerfilm.model.ResponMovie.ResultMovie> data);
        
        public abstract void noData();
        
        public abstract void showShimmer();
        
        public abstract void hideShimmer();
        
        public abstract void showMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String msg);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J \u0010\u0005\u001a\u00020\u00032\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lcom/redveloper/providerfilm/view/MainView$ViewTvShow;", "", "hideShimmer", "", "noData", "showData", "data", "Ljava/util/ArrayList;", "Lcom/redveloper/providerfilm/model/ResponTvShow$ResultTvShow;", "Lkotlin/collections/ArrayList;", "showMessage", "msg", "", "showShimmer", "providerfilm_debug"})
    public static abstract interface ViewTvShow {
        
        public abstract void showData(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.redveloper.providerfilm.model.ResponTvShow.ResultTvShow> data);
        
        public abstract void noData();
        
        public abstract void showShimmer();
        
        public abstract void hideShimmer();
        
        public abstract void showMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String msg);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/redveloper/providerfilm/view/MainView$PresenterMovie;", "", "convertData", "Ljava/util/ArrayList;", "Lcom/redveloper/providerfilm/model/ResponMovie$ResultMovie;", "Lkotlin/collections/ArrayList;", "cursor", "Landroid/database/Cursor;", "getDataMovie", "", "providerfilm_debug"})
    public static abstract interface PresenterMovie {
        
        public abstract void getDataMovie();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.ArrayList<com.redveloper.providerfilm.model.ResponMovie.ResultMovie> convertData(@org.jetbrains.annotations.NotNull()
        android.database.Cursor cursor);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/redveloper/providerfilm/view/MainView$PresenterTvShow;", "", "convertData", "Ljava/util/ArrayList;", "Lcom/redveloper/providerfilm/model/ResponTvShow$ResultTvShow;", "Lkotlin/collections/ArrayList;", "cursor", "Landroid/database/Cursor;", "getDataTvShow", "", "providerfilm_debug"})
    public static abstract interface PresenterTvShow {
        
        public abstract void getDataTvShow();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.ArrayList<com.redveloper.providerfilm.model.ResponTvShow.ResultTvShow> convertData(@org.jetbrains.annotations.NotNull()
        android.database.Cursor cursor);
    }
}