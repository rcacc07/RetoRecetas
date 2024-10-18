package com.example.reto_recetas.data.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {


    val token = ""
    private const val baseURL = ""

    private fun getInstance(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().addInterceptor {
                chain ->
                val request = chain
                    .request()
                    .newBuilder()
                    .addHeader("",token)
                    .build()

                chain.proceed(request)
            }.build()).build()

    }
}