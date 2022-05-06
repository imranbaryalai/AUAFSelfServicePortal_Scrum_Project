package com.nextgendevs.auaf_stu_adv_app

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)


        val loginBtn = findViewById<TextView>(R.id.loginBtn)
        loginBtn.setOnClickListener {
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        val registerBtn = findViewById<Button>(R.id.registerBtn)
        registerBtn.setOnClickListener {
            Toast.makeText(this@RegisterActivity, "Register Button Clicked", Toast.LENGTH_SHORT).show()
        }

        val facebookBtn = findViewById<ImageButton>(R.id.facebookBtn)
        facebookBtn.setOnClickListener {
            Toast.makeText(this@RegisterActivity, "Facebook Button Clicked", Toast.LENGTH_SHORT).show()
        }

        val InstagramBtn = findViewById<ImageButton>(R.id.instagramBtn)
        InstagramBtn.setOnClickListener {
            Toast.makeText(this@RegisterActivity, "Instagram Button Clicked", Toast.LENGTH_SHORT).show()
        }

        val LinkedInBtn = findViewById<ImageButton>(R.id.linkedinBtn)
        LinkedInBtn.setOnClickListener {
            Toast.makeText(this@RegisterActivity, "Linkedin Button Clicked", Toast.LENGTH_SHORT).show()
        }

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