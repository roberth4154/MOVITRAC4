package com.example.movitrack

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class inicio : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicio)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnruta: Button = findViewById(R.id.btnrut)
        btnruta.setOnClickListener { view: View? ->
            val intent = Intent(this, rut::class.java)
            startActivity(intent)
        }

        val btnmapa: Button = findViewById(R.id.btnmapa)
        btnmapa.setOnClickListener { view: View? ->
            val intent = Intent(this, mapa::class.java)
            startActivity(intent)
        }

        val btnFAVORITOS: Button = findViewById(R.id.btnFAVORITOS)
        btnFAVORITOS.setOnClickListener { view: View? ->
            val intent = Intent(this,AZUL::class.java)
            startActivity(intent)
        }

        val btnpreguntas: Button = findViewById(R.id.btnpreguntas)
        btnpreguntas.setOnClickListener { view: View? ->
            val intent = Intent(this,PREGUNTAS::class.java)
            startActivity(intent)
        }
    }
}

