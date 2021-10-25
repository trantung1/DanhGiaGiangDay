package com.example.myapplication.ui.home

import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication.R
import com.example.myapplication.base.BaseParentFragment
import com.example.myapplication.databinding.FragmentHomeBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearSnapHelper
import com.example.myapplication.data.model.Major
import com.example.myapplication.ui.majorDetail.MajorDetailFragment
import com.example.myapplication.utils.AppConst
import com.example.myapplication.utils.AppFakeData

class HomeFragment : BaseParentFragment<FragmentHomeBinding>() {

    private  val TAG = "HomeFragment"

    private val viewModel : HomeViewModel by viewModels()

    private val majorDetailFragment = MajorDetailFragment()

    private val majorAdapter = MajorAdapter()

    private var listMajor = mutableListOf<Major>()

    override fun layoutId(): Int {
        return R.layout.fragment_home
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getMajor()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initViewClick()
        initAdapter()
    }

    private fun initViewModel() {
        viewModel.listGetMajor.observe(viewLifecycleOwner) { majors ->
            listMajor = majors
            majorAdapter.listMajor = listMajor
        }
    }

    private fun initAdapter() {
        majorAdapter()
    }

    private fun majorAdapter() {
        majorAdapter.majorListener = object : MajorAdapter.MajorListener {
            override fun onMajorClick(item: Major) {
                mainViewModel.major.value = item
                mainActivity.addFragment(majorDetailFragment)
            }
        }
        binding.rvMajor.adapter = majorAdapter
    }

    private fun initViewClick() {
        binding.ivBanner.setOnClickListener {
            AppConst.createListUser(AppFakeData.listUser)
            Log.d(TAG, "initViewClick: banner")
        }
    }
}