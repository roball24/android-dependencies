package com.example.robbyallen.deptesting.services.network

import com.example.robbyallen.deptesting.models.Login
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface ProjectApi {

    @POST("login")
    fun login(@Body body : AuthNetwork.LoginBody)
            : Observable<Login>

}