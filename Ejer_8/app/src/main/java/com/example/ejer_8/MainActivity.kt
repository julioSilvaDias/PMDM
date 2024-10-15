package com.example.ejer_8

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val SUBACTIVITY_1 = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent(this, ProvinciaActivity::class.java)
            startActivityForResult(intent, SUBACTIVITY_1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val textView = findViewById<TextView>(R.id.textView2)

        if (requestCode == SUBACTIVITY_1) {
            if (resultCode == RESULT_OK) {
                val provincia = data?.getStringExtra("PROVINCIA")
                textView.text = provincia ?: "No se seleccionó provincia"
            } else {
                textView.text = "No se seleccionó provincia"
            }
        }
    }
}
