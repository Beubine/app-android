package com.example.test.modele

interface User_repository {

    fun logIn(email: String, password: String, closure: (exception: Exception?) -> Unit)

    fun signUp(email: String, password: String, closure: (exception: Exception?)->Unit)
}