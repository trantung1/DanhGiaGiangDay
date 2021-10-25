package com.example.myapplication.utils

import android.app.Application

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        application = this
    }
}
