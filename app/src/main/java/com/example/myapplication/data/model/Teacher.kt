package com.example.myapplication.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Teacher(
    @SerializedName("teacherId")
    @Expose
    var teacherId : String = "",
    @SerializedName("majorId")
    @Expose
    var majorId : String = "",
    @SerializedName("teacherImage")
    @Expose
    var teacherImage : String = "",
    @SerializedName("teacherName")
    @Expose
    var teacherName : String = "",
    @SerializedName("teacherGender")
    @Expose
    var teacherGender : String = "",
    @SerializedName("numOfTeachingLesson")
    @Expose
    var numOfTeachingLesson : Int = 0,
    @SerializedName("numOfStudyLesson")
    @Expose
    var numOfStudyLesson : Int = 0,
    @SerializedName("listSubjectId")
    @Expose
    var listSubjectId : MutableList<String> = mutableListOf()
) {


}