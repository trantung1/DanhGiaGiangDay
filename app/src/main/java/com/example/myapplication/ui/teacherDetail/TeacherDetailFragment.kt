package com.example.myapplication.ui.teacherDetail

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.base.BaseFragment
import com.example.myapplication.data.model.Major
import com.example.myapplication.data.model.Subject
import com.example.myapplication.data.model.Teacher
import com.example.myapplication.databinding.FragmentTeacherDetailBinding

class TeacherDetailFragment : BaseFragment<FragmentTeacherDetailBinding>() {

    private val TAG = "TeacherDetailFragment"

    private val viewModel : TeacherDetailViewModel by viewModels()

    private val subjectAdapter = SubjectAdapter()

    private var mTeacher = Teacher()
    private var major = Major()
    private var listSubject = mutableListOf<Subject>()


    override fun layoutId(): Int {
        return R.layout.fragment_teacher_detail
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getMajor()
        viewModel.getSubject()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initAdapter()
        initViewClick()
    }

    private fun initViewModel() {
        mainViewModel.teacher.observe(viewLifecycleOwner) { teacher ->
            mTeacher = teacher
            binding.tvTeacherName.text = mTeacher.teacherName
            Glide.with(this).load(mTeacher.teacherImage).into(binding.ivAvatar)
        }

        viewModel.listGetMajor.observe(viewLifecycleOwner) { majors ->
            major = mainActivity.getMajorByTeacher(mTeacher.majorId, majors)
            binding.tvMajorName.text = major.majorName
        }

        viewModel.listGetSubject.observe(viewLifecycleOwner) { subjects ->
            listSubject = mainActivity.getSubjectByTeacher(mTeacher.teacherId, subjects)
            binding.tvNumOfSubject.text = listSubject.size.toString()
            subjectAdapter.listSubject = listSubject
        }
    }

    private fun initAdapter(){
        subjectAdapter()
    }

    private fun initViewClick(){
        binding.ivBack.setOnClickListener {
            mainActivity.supportFragmentManager.popBackStack()
        }
    }

    private fun subjectAdapter() {
        binding.rvSubject.adapter = subjectAdapter
    }
}