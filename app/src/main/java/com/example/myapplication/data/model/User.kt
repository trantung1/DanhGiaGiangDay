package com.example.myapplication.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    @Expose
    var userId: String = "",
    @SerializedName("teacherId")
    @Expose
    var teacherId: String = "",
    @SerializedName("name")
    @Expose
    var name: String = "",
    @SerializedName("email")
    @Expose
    var email: String = "",
    @SerializedName("phone")
    @Expose
    var phoneNumber: String = "",
    @SerializedName("pass")
    @Expose
    var passWords: String = "",

)