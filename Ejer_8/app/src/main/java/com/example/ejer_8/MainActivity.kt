package com.example.ejer_8

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val SUBACTIVITY_1 = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        llamarOtraActividad()
    }

    fun llamarOtraActividad() {
        var opcion = ""
        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent(applicationContext, ProvinciaActivity::class.java)
            intent.putExtra("Eleccion", opcion)
            startActivityForResult(intent, SUBACTIVITY_1)
        }
    }
}