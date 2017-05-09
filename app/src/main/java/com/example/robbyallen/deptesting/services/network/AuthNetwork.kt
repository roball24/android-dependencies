package com.example.robbyallen.deptesting.services.network

import com.example.robbyallen.deptesting.models.Login
import io.reactivex.Observable

class AuthNetwork(private var projectApi: ProjectApi) {

    class LoginBody(email : String, password: String){
        var email = email
        var password = password
    }


    fun login(username: String, password: String): Observable<Login> {
        return projectApi.login(LoginBody(username, password))
    }

}
