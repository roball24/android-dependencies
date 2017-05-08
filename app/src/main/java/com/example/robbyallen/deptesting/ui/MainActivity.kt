package com.example.robbyallen.deptesting.ui

import android.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.robbyallen.deptesting.R
import com.example.robbyallen.deptesting.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {

    var loginFragment : LoginFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginFragment = LoginFragment()

        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        fragmentTransaction.replace(R.id.main_container, loginFragment)
        fragmentTransaction.commit()
    }
}
