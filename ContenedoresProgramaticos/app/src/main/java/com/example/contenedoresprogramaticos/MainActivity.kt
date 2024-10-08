package com.example.contenedoresprogramaticos

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val numButtons = 18
    private val buttons = arrayOfNulls<Button>(numButtons)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridLayout = findViewById<GridLayout>(R.id.gridLayout)

        for(i in 0 until numButtons){
            buttons[i] = Button(this).apply {
                layoutParams = GridLayout.LayoutParams().apply {
                    width=GridLayout.LayoutParams.WRAP_CONTENT
                    height=GridLayout.LayoutParams.WRAP_CONTENT
                }

                if(i==numButtons-1){
                    text = "Reset"
                    setBackgroundColor(Color.WHITE)
                    setOnClickListener{resetButtons()}
                }else{
                    setBackgroundColor(getRandomColor())
                    setOnClickListener{setBackgroundColor(Color.WHITE)}
                }
            }

            gridLayout.addView(buttons[i])
        }
    }

    fun getRandomColor(): Int{
        return Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
    }

    fun resetButtons(){
        for(i in 0 until  numButtons -1){
            buttons[i]?.setBackgroundColor(getRandomColor())
        }
    }
}