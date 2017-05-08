package com.example.robbyallen.deptesting.ui

import android.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.robbyallen.deptesting.R
import com.example.robbyallen.deptesting.services.network.NetworkManager
import com.example.robbyallen.deptesting.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {

    // Services
    var networkManager = NetworkManager()

    // Fragments
    var loginFragment = LoginFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        fragmentTransaction.replace(R.id.main_container, loginFragment)
        fragmentTransaction.commit()
    }
}
