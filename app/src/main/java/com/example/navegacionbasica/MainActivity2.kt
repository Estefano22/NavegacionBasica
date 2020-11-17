package com.example.navegacionbasica

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.segundaactivity_main)
            val Imagen = findViewById<ImageView>(R.id.ic_logo)
                Imagen.setImageResource(R.drawable.ic_logo)
            }
        }
