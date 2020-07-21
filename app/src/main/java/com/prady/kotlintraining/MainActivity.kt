package com.prady.kotlintraining

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn: Button = findViewById(R.id.button)
        rollBtn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = dice(6)
        val diceroll = dice.roll()
        val resultText: TextView = findViewById(R.id.textView)
        resultText.text = diceroll.toString()
    }

    class dice(val numside: Int) {
        fun roll(): Int {
            return (1..numside).random()
        }
    }

}