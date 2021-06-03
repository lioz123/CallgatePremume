package com.example.callgatepremume.Contracts

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import com.firebase.ui.auth.AuthUI

class RegisterContract:ActivityResultContract<Int,Boolean>() {
    override fun createIntent(context: Context, input: Int?): Intent {
        val providers = arrayListOf(AuthUI.IdpConfig.PhoneBuilder().build())
        return AuthUI.getInstance().createSignInIntentBuilder().setAvailableProviders(providers).build()
    }

    override fun parseResult(resultCode: Int, intent: Intent?)=  resultCode==Activity.RESULT_OK
}