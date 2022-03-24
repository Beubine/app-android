package com.example.test.viewmodele

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.test.modele.FirebaseUserRepository
import com.example.test.modele.User_repository

class LogInViewModel : ViewModel() {

    private lateinit var repository: User_repository

    var email: MutableLiveData<String>
    var password: MutableLiveData<String>
    var succeed: MutableLiveData<Boolean>

    init {
        email = MutableLiveData("")
        password = MutableLiveData("")
        succeed = MutableLiveData(false)
        repository = FirebaseUserRepository()
    }

    fun logIn() {
        if (email.value != null && password.value != null) {
            repository.logIn(
                email.value!!,
                password.value!!
            ) { exception ->
                Unit
                if (exception != null) {
                    println("ca n'a pas marche")
                } else {
                    println("ca marche")
                    succeed.postValue(true)
                }
            }
        }
    }
}