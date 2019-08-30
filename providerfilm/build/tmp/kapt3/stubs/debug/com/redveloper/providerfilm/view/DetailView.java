package com.redveloper.providerfilm.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/redveloper/providerfilm/view/DetailView;", "", "PresenterMovie", "PresenterTvShow", "ViewMovie", "ViewTvShow", "providerfilm_debug"})
public abstract interface DetailView {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&JD\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H&\u00a8\u0006\f"}, d2 = {"Lcom/redveloper/providerfilm/view/DetailView$ViewMovie;", "", "getData", "", "showData", "image", "", "title", "releaseDate", "rating", "popularity", "description", "providerfilm_debug"})
    public static abstract interface ViewMovie {
        
        public abstract void getData();
        
        public abstract void showData(@org.jetbrains.annotations.Nullable()
        java.lang.String image, @org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
        java.lang.String rating, @org.jetbrains.annotations.Nullable()
        java.lang.String popularity, @org.jetbrains.annotations.Nullable()
        java.lang.String description);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/redveloper/providerfilm/view/DetailView$PresenterMovie;", "", "extractData", "", "context", "Landroid/content/Context;", "data", "Lcom/redveloper/providerfilm/model/ResponMovie$ResultMovie;", "providerfilm_debug"})
    public static abstract interface PresenterMovie {
        
        public abstract void extractData(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.redveloper.providerfilm.model.ResponMovie.ResultMovie data);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&JD\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H&\u00a8\u0006\f"}, d2 = {"Lcom/redveloper/providerfilm/view/DetailView$ViewTvShow;", "", "getData", "", "showData", "image", "", "title", "releaseDate", "rating", "popularity", "description", "providerfilm_debug"})
    public static abstract interface ViewTvShow {
        
        public abstract void getData();
        
        public abstract void showData(@org.jetbrains.annotations.Nullable()
        java.lang.String image, @org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
        java.lang.String rating, @org.jetbrains.annotations.Nullable()
        java.lang.String popularity, @org.jetbrains.annotations.Nullable()
        java.lang.String description);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/redveloper/providerfilm/view/DetailView$PresenterTvShow;", "", "extractData", "", "context", "Landroid/content/Context;", "data", "Lcom/redveloper/providerfilm/model/ResponTvShow$ResultTvShow;", "providerfilm_debug"})
    public static abstract interface PresenterTvShow {
        
        public abstract void extractData(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.redveloper.providerfilm.model.ResponTvShow.ResultTvShow data);
    }
}