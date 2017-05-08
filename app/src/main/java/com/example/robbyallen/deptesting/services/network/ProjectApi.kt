package com.example.robbyallen.deptesting.services.network

import com.example.robbyallen.deptesting.models.Login
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ProjectApi {

    @FormUrlEncoded
    @POST("login")
    fun login(@Field("username") username: String,
              @Field("password") password: String)
            : Observable<Login>

}