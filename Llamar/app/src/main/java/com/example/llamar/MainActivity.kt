package com.example.llamar

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i=0

        findViewById<ImageButton>(R.id.imageButtonLlamar).setOnClickListener {
            i++

            if(i==1){
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.walterwhite2)
                findViewById<TextView>(R.id.textView).setText(R.string.llamando)
                findViewById<ImageButton>(R.id.imageButtonLlamar).setImageResource(R.drawable.colgar)

            }else{
                i=0
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.walterwhite)
                findViewById<TextView>(R.id.textView).setText(R.string.llamadaTerminada)
                findViewById<ImageButton>(R.id.imageButtonLlamar).setImageResource(R.drawable.llamar)
            }
        }
    }
}