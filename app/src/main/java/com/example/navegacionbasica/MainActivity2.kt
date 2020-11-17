package com.example.navegacionbasica

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    companion object {
        const val botonActivity2 = "Imagen"
    }
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.segundaactivity_main)
            val Imagen = findViewById<ImageView>(R.id.ic_logo)

            val src = intent.getStringExtra(botonActivity2)

            src?.let {
                Imagen.setImageResource(R.drawable.ic_logo)
            }
        }
}