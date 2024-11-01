package com.example.reto_recetas.data.api


import com.example.reto_recetas.data.RecipesResult
import retrofit2.Response
import retrofit2.http.GET

interface RecipesApi {

    @GET("listRecipes")
    suspend fun getRecipes(): Response<RecipesResult>


}