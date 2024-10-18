package com.example.reto_recetas.data.api


import com.example.reto_recetas.data.RecipesResult
import retrofit2.Response

import retrofit2.http.GET
import retrofit2.http.Query

interface RecipesApi {

    @GET("")
    suspend fun getRecipes(
        @Query("page") page: Int
    ): Response<RecipesResult>


}