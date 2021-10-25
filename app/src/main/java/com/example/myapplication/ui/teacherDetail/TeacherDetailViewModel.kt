package com.example.myapplication.ui.teacherDetail

import androidx.lifecycle.MutableLiveData
import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.data.model.Major
import com.example.myapplication.data.model.Subject
import com.example.myapplication.utils.AppConst
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener

class TeacherDetailViewModel : BaseViewModel() {

    var listGetMajor = MutableLiveData<MutableList<Major>>()
    var listGetSubject = MutableLiveData<MutableList<Subject>>()

    fun getMajor() {
        val listMajor = mutableListOf<Major>()
        dbRoot.child(AppConst.LIST_MAJOR_NODE).addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                listMajor.clear()
                if (snapshot.exists()) {
                    for (item in snapshot.children) {
                        val major = item.getValue(Major::class.java)
                        if (major != null) {
                            listMajor.add(major)
                        }
                    }
                    listGetMajor.value = listMajor
                }
            }

            override fun onCancelled(error: DatabaseError) {

            }
        })
    }

    fun getSubject() {
        val listSubject = mutableListOf<Subject>()
        dbRoot.child(AppConst.LIST_SUBJECT_NODE).addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                listSubject.clear()
                if (snapshot.exists()) {
                    for (item in snapshot.children) {
                        val subject = item.getValue(Subject::class.java)
                        if (subject != null) {
                            listSubject.add(subject)
                        }
                    }
                    listGetSubject.value = listSubject
                }
            }

            override fun onCancelled(error: DatabaseError) {

            }

        })
    }
}