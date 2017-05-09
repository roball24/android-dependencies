package com.example.robbyallen.deptesting.services.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class NetworkManager {

    val BASE_URL = "http://10.0.2.2:9090/api/"
    var interceptor : HttpLoggingInterceptor = HttpLoggingInterceptor()
    var client : OkHttpClient
    var retrofit : Retrofit
    var projectApi : ProjectApi
    var authNetwork : AuthNetwork

    init {
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        projectApi = retrofit.create(ProjectApi::class.java)

        authNetwork = AuthNetwork(projectApi)
    }
}
