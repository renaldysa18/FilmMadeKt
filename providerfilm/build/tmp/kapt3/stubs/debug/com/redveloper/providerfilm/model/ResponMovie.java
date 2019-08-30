package com.redveloper.providerfilm.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u00008\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\"\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/redveloper/providerfilm/model/ResponMovie;", "", "()V", "dates", "Lcom/redveloper/providerfilm/model/ResponMovie$Dates;", "getDates", "()Lcom/redveloper/providerfilm/model/ResponMovie$Dates;", "setDates", "(Lcom/redveloper/providerfilm/model/ResponMovie$Dates;)V", "page", "", "getPage", "()Ljava/lang/Integer;", "setPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "results", "", "Lcom/redveloper/providerfilm/model/ResponMovie$ResultMovie;", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "total_pages", "getTotal_pages", "setTotal_pages", "total_results", "getTotal_results", "setTotal_results", "Dates", "ResultMovie", "providerfilm_debug"})
public final class ResponMovie {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.redveloper.providerfilm.model.ResponMovie.ResultMovie> results;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "page")
    private java.lang.Integer page;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total_results")
    private java.lang.Integer total_results;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "dates")
    private com.redveloper.providerfilm.model.ResponMovie.Dates dates;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    private java.lang.Integer total_pages;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.redveloper.providerfilm.model.ResponMovie.ResultMovie> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.Nullable()
    java.util.List<com.redveloper.providerfilm.model.ResponMovie.ResultMovie> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPage() {
        return null;
    }
    
    public final void setPage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal_results() {
        return null;
    }
    
    public final void setTotal_results(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.redveloper.providerfilm.model.ResponMovie.Dates getDates() {
        return null;
    }
    
    public final void setDates(@org.jetbrains.annotations.Nullable()
    com.redveloper.providerfilm.model.ResponMovie.Dates p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal_pages() {
        return null;
    }
    
    public final void setTotal_pages(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public ResponMovie() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/redveloper/providerfilm/model/ResponMovie$Dates;", "", "(Lcom/redveloper/providerfilm/model/ResponMovie;)V", "maximum", "", "getMaximum", "()Ljava/lang/String;", "setMaximum", "(Ljava/lang/String;)V", "minimum", "getMinimum", "setMinimum", "providerfilm_debug"})
    public final class Dates {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "maximum")
        private java.lang.String maximum;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "minimum")
        private java.lang.String minimum;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMaximum() {
            return null;
        }
        
        public final void setMaximum(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMinimum() {
            return null;
        }
        
        public final void setMinimum(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Dates() {
            super();
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @android.arch.persistence.room.Entity(tableName = "moviedb")
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\\\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u009f\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010X\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010;J\u000b\u0010Y\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000b\u0010[\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010;J\t\u0010^\u001a\u00020\tH\u00c6\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010FJ\u000b\u0010`\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010FJ\u000b\u0010b\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u00a8\u0001\u0010e\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u0010fJ\t\u0010g\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010h\u001a\u00020\t2\b\u0010i\u001a\u0004\u0018\u00010jH\u00d6\u0003J\t\u0010k\u001a\u00020\u0006H\u00d6\u0001J\t\u0010l\u001a\u00020\rH\u00d6\u0001J\u0019\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020\u0006H\u00d6\u0001R\u0014\u0010\u0017\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0019R\u0014\u0010(\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0014\u0010*\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0014\u0010,\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019R\u0014\u0010.\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0019R\u0014\u00100\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0019R\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u00109R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010>\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0019\"\u0004\b@\u00109R \u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0019\"\u0004\bB\u00109R \u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0019\"\u0004\bD\u00109R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010I\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR \u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0019\"\u0004\bK\u00109R \u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0019\"\u0004\bM\u00109R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0019\"\u0004\bO\u00109R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010I\u001a\u0004\bT\u0010F\"\u0004\bU\u0010HR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010>\u001a\u0004\bV\u0010;\"\u0004\bW\u0010=\u00a8\u0006r"}, d2 = {"Lcom/redveloper/providerfilm/model/ResponMovie$ResultMovie;", "Landroid/os/Parcelable;", "cursor", "Landroid/database/Cursor;", "(Landroid/database/Cursor;)V", "vote_count", "", "id", "video", "", "vote_average", "", "title", "", "popularity", "poster_path", "original_languange", "original_title", "backdrop_path", "adult", "overview", "release_date", "(Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "ADULT", "getADULT", "()Ljava/lang/String;", "BACKDROP_PATH", "getBACKDROP_PATH", "ID", "getID", "ORIGINAL_LANGUANGE", "getORIGINAL_LANGUANGE", "ORIGINAL_TITLE", "getORIGINAL_TITLE", "OVERVIEW", "getOVERVIEW", "POPULARITY", "getPOPULARITY", "POSTER_PATH", "getPOSTER_PATH", "RELEASE_DATE", "getRELEASE_DATE", "TITLE", "getTITLE", "VIDEO", "getVIDEO", "VOTE_AVERAGE", "getVOTE_AVERAGE", "VOTE_COUNT", "getVOTE_COUNT", "getAdult", "()Ljava/lang/Boolean;", "setAdult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getBackdrop_path", "setBackdrop_path", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOriginal_languange", "setOriginal_languange", "getOriginal_title", "setOriginal_title", "getOverview", "setOverview", "getPopularity", "()Ljava/lang/Double;", "setPopularity", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getPoster_path", "setPoster_path", "getRelease_date", "setRelease_date", "getTitle", "setTitle", "getVideo", "()Z", "setVideo", "(Z)V", "getVote_average", "setVote_average", "getVote_count", "setVote_count", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/redveloper/providerfilm/model/ResponMovie$ResultMovie;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "providerfilm_debug"})
    public static final class ResultMovie implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String VOTE_COUNT = "vote_count";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ID = "id";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String VIDEO = "video";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String VOTE_AVERAGE = "vote_average";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String TITLE = "title";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String POPULARITY = "popularity";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String POSTER_PATH = "poster_path";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ORIGINAL_LANGUANGE = "original_languange";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ORIGINAL_TITLE = "original_title";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String BACKDROP_PATH = "backdrop_path";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ADULT = "adult";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String OVERVIEW = "overview";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String RELEASE_DATE = "release_date";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "vote_count")
        private java.lang.Integer vote_count;
        @org.jetbrains.annotations.Nullable()
        @android.arch.persistence.room.PrimaryKey()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "video")
        private boolean video;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "vote_average")
        private java.lang.Double vote_average;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "title")
        private java.lang.String title;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "popularity")
        private java.lang.Double popularity;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "poster_path")
        private java.lang.String poster_path;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "original_languange")
        private java.lang.String original_languange;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "original_title")
        private java.lang.String original_title;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "backdrop_path")
        private java.lang.String backdrop_path;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "adult")
        private java.lang.Boolean adult;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "overview")
        private java.lang.String overview;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "release_date")
        private java.lang.String release_date;
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVOTE_COUNT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVIDEO() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVOTE_AVERAGE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTITLE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPOPULARITY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPOSTER_PATH() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getORIGINAL_LANGUANGE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getORIGINAL_TITLE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBACKDROP_PATH() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getADULT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOVERVIEW() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRELEASE_DATE() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getVote_count() {
            return null;
        }
        
        public final void setVote_count(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        public final boolean getVideo() {
            return false;
        }
        
        public final void setVideo(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getVote_average() {
            return null;
        }
        
        public final void setVote_average(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getPopularity() {
            return null;
        }
        
        public final void setPopularity(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPoster_path() {
            return null;
        }
        
        public final void setPoster_path(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOriginal_languange() {
            return null;
        }
        
        public final void setOriginal_languange(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOriginal_title() {
            return null;
        }
        
        public final void setOriginal_title(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBackdrop_path() {
            return null;
        }
        
        public final void setBackdrop_path(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getAdult() {
            return null;
        }
        
        public final void setAdult(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOverview() {
            return null;
        }
        
        public final void setOverview(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRelease_date() {
            return null;
        }
        
        public final void setRelease_date(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public ResultMovie(@org.jetbrains.annotations.Nullable()
        java.lang.Integer vote_count, @org.jetbrains.annotations.Nullable()
        java.lang.Integer id, boolean video, @org.jetbrains.annotations.Nullable()
        java.lang.Double vote_average, @org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.Double popularity, @org.jetbrains.annotations.Nullable()
        java.lang.String poster_path, @org.jetbrains.annotations.Nullable()
        java.lang.String original_languange, @org.jetbrains.annotations.Nullable()
        java.lang.String original_title, @org.jetbrains.annotations.Nullable()
        java.lang.String backdrop_path, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean adult, @org.jetbrains.annotations.Nullable()
        java.lang.String overview, @org.jetbrains.annotations.Nullable()
        java.lang.String release_date) {
            super();
        }
        
        public ResultMovie() {
            super();
        }
        
        public ResultMovie(@org.jetbrains.annotations.NotNull()
        android.database.Cursor cursor) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.redveloper.providerfilm.model.ResponMovie.ResultMovie copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer vote_count, @org.jetbrains.annotations.Nullable()
        java.lang.Integer id, boolean video, @org.jetbrains.annotations.Nullable()
        java.lang.Double vote_average, @org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.Double popularity, @org.jetbrains.annotations.Nullable()
        java.lang.String poster_path, @org.jetbrains.annotations.Nullable()
        java.lang.String original_languange, @org.jetbrains.annotations.Nullable()
        java.lang.String original_title, @org.jetbrains.annotations.Nullable()
        java.lang.String backdrop_path, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean adult, @org.jetbrains.annotations.Nullable()
        java.lang.String overview, @org.jetbrains.annotations.Nullable()
        java.lang.String release_date) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Object[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
}