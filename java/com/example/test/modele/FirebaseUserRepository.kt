package com.example.test.modele

import com.google.firebase.auth.FirebaseAuth


class FirebaseUserRepository: User_repository {

    private lateinit var auth: FirebaseAuth

    init {
        auth = FirebaseAuth.getInstance()
    }

    override fun logIn(
        email: String,
        password: String,
        closure: (exception: Exception?) -> Unit
    ) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                    closure(null)
                } else {
                    val exception = Exception("pas réussi a se connecter")
                    closure(exception)
                }
            }
    }

    override fun signUp(
        email: String,
        password: String,
        closure: (exception: Exception?) -> Unit
    ) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                    closure(null)
                } else {
                    val exception = Exception("pas réussi a se connecter")
                    closure(exception)
                }
            }
    }
}