package com.example.reto_recetas.data

data class RecipeDTO (

    val id : Int,
    val name : String,
    val ingredientes : String,
    val preparacion : String,
    val urlImage : String,
    val time : String

    )