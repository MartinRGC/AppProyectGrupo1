package com.algarrobo.splashfoodloversappmg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loging)

        val btnLogin: Button = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val intent = Intent(this,NavegacionActivity::class.java)
            startActivity(intent)
        }
    }
}