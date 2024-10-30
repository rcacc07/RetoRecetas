package com.example.reto_recetas.presentation.iuScreen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "List recipes") {

        composable("List recipes"){
            RecipesListScreen(navController = navController)
        }



    }




}