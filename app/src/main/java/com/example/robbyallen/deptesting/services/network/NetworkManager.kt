package com.example.robbyallen.deptesting.services.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class NetworkManager {

    val BASE_URL = "http://10.0.2.2:9090/api/"
    var authNetwork : AuthNetwork

    init {
        var interceptor : HttpLoggingInterceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        var client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        var retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        // auth
        var projectApi = retrofit.create(ProjectApi::class.java)
        authNetwork = AuthNetwork(projectApi)
    }
}
