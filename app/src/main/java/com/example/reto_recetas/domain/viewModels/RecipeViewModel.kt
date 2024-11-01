package com.example.reto_recetas.domain.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.reto_recetas.data.RecipeDTO
import com.example.reto_recetas.data.repository.RecipesRepository
import kotlinx.coroutines.launch

class RecipeViewModel : ViewModel() {

    val token = ""
    private val repository  = RecipesRepository()
    var state by mutableStateOf(ScreenState())

    init {
        loadNextItems()
    }

    private fun loadNextItems(){
        viewModelScope.launch {
            state = state.copy(
                isLoading = true
            )

            val response = repository.getRecipes(1)

            if (response.isSuccessful){
                state = state.copy(
                    isLoading = false,
                    recipes = response.body()!!.result
                )
            }
        }
    }
}


data class ScreenState(
    val recipes : List<RecipeDTO> = emptyList(),
    val page : Int = 1,
    val endReached : Boolean = false,
    val error : String ?= null,
    val isLoading : Boolean = false

)