package com.github.aakumykov.lib_with_submodule

import android.util.Log
import com.github.aakumykov.copy_between_streams_with_speed.copyBetweenStreamsWithSpeed
import com.github.aakumykov.qwerty_test_lib.Qwerty
import com.github.aakumykov.test_android_module.TestClass1
import com.github.aakumykov.test_android_module.TestClass2
import java.io.File
import java.util.UUID

class LibWithSubmodule {

    private val randomId: String get() = UUID.randomUUID().toString()

    fun work() {
        Log.d(TAG, "work()")
        TestClass1().work()
        TestClass2().work()
        Qwerty().work()

        copyBetweenStreamsWithSpeed(
            File.createTempFile(randomId, randomId).inputStream(),
            File.createTempFile(randomId, randomId).outputStream(),
            printDebug = true
        )
    }
    companion object {
        val TAG: String = LibWithSubmodule::class.java.simpleName
    }
}