package com.example.reto_recetas.data

data class RecipesResult(
    val page : Int,
    val result : List<RecipeDTO>,
    val total_pages : Int,
    val total_results : Int
)