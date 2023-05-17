package com.example.test00

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val imageButton = findViewById<View>(R.id.IntroBtn1) as Button
        imageButton.setOnClickListener {
            val intent = Intent(applicationContext, loginActivity::class.java)
            startActivity(intent)
        }
    }
}