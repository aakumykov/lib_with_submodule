package com.github.aakumykov.lib_with_submodule

import android.util.Log
import com.github.aakumykov.test_android_module.TestClass1

class LibWithSubmodule {
    fun work() {
        Log.d(TAG, "work()")
        TestClass1().work()
    }
    companion object {
        val TAG: String = LibWithSubmodule::class.java.simpleName
    }
}