package com.example.myapplication.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Major(
    @SerializedName("majorId")
    @Expose
    var majorId: String = "",
    @SerializedName("majorImage")
    @Expose
    var majorCoverImage: String = "",
    @SerializedName("majorImageDescription")
    @Expose
    var majorImageDescription : MutableList<String> = mutableListOf(),
    @SerializedName("majorName")
    @Expose
    var majorName: String = "",
    @SerializedName("listSubjectId")
    @Expose
    var listSubjectId : MutableList<String> = mutableListOf(),
    @SerializedName("listTeacherId")
    @Expose
    var listTeacherId : MutableList<String> = mutableListOf(),
    @SerializedName("textDescription")
    @Expose
    var textDescription : String = ""
)


