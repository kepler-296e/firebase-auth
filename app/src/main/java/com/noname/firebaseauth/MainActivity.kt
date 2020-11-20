package com.noname.firebaseauth

import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.noname.firebaseauth.auth.LoginActivity
import com.noname.firebaseauth.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private val auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_welcome_user.text = getString(R.string.welcome_user, auth.currentUser?.email)
        btn_sign_out.setOnClickListener { signOut() }
    }

    private fun signOut() {
        auth.signOut()
        startActivity(LoginActivity::class.java)
        finish()
    }
}