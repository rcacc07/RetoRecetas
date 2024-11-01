package com.example.reto_recetas.data.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val token = ""
    private const val baseURL = "http://demo4755037.mockable.io/"

    private fun getInstance(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }


    val recipesApi : RecipesApi = getInstance().create(RecipesApi::class.java)
}