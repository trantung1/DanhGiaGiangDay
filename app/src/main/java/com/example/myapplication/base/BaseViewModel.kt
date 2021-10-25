package com.example.myapplication.base

import androidx.lifecycle.ViewModel
import com.example.myapplication.utils.AppConst

open class BaseViewModel : ViewModel() {
    val dbRoot = AppConst.root

}