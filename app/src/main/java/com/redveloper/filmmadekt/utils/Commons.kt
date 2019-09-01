package com.redveloper.filmmadekt.utils

import java.text.SimpleDateFormat
import java.util.*

class Commons {
    fun getDateToday(): String {
        val format = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())
        return format.toString()
    }
}