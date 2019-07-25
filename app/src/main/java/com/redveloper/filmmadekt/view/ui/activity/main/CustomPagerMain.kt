package com.redveloper.filmmadekt.view.ui.activity.main

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

class CustomPagerMain(context: Context, attrs : AttributeSet) : ViewPager(context, attrs){
    private var swipe : Boolean = false

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return when(swipe){
            true -> super.onInterceptTouchEvent(ev)
            false -> false
        }
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return when(swipe){
            true -> super.onTouchEvent(ev)
            false -> false
        }
    }

    fun setSwipe(swipe : Boolean){
        this.swipe = swipe
    }
}