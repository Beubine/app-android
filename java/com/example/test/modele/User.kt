package com.example.test.modele

class User() : User_repository {

    override fun logIn(
        email: String,
        password: String,
        closure: (exception: Exception?) -> Unit
    ) {
        closure(null)
    }

    override fun signUp(
        email: String,
        password: String,
        closure: (exception: Exception?) -> Unit
    ) {
        closure(null)
    }
}