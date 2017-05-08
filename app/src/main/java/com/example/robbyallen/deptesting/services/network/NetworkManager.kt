package com.example.robbyallen.deptesting.services.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class NetworkManager {

    val BASE_URL = "http://10.0.2.2:9090/api/"

    var retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    var projectApi = retrofit.create(ProjectApi::class.java)

    var authNetwork = AuthNetwork(projectApi)
}
