package com.nextgendevs.auaf_stu_adv_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val loginBtn = findViewById<Button>(R.id.loginBtn)
        loginBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Login Button Clicked", Toast.LENGTH_SHORT).show()
        }

        val registerBtn = findViewById<Button>(R.id.registerBtn)
        registerBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Register Button Clicked", Toast.LENGTH_SHORT).show()
        }

        val facebookBtn = findViewById<ImageButton>(R.id.facebookBtn)
        facebookBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Facebook Button Clicked", Toast.LENGTH_SHORT).show()
        }

        val InstagramBtn = findViewById<ImageButton>(R.id.instagramBtn)
        InstagramBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Instagram Button Clicked", Toast.LENGTH_SHORT).show()
        }

        val LinkedInBtn = findViewById<ImageButton>(R.id.linkedinBtn)
        LinkedInBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Linkedin Button Clicked", Toast.LENGTH_SHORT).show()
        }

        val twitterBtn = findViewById<ImageButton>(R.id.twitterBtn)
        twitterBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Twitter Button Clicked", Toast.LENGTH_SHORT).show()
        }


    }
}