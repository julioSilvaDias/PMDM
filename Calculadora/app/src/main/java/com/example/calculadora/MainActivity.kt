package com.example.calculadora

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var operationDone: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.textViewNum1).visibility = View.GONE

        findViewById<Button>(R.id.buttonNum1).setOnClickListener(this)
        findViewById<Button>(R.id.buttonNum2).setOnClickListener(this)
        findViewById<Button>(R.id.buttonNum3).setOnClickListener(this)
        findViewById<Button>(R.id.buttonNum4).setOnClickListener(this)
        findViewById<Button>(R.id.buttonNum5).setOnClickListener(this)
        findViewById<Button>(R.id.buttonNum6).setOnClickListener(this)
        findViewById<Button>(R.id.buttonNum7).setOnClickListener(this)
        findViewById<Button>(R.id.buttonNum8).setOnClickListener(this)
        findViewById<Button>(R.id.buttonNum9).setOnClickListener(this)
        findViewById<Button>(R.id.buttonNum0).setOnClickListener(this)
        findViewById<Button>(R.id.buttonMas).setOnClickListener(this)
        findViewById<Button>(R.id.buttonMenos).setOnClickListener(this)
        findViewById<Button>(R.id.buttonIgual).setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(view: View?) {
        val textView: TextView = findViewById(R.id.textViewNum)
        findViewById<TextView>(R.id.textViewNum1).visibility = View.GONE

        if (operationDone) {
            textView.text = ""
            operationDone = false
        } else {
            when (view?.id) {
                R.id.buttonNum1 -> textView.text =
                    textView.text.toString() + getString(R.string.txt_one)

                R.id.buttonNum2 -> textView.text =
                    textView.text.toString() + getString(R.string.txt_two)

                R.id.buttonNum3 -> textView.text =
                    textView.text.toString() + getString(R.string.txt_three)

                R.id.buttonNum4 -> textView.text =
                    textView.text.toString() + getString(R.string.txt_four)

                R.id.buttonNum5 -> textView.text =
                    textView.text.toString() + getString(R.string.txt_five)

                R.id.buttonNum6 -> textView.text =
                    textView.text.toString() + getString(R.string.txt_six)

                R.id.buttonNum7 -> textView.text =
                    textView.text.toString() + getString(R.string.txt_seven)

                R.id.buttonNum8 -> textView.text =
                    textView.text.toString() + getString(R.string.txt_eight)

                R.id.buttonNum9 -> textView.text =
                    textView.text.toString() + getString(R.string.txt_nine)

                R.id.buttonNum0 -> textView.text =
                    textView.text.toString() + getString(R.string.txt_zero)

                R.id.buttonMas -> textView.text =
                    textView.text.toString() + getString(R.string.txt_add)

                R.id.buttonMenos -> textView.text =
                    textView.text.toString() + getString(R.string.txt_substract)

                R.id.buttonResult -> {
                    try {
                        textView.text = doOperation(textView.text.toString())
                        operationDone = true
                    } catch (e: Exception) {
                        findViewById<TextView>(R.id.textError).visibility = View.VISIBLE
                        textView.text = ""
                    }
                }
            }
        }
    }
}