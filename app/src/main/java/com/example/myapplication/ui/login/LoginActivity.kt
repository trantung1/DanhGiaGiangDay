package com.example.myapplication.ui.login

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.base.BaseFragment
import com.example.myapplication.databinding.ActivityLoginBinding
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.ui.account.AccountFragment
import com.example.myapplication.ui.home.HomeFragment
import com.example.myapplication.ui.main.MainActivity
import com.example.myapplication.ui.main.MainViewModel
import com.example.myapplication.utils.getMyContext
import com.google.firebase.auth.FirebaseAuth

class LoginActivity :  AppCompatActivity() {

    private val TAG = "LoginFragment"

    private var auth = FirebaseAuth.getInstance()

    private lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        initViewClick()
    }

    private fun initViewClick() {
        binding.tvLogin.setOnClickListener {
            if (TextUtils.isEmpty(binding.edtEmail.text.toString())) {
                binding.edtEmail.error = "Nhập email của bạn"
                return@setOnClickListener
            } else if (TextUtils.isEmpty(binding.edtPass.text.toString())) {
                binding.edtPass.error = "Nhập mật khẩu của bạn"
                return@setOnClickListener
            }
            login(binding.edtEmail.text.toString(), binding.edtPass.text.toString())
        }
    }

    private fun login(email: String, pass: String) {
        auth.signInWithEmailAndPassword(email, pass)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("email",email)
                    startActivity(intent)



//                    val intent1 = Intent(this, AccountFragment::frag)
//                    intent.putExtra("email",email)
//                    startActivity(intent1)
                } else {
                    Log.d(TAG, "login: Failed")
                }
            }
    }
}


