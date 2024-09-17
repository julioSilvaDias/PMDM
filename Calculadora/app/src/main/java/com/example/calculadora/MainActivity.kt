package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText = findViewById<EditText>(R.id.editTextNumber)
        val num0 = findViewById<Button>(R.id.buttonNum0)
        val num1 = findViewById<Button>(R.id.buttonNum1)
        val num2 = findViewById<Button>(R.id.buttonNum2)
        val num3 = findViewById<Button>(R.id.buttonNum3)
        val num4 = findViewById<Button>(R.id.buttonNum4)
        val num5 = findViewById<Button>(R.id.buttonNum5)
        val num6 = findViewById<Button>(R.id.buttonNum6)
        val num7 = findViewById<Button>(R.id.buttonNum7)
        val num8 = findViewById<Button>(R.id.buttonNum8)
        val num9 = findViewById<Button>(R.id.buttonNum9)
        val btnComa = findViewById<Button>(R.id.buttonComa)
        val btnIgual = findViewById<Button>(R.id.buttonIgual)
        val btnSum = findViewById<Button>(R.id.buttonMas)
        val btnRes = findViewById<Button>(R.id.buttonMenos)
        val btnMult = findViewById<Button>(R.id.buttonMultiplicacion)
        val btnDiv = findViewById<Button>(R.id.buttonDivision)
        val btnCompart = findViewById<Button>(R.id.buttonCompartir)
        val btnAc = findViewById<Button>(R.id.buttonAc)

        num0.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "0")
        }

        num1.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "1")
        }

        num2.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "2")
        }

        num3.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "3")
        }

        num4.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "4")
        }
        num5.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "5")
        }

        num6.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "6")
        }

        num7.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "7")
        }

        num8.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "8")
        }

        num9.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "9")
        }

        btnAc.setOnClickListener{
            editText.setText("")
        }

        btnComa.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + ",")
        }

        num9.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "9")
        }

        btnDiv.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "/")
        }

        btnSum.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "+")
        }

        btnRes.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "-")
        }

        btnSum.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "+")
        }

        btnMult.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(textoActual + "X")
        }

        btnIgual.setOnClickListener{
            val textoActual = editText.text.toString()
            operaciones(textoActual)

        }
    }

    fun operaciones(operacion:String){
        ;


    }
}