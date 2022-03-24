package com.example.test.viewmodele

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.test.modele.FirebaseUserRepository
import com.example.test.modele.User_repository

    class SignUpViewModel : ViewModel() {

        private lateinit var repository : User_repository

        var email: MutableLiveData<String>
        var password: MutableLiveData<String>
        var confirm: MutableLiveData<String>
        var succeed: MutableLiveData<Boolean>

        init {
            email = MutableLiveData("")
            password = MutableLiveData("")
            confirm = MutableLiveData("")
            succeed = MutableLiveData(false)
            repository = FirebaseUserRepository()
        }

        fun signUp() {
            if (email.value != null && password.value != null && confirm.value != null && password.value == confirm.value) {
                repository.signUp(
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