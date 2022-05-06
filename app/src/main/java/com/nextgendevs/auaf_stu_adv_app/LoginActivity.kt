package com.nextgendevs.auaf_stu_adv_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        // Login Button OnClickListener

        val loginBtn = findViewById<Button>(R.id.loginBtn)
        loginBtn.setOnClickListener {

            val emailTextEdit = findViewById<TextInputEditText>(R.id.emailInput)
            val passTextEdit = findViewById<TextInputEditText>(R.id.passwordInput)

            val emailInput = emailTextEdit.text.toString()
            val passwordInput = passTextEdit.text.toString()

            println("Email: $emailInput")
            println("Password: $passwordInput")

            val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
            if (emailInput.equals("admin") && passwordInput.equals("admin")){
                startActivity(intent)
            }

        }

        // Register Button OnClickListener

        val registerBtn = findViewById<TextView>(R.id.registerBtn)
        registerBtn.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }

        // Facebook ImageButton OnClickListener

        val facebookBtn = findViewById<ImageButton>(R.id.facebookBtn)
        facebookBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Facebook Button Clicked", Toast.LENGTH_SHORT).show()
        }

        // Instagram ImageButton OnClickListener

        val InstagramBtn = findViewById<ImageButton>(R.id.instagramBtn)
        InstagramBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Instagram Button Clicked", Toast.LENGTH_SHORT).show()
        }

        // LinkedIn ImageButton OnClickListener

        val LinkedInBtn = findViewById<ImageButton>(R.id.linkedinBtn)
        LinkedInBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Linkedin Button Clicked", Toast.LENGTH_SHORT).show()
        }

        // Twitter ImageButton OnClickListener

        val twitterBtn = findViewById<ImageButton>(R.id.twitterBtn)
        twitterBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Twitter Button Clicked", Toast.LENGTH_SHORT).show()
        }

    }
}