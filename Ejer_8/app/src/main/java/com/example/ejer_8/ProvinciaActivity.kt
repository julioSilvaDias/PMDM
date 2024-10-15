package com.example.ejer_8

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProvinciaActivity : AppCompatActivity() {
    private var eleccion: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_provincia)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            eleccion = when (checkedId) {
                R.id.provBizkaia -> getString(R.string.bizkaia)
                R.id.provAraba -> getString(R.string.araba)
                R.id.provLapurdi -> getString(R.string.lapundi)
                R.id.provNavarra -> getString(R.string.navarra)
                else -> null
            }
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            val intent = Intent()

            if (eleccion != null) {
                intent.putExtra("PROVINCIA", eleccion)
                setResult(Activity.RESULT_OK, intent)
            } else {
                setResult(Activity.RESULT_CANCELED, intent)
            }

            finish()
        }
    }
}