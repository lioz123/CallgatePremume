package com.example.callgatepremume.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.callgatepremume.Contracts.RegisterContract
import com.example.callgatepremume.R
import com.firebase.ui.auth.AuthUI

class LoginActivity : AppCompatActivity() {
    val RC_SIGN_IN=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    private fun login(){
       val providers = arrayListOf( AuthUI.IdpConfig.PhoneBuilder().build())
           //  startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().setAvailableProviders(providers).build(),RC_SIGN_IN)

    }

    private fun startRegister(){

    }

    private val registerLuancher=  registerForActivityResult(RegisterContract()){

    }

    private fun checkUserState(){

    }





}