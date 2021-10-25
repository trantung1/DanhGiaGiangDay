package com.example.myapplication.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.myapplication.ui.main.MainActivity
import com.example.myapplication.ui.main.MainViewModel


abstract class BaseParentFragment<DB : ViewDataBinding> : Fragment() {

    protected lateinit var binding: DB

    protected val mainViewModel: MainViewModel by activityViewModels()

    //get context ep kieu MainActivity
    val mainActivity by lazy {
        requireActivity() as MainActivity
    }

    abstract fun layoutId(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, layoutId(), container, false)
        // gan lifecycle cho fragment hien tai
        binding.lifecycleOwner = this
        return binding.root
    }
}
