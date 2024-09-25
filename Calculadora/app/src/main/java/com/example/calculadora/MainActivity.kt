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

class MainActivity : AppCompatActivity(), View.OnClickListener {
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
        }

        when (view?.id) {
            R.id.buttonNum1 -> textView.text = textView.text.toString() + getString(R.string.textNum1)
            R.id.buttonNum2 -> textView.text = textView.text.toString() + getString(R.string.textNum2)
            R.id.buttonNum3 -> textView.text = textView.text.toString() + getString(R.string.textNum3)
            R.id.buttonNum4 -> textView.text = textView.text.toString() + getString(R.string.textNum4)
            R.id.buttonNum5 -> textView.text = textView.text.toString() + getString(R.string.textNum5)
            R.id.buttonNum6 -> textView.text = textView.text.toString() + getString(R.string.textNum6)
            R.id.buttonNum7 -> textView.text = textView.text.toString() + getString(R.string.textNum7)
            R.id.buttonNum8 -> textView.text = textView.text.toString() + getString(R.string.textNum8)
            R.id.buttonNum9 -> textView.text = textView.text.toString() + getString(R.string.textNum9)
            R.id.buttonNum0 -> textView.text = textView.text.toString() + getString(R.string.textNum0)
            R.id.buttonMas -> textView.text = textView.text.toString() + getString(R.string.textMas)
            R.id.buttonMenos -> textView.text = textView.text.toString() + getString(R.string.textMenos)
            R.id.buttonIgual -> {
                try {
                    // Aquí puedes implementar la lógica de la operación en el futuro
                    operationDone = true
                } catch (e: Exception) {
                    findViewById<TextView>(R.id.textViewNum1).visibility = View.VISIBLE
                    textView.text = ""
                }
            }
        }
    }
}


@Throws(Exception::class)
fun doOperation(operation: String): String? {
    var ret: String? = null
    var firstNumber = ""
    var lastNumber = ""
    if (isAddition(operation)) {
        firstNumber = operation.substring(0, operation.lastIndexOf("+"))
        lastNumber = operation.substring(operation.lastIndexOf("+") + 1)
        ret =
            "" + add(firstNumber.trim { it <= ' ' }.toInt(),
                lastNumber.trim { it <= ' ' }.toInt())
    } else if (isSubtraction(operation)) {
        firstNumber = operation.substring(0, operation.lastIndexOf("-"))
        lastNumber = operation.substring(operation.lastIndexOf("-") + 1)
        ret = "" + substract(firstNumber.trim { it <= ' ' }.toInt(),
            lastNumber.trim { it <= ' ' }.toInt()
        )
    }
    return ret
}

private fun isAddition(operation: String): Boolean {
    var ret = false
    val countAdd = operation.length - operation.replace("+", "").length
    val countSubs = operation.length - operation.replace("-", "").length
    if (countAdd == 1 && countSubs == 0) ret = true
    return ret
}

private fun isSubtraction(operation: String): Boolean {
    var ret = false
    val countAdd = operation.length - operation.replace("-", "").length
    val countSubs = operation.length - operation.replace("+", "").length
    if (countAdd == 1 && countSubs == 0) ret = true
    return ret
}

private fun add(op1: Int, op2: Int): Int {
    return op1 + op2
}

private fun substract(op1: Int, op2: Int): Int {
    return op1 - op2
}