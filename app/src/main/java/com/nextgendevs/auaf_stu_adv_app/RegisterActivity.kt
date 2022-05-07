package com.nextgendevs.auaf_stu_adv_app

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)

        val db = DatabaseHelper(this);

        // Login Button On Click Listener

        val loginBtn = findViewById<TextView>(R.id.loginBtn)
        loginBtn.setOnClickListener {
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }


        // Register Button OnClickListener

        val registerBtn = findViewById<Button>(R.id.registerBtn)
        registerBtn.setOnClickListener {

            // Import Data from Text Fields
            val emailTextEdit = findViewById<TextInputEditText>(R.id.emailInput)
            val passTextEdit = findViewById<TextInputEditText>(R.id.passwordInput)
            val idTextEdit = findViewById<TextInputEditText>(R.id.idTextInput)

            // Convert TextEdit data into String
            val emailInput = emailTextEdit.text.toString()
            val passInput = passTextEdit.text.toString()
            val idInput =  idTextEdit.text.toString()

            // Email Address Validation
            if(emailInput.isNotEmpty() && passInput.isNotEmpty() && idInput.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
                db.registerUser(idInput.toInt(),emailInput,passInput)
                Toast.makeText(this@RegisterActivity, "You Account Has Been Registered", Toast.LENGTH_SHORT).show();

                emailTextEdit.setText("")
                passTextEdit.setText("")
                idTextEdit.setText("")
            } else {
                Toast.makeText(this@RegisterActivity, "Please Fill Out All Fields", Toast.LENGTH_SHORT).show();
            }


        }

        // Facebook Button OnClickListener

        val facebookBtn = findViewById<ImageButton>(R.id.facebookBtn)
        facebookBtn.setOnClickListener {
            Toast.makeText(this@RegisterActivity, "Facebook Button Clicked", Toast.LENGTH_SHORT).show()
        }

        // Instagram Button OnClickListener

        val instagramBtn = findViewById<ImageButton>(R.id.instagramBtn)
        instagramBtn.setOnClickListener {
            Toast.makeText(this@RegisterActivity, "Instagram Button Clicked", Toast.LENGTH_SHORT).show()
        }

        // LinkedIn Button OnClickListener

        val linkedInBtn = findViewById<ImageButton>(R.id.linkedinBtn)
        linkedInBtn.setOnClickListener {
            Toast.makeText(this@RegisterActivity, "Linkedin Button Clicked", Toast.LENGTH_SHORT).show()
        }

        // Twitter Button OnClickListener

        val twitterBtn = findViewById<ImageButton>(R.id.twitterBtn)
        twitterBtn.setOnClickListener {
            Toast.makeText(this@RegisterActivity, "Twitter Button Clicked", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        this.finish()
        }
}