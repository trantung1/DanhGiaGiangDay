package com.example.myapplication.ui.main

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.data.model.Major
import com.example.myapplication.data.model.Subject
import com.example.myapplication.data.model.Teacher
import com.example.myapplication.data.model.User
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.ui.account.AccountFragment
import com.example.myapplication.ui.home.HomeFragment


class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private lateinit var binding: ActivityMainBinding

    private var currentFragment: Fragment = HomeFragment()
    private val homeFragment = HomeFragment()
    private val accountFragment = AccountFragment()

    private var doubleBack = false
    private var isTabFragment = true

    private var userEmail : String = ""



    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        userEmail = intent.getStringExtra("email").toString()
        Log.d(TAG, "email: ${userEmail}")

        addTabFragment(homeFragment)
        binding.bottomNavigationBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.icHome -> {
                    if (currentFragment != homeFragment) {

                        addTabFragment(homeFragment)

                    }
                }

                R.id.icAccount -> {
                    if (currentFragment != accountFragment) {
                        val bundle = Bundle()
                        bundle.putString("email", userEmail)
                        accountFragment.arguments = bundle
                        addTabFragment(accountFragment)
                    }
                }
            }
            return@setOnItemSelectedListener true
        }






    }

    override fun onBackPressed() {
        if (isTabFragment) {
            if (!doubleBack) {
                this.doubleBack = true
                Toast.makeText(this, "Nhấn back lần nữa để thoát", Toast.LENGTH_SHORT).show()
                Handler(Looper.getMainLooper()).postDelayed(Runnable { doubleBack = false }, 2000)
                return
            } else {
                //Thoat toan bo app, khong con hien thi o da nhiem
                finishAffinity()
            }
        } else {
            super.onBackPressed()
        }
    }

    fun replaceFragment(fragment: Fragment) {
        val tag = fragment::class.java.simpleName
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment, tag)
        transaction.addToBackStack(tag)
        transaction.commit()
        isTabFragment = false
    }

    //dung cho nhung fragment khong phai 5 fragment cua bottom bar
    fun addFragment(fragment: Fragment) {
        val tag = fragment::class.java.simpleName
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragmentContainer, fragment, tag)
        transaction.addToBackStack(tag)
        transaction.commit()
        isTabFragment = false
    }

    //dung cho nhung fragment la 5 fragment cua bottom bar

    @RequiresApi(Build.VERSION_CODES.O)
    private fun addTabFragment(fragment: Fragment) {
        val tag = fragment::class.java.simpleName
        val transaction = supportFragmentManager.beginTransaction()
        transaction.hide(currentFragment)
        currentFragment = if (checkFragmentExists(fragment)) {
            transaction.show(fragment)
            fragment
        } else {
            transaction.add(R.id.fragmentContainer, fragment, tag)
            transaction.addToBackStack(tag)
            fragment
        }
        transaction.commit()
        isTabFragment = true
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun checkFragmentExists(fragment: Fragment): Boolean {
        supportFragmentManager.fragments.forEach {
            if (it == fragment) {
                return true
            }
        }
        return false
    }

    private fun isTabFragment(tag: String): Boolean {
        val tabFragmentTag = arrayOf(
            homeFragment::class.java.simpleName,
            accountFragment::class.java.simpleName
        )
        tabFragmentTag.forEach {
            if (it == tag) {
                return true
            }
        }
        return false
    }

    fun getSubjectByMajorId(majorId : String, listAllSubject : MutableList<Subject>) : MutableList<Subject> {
        var listSubject = mutableListOf<Subject>()
        for (item in listAllSubject){
            if (item.majorId == majorId){
                listSubject.add(item)
            }
        }
        return listSubject
    }

    fun getTeacherByMajorId(majorId: String, listAllTeacher : MutableList<Teacher>) : MutableList<Teacher> {
        var listTeacher = mutableListOf<Teacher>()
        for(item in listAllTeacher){
            if (item.majorId == majorId){
                listTeacher.add(item)
            }
        }
        return listTeacher
    }

   fun getTeacherByUser(userTeacherId : String, listAllTeacher: MutableList<Teacher>) : Teacher {
       var teacher = Teacher()
       for (item in listAllTeacher){
           if (item.teacherId == userTeacherId){
               teacher = item
           }
       }
       return teacher
   }

    fun getMajorByTeacher(majorId : String, listAllMajor: MutableList<Major>) : Major {
        var major = Major()
        for (item in listAllMajor){
            if (item.majorId == majorId){
                major = item
            }
        }
        return major
    }

    fun getSubjectByTeacher(teacherId : String, listAllSubject: MutableList<Subject>) : MutableList<Subject> {
        var listSubject = mutableListOf<Subject>()
        listAllSubject.forEach {
            for (item in it.listTeacherId){
                if (item == teacherId){
                    listSubject.add(it)
                }
            }
        }
        return listSubject
    }



    fun hideBottomBar() {
        binding.bottomNavigationBar.visibility = View.GONE
    }

    fun showBottomBar() {
        binding.bottomNavigationBar.visibility = View.VISIBLE
    }
}