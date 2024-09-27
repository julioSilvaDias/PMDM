package com.example.contenedoresprogramaticos

import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var gridLayout = findViewById<GridLayout>(R.id.gridLayout)
        var boton: Button
        boton.setLayoutParams(
            GridLayout.LayoutParams(1, )
        )
        boton.setBackgroundColor(R.color.white)
        gridLayout.addView(boton)



    }
}