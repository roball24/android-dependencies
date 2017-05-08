package com.example.robbyallen.deptesting.ui.login

import android.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.robbyallen.deptesting.R
import com.example.robbyallen.deptesting.models.Login
import com.example.robbyallen.deptesting.ui.MainActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_login.*
import org.reactivestreams.Subscriber

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater!!.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginButton.setOnClickListener { v -> submit(v) }
    }

    fun submit(v : View) {
        (activity as MainActivity).networkManager.authNetwork
                .login(loginUsername.text.toString(), loginPassword.text.toString())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe{
                    fun onNext(login : Login) {
                        Log.d("roball", "Logged In!")
                    }
                    fun onError(e : Throwable){
                        Log.d("roball", "Login Error") // TODO: error handle
                    }
                    fun onCompleted() = Unit
                }
    }
}
