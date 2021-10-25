package com.example.myapplication.ui.majorDetail

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
import com.example.myapplication.databinding.FragmentMajorDetailBinding
import com.example.myapplication.ui.teacherDetail.TeacherDetailFragment

class MajorDetailFragment : BaseFragment<FragmentMajorDetailBinding>() {

    private val TAG = "MajorDetailFragment"

    private val viewModel : MajorDetailViewModel by viewModels()

    private val teacherDetailFragment = TeacherDetailFragment()

    private val teacherAdapter = TeacherAdapter()
    private val subjectAdapter = SubjectAdapter()
    
    private var mMajor = Major()
    private var listAllSubject = mutableListOf<Subject>()
    private var listAllTeacher = mutableListOf<Teacher>()
    
    override fun layoutId(): Int {
        return R.layout.fragment_major_detail
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getSubject()
        viewModel.getTeacher()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initAdapter()
        initViewClick()
    }

    private fun initViewModel() {
        mainViewModel.major.observe(viewLifecycleOwner) { major ->
            mMajor = major
            binding.tvMajorName.text = mMajor.majorName
            Glide.with(this).load(mMajor.majorCoverImage).into(binding.ivMajorImage)
            binding.tvDescription.text = mMajor.textDescription
        }

        viewModel.listGetSubject.observe(viewLifecycleOwner) { subjects ->
            listAllSubject = subjects
            subjectAdapter.listSubject = mainActivity.getSubjectByMajorId(mMajor.majorId, listAllSubject)
        }

        viewModel.listGetTeacher.observe(viewLifecycleOwner) { teacher ->
            listAllTeacher = teacher
            teacherAdapter.listTeacher = mainActivity.getTeacherByMajorId(mMajor.majorId, listAllTeacher)
        }
    }

    private fun initAdapter() {
        teacherAdapter()
        subjectAdapter()
    }

    private fun initViewClick() {
        binding.ivBack.setOnClickListener {
            mainActivity.supportFragmentManager.popBackStack()
        }
    }

    private fun teacherAdapter() {
        teacherAdapter.teacherListener = object : TeacherAdapter.TeacherListener {
            override fun onTeacherClick(item: Teacher) {
                mainViewModel.teacher.value = item
                mainActivity.addFragment(teacherDetailFragment)
            }
        }
        binding.rvTeacher.adapter = teacherAdapter
    }

    private fun subjectAdapter() {
        subjectAdapter.subjectListener = object : SubjectAdapter.SubjectListener {
            override fun onSubjectClick(item: Subject) {

            }
        }
        binding.rvSubject.adapter = subjectAdapter
    }
    
}