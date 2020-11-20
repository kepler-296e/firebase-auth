package com.noname.firebaseauth.base

import com.google.android.material.textfield.TextInputEditText
import com.noname.firebaseauth.R

open class AuthBaseActivity : BaseActivity() {

    fun showEmptyFieldError(textInputEditText: TextInputEditText) {
        textInputEditText.error = getString(R.string.empty_field)
    }
}