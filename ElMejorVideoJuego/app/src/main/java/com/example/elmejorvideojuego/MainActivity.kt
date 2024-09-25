package com.example.elmejorvideojuego

import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.txt2)
        var i =0

       findViewById<RadioButton>(R.id.radioButton).setOnClickListener{
            textView.setText(R.string.txtEleccionFallout)
       }

        findViewById<RadioButton>(R.id.radioButton2).setOnClickListener{
            textView.setText(R.string.txtEleccionLol)
        }

        findViewById<RadioButton>(R.id.radioButton3).setOnClickListener{
            textView.setText(R.string.txtEleccionFortnite)
        }

        findViewById<RadioButton>(R.id.radioButton4).setOnClickListener{
            textView.setText(R.string.txtEleccionTeam)
        }

        findViewById<CheckBox>(R.id.checkBox).setOnClickListener{
            i++
            var checkBox= findViewById<CheckBox>(R.id.checkBox)

            if (i==2){
                checkBox.setText(R.string.noMola)
                i=0
            }else{
                checkBox.setText(R.string.mola)
            }

        }
    }
}