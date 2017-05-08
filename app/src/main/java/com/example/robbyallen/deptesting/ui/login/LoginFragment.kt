package com.example.robbyallen.deptesting.ui.login

import android.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.robbyallen.deptesting.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater!!.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginButton.setOnClickListener { v -> submit(v) }
    }

    fun submit(v : View){
        var usernameText = loginUsername.text
        var passwordText = loginPassword.text
        Log.d("roball", "button clicked!")
        Log.d("roball", "username: ${usernameText}")
        Log.d("roball", "password: ${passwordText}")
    }

}