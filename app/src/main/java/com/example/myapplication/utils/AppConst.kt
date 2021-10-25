package com.example.myapplication.utils

import com.example.myapplication.data.model.Major
import com.example.myapplication.data.model.Subject
import com.example.myapplication.data.model.Teacher
import com.example.myapplication.data.model.User
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

object AppConst {

    var database: DatabaseReference = FirebaseDatabase.getInstance().reference

    const val PARENT_NODE = "kma"
    const val LIST_MAJOR_NODE = "list_major"
    const val LIST_SUBJECT_NODE = "list_subject"
    const val LIST_TEACHER_NODE = "list_teacher"
    const val LIST_USER_NODE = "list_user"

    val root = database.child(PARENT_NODE)

    fun createListUser(users : MutableList<User>) {
        val listUser = root.child(LIST_USER_NODE)
        users.forEach {
            val key = listUser.push().key.toString()
            it.userId = key
            listUser.child(key).setValue(it)
        }
    }

    fun createListTeacher(teachers : MutableList<Teacher>) {
        val listTeacher = root.child(LIST_TEACHER_NODE)
        teachers.forEach {
            val key = listTeacher.push().key.toString()
            it.teacherId = key
            listTeacher.child(key).setValue(it)
        }
    }

    fun createListSubject(subjects : MutableList<Subject>) {
        val listSubject = root.child(LIST_SUBJECT_NODE)
        subjects.forEach {
            val key = listSubject.push().key.toString()
            it.subjectId = key
            listSubject.child(key).setValue(it)
        }
    }

    fun createListMajor(majors : MutableList<Major>) {
        val listMajor = root.child(LIST_MAJOR_NODE)
        majors.forEach {
            val key = listMajor.push().key.toString()
            it.majorId = key
            listMajor.child(key).setValue(it)
        }
    }
}
