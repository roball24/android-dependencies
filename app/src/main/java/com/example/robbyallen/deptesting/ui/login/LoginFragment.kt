package com.example.robbyallen.deptesting.ui.login

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.robbyallen.deptesting.R
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * Created by robbyallen on 5/8/17.
 */

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater!!.inflate(R.layout.fragment_login, container, false)
    }
}