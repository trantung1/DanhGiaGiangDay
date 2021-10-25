package com.example.myapplication.ui.main

import androidx.lifecycle.MutableLiveData
import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.data.model.Major
import com.example.myapplication.data.model.Teacher

class MainViewModel : BaseViewModel() {

    var major = MutableLiveData<Major>()

    var teacher = MutableLiveData<Teacher>()

}