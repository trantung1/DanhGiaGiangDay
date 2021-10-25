package com.example.myapplication.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Subject(
    @SerializedName("subjectId")
    @Expose
    var subjectId : String = "",
    @SerializedName("majorId")
    @Expose
    var majorId : String = "",
    @SerializedName("subjectName")
    @Expose
    var subjectName : String = "",
    @SerializedName("subjectCoverImage")
    @Expose
    var subjectCoverImage : String = "",
    @SerializedName("listTeacherId")
    @Expose
    var listTeacherId : MutableList<String> = mutableListOf(),
) {
}