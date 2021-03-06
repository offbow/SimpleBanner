package com.offbow.simplebannerdemo

import android.app.Application
import android.graphics.Color
import com.offbow.simplebanner.SimpleBanner

open class DemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        //Either method below can be used but updateContent will allow you to update content after the library is initialized
        SimpleBanner.init(this)

//        SimpleBanner.init(this, Color.GREEN, "Build #${BuildConfig.VERSION_CODE}, BuildType ${BuildConfig.BUILD_TYPE}")
    }
}