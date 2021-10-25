package com.example.myapplication.ui.account

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.base.BaseParentFragment
import com.example.myapplication.data.model.Major
import com.example.myapplication.data.model.Subject
import com.example.myapplication.data.model.Teacher
import com.example.myapplication.data.model.User
import com.example.myapplication.databinding.FragmentAccountBinding
import com.example.myapplication.ui.home.HomeViewModel
import kotlin.math.log

class AccountFragment : BaseParentFragment<FragmentAccountBinding>() {

    private val TAG = "AccountFragment"

    private val viewModel: AccountViewModel by viewModels()

    private val subjectAdapter = SubjectAdapter()

    private var listAllTeacher = mutableListOf<Teacher>()
    private var listAllUser = mutableListOf<User>()
    private var listAllMajor = mutableListOf<Major>()
    private var listAllSubject = mutableListOf<Subject>()

    private var userEmail: String = ""
    private var currentUser = User()
    private var currentTeacher = Teacher()
    private var currentMajor = Major()



    override fun layoutId(): Int {
        return R.layout.fragment_account
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getTeacher()
        viewModel.getUser()
        viewModel.getMajor()
        viewModel.getSubject()
        userEmail = arguments?.getString("email").toString()
        Log.d(TAG, "account_email: $userEmail")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initAdapter()
    }

    private fun initViewModel() {
        viewModel.listGetTeacher.observe(viewLifecycleOwner) { teachers ->
            listAllTeacher = teachers
        }

        viewModel.listGetUser.observe(viewLifecycleOwner) { users ->
            listAllUser = users
            for (item in listAllUser) {
                if (item.email == userEmail) {
                    currentUser = item
                    currentTeacher = mainActivity.getTeacherByUser(currentUser.teacherId, listAllTeacher)
                    binding.tvTeacherName.text = currentTeacher.teacherName
                    Glide.with(this).load(currentTeacher.teacherImage).into(binding.ivAvatar)
                    binding.tvNumOfSubject.text = currentTeacher.listSubjectId.size.toString()

                }
            }
        }

        viewModel.listGetSubject.observe(viewLifecycleOwner) { subjects ->
            listAllSubject = subjects
            subjectAdapter.listSubject = mainActivity.getSubjectByTeacher(currentTeacher.teacherId, listAllSubject)
        }

        viewModel.listGetMajor.observe(viewLifecycleOwner) { majors ->
            listAllMajor = majors
            for (item in listAllMajor) {
                if (currentTeacher.majorId == item.majorId) {
                    currentMajor = item
                }
            }
            binding.tvMajorName.text = currentMajor.majorName
            Log.d(TAG, "major:${currentMajor.majorName} ")
        }
    }

    private fun initAdapter() {
        subjectAdapter()
    }

    private fun subjectAdapter() {
        binding.rvSubject.adapter = subjectAdapter
    }
}