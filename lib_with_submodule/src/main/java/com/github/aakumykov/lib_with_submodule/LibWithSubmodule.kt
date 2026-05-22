package com.github.aakumykov.lib_with_submodule

import android.util.Log

class LibWithSubmodule {
    fun work() {
        Log.d(TAG, "work()")
    }
    companion object {
        val TAG: String = LibWithSubmodule::class.java.simpleName
    }
}