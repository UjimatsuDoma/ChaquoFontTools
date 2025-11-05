package prac.tanken.chaquo.fonttools

import android.content.Context
import com.chaquo.python.Python
import com.chaquo.python.android.AndroidPlatform

val Context.PYTHON: Python
    get() {
        if(!Python.isStarted()) {
            Python.start(AndroidPlatform(this))
        }

        return Python.getInstance()
    }