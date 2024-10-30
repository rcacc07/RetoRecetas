package com.example.reto_recetas.data.repository

import com.example.reto_recetas.data.RecipesResult
import com.example.reto_recetas.data.api.RetrofitInstance
import retrofit2.Response

class RecipesRepository {

    suspend fun getRecipes(page : Int) : Response<RecipesResult>{
        return RetrofitInstance.recipesApi.getRecipes()
    }
}