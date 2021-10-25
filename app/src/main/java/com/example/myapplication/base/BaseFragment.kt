package com.example.myapplication.base

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding

abstract class BaseFragment<DB : ViewDataBinding> : BaseParentFragment<DB>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Khi ve xong view thi an bottombar
        mainActivity.hideBottomBar()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // khi huy view hien thi bottom bar
        mainActivity.showBottomBar()
    }
}
