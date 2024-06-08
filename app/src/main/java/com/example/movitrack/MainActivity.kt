package com.example.movitrack

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnregister: Button = findViewById(R.id.btnregister)

        btnregister.setOnClickListener { view: View? ->
            val intent = Intent(this, REGISTRO::class.java)
            startActivity(intent)
        }

        val btnsecion: Button = findViewById(R.id.btnsecion)

        btnsecion.setOnClickListener { view: View? ->
            val intent = Intent(this, inicio::class.java)
            startActivity(intent)
        }
    }
}






