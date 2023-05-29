package com.benidict.common.base

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
abstract class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

    }
}