package com.ideologics.BusTopper.Login

import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    lateinit var email : String
    lateinit var pass : String

    fun isComplete() : Boolean {
        return !email.isBlank() && !pass.isBlank()
    }


}

