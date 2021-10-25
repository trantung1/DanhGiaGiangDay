package com.example.myapplication.utils

import android.app.Application

var application: Application? = null

@JvmName("getApplication1")
fun getApplication() = application!!

fun getMyContext(): Application = application!!
