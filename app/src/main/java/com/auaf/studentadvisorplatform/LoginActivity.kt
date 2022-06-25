package com.auaf.studentadvisorplatform

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val db = DatabaseHelper(this)

        // Login Button OnClickListener

        val loginBtn = findViewById<Button>(R.id.loginBtn)
        loginBtn.setOnClickListener {

            val emailTextEdit = findViewById<TextInputEditText>(R.id.emailInput)
            val passTextEdit = findViewById<TextInputEditText>(R.id.passwordInput)

            val emailInput = emailTextEdit.text.toString().trim()
            val passwordInput = passTextEdit.text.toString().trim()

            if(emailInput.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){

                val intent = Intent(this@LoginActivity, DashboardActivity::class.java)

                if (db.checkUserPass(emailInput, passwordInput)){

                    Toast.makeText(this@LoginActivity, "Sign in Successful!", Toast.LENGTH_SHORT).show()
                    startActivity(intent)

                } else {

                    Toast.makeText(this@LoginActivity, "Email or Password Invalid!", Toast.LENGTH_SHORT).show()

                }

            } else {

                Toast.makeText(applicationContext, "Please Enter a Valid Email Address!", Toast.LENGTH_SHORT).show()
            }

            println("Email: $emailInput")
            println("Password: $passwordInput")



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

        val instagramBtn = findViewById<ImageButton>(R.id.instagramBtn)
        instagramBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Instagram Button Clicked", Toast.LENGTH_SHORT).show()
        }

        // LinkedIn ImageButton OnClickListener

        val linkedInBtn = findViewById<ImageButton>(R.id.linkedinBtn)
        linkedInBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Linkedin Button Clicked", Toast.LENGTH_SHORT).show()
        }

        // Twitter ImageButton OnClickListener

        val twitterBtn = findViewById<ImageButton>(R.id.twitterBtn)
        twitterBtn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Twitter Button Clicked", Toast.LENGTH_SHORT).show()
        }

    }

}