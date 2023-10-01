package com.algarrobo.splashfoodloversappmg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btngetstart: Button = findViewById(R.id.btngetstart)

        btngetstart.setOnClickListener {
            val intent = Intent(this, LogingActivity::class.java)
            startActivity(intent)
        }



    }
}