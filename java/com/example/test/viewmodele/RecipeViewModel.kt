package com.example.test.viewmodele

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RecipeViewModel() : ViewModel() {

   /* fun OnViewAppear(){
        viewModelScope.launch { fetchRecipes() }
    }

    suspend fun fetchRecipes(){
        val result =  get("https://recipes.com/myId")

        show(result)
    }

    suspend fun get(url: String) =
        withContext(Dispatchers.IO){
            // make long API request
        }

    fun show(...){
        //Display data
    } */

}