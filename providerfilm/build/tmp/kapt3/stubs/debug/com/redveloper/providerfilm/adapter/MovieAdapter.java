package com.redveloper.providerfilm.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/redveloper/providerfilm/adapter/MovieAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/redveloper/providerfilm/adapter/MovieAdapter$ViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/redveloper/providerfilm/model/ResponMovie$ResultMovie;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItems", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "ViewHolder", "providerfilm_debug"})
public final class MovieAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.redveloper.providerfilm.adapter.MovieAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.redveloper.providerfilm.model.ResponMovie.ResultMovie> items = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.redveloper.providerfilm.adapter.MovieAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.redveloper.providerfilm.adapter.MovieAdapter.ViewHolder p0, int p1) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.redveloper.providerfilm.model.ResponMovie.ResultMovie> getItems() {
        return null;
    }
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.redveloper.providerfilm.model.ResponMovie.ResultMovie> items) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u00a8\u0006\f"}, d2 = {"Lcom/redveloper/providerfilm/adapter/MovieAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemsView", "Landroid/view/View;", "(Landroid/view/View;)V", "binding", "", "data", "Lcom/redveloper/providerfilm/model/ResponMovie$ResultMovie;", "toDetail", "context", "Landroid/content/Context;", "providerfilm_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public final void binding(@org.jetbrains.annotations.NotNull()
        com.redveloper.providerfilm.model.ResponMovie.ResultMovie data) {
        }
        
        private final void toDetail(android.content.Context context, com.redveloper.providerfilm.model.ResponMovie.ResultMovie data) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemsView) {
            super(null);
        }
    }
}