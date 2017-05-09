package com.example.robbyallen.deptesting.services.network.auth

import com.example.robbyallen.deptesting.models.Login
import com.example.robbyallen.deptesting.services.network.auth.AuthNetwork
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {

    @POST("login")
    fun login(@Body body : AuthNetwork.LoginBody)
            : Observable<Login>

}