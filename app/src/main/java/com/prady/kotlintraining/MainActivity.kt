package com.prady.kotlintraining

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val diceImage: ImageView = findViewById(R.id.imageView)
        when (diceroll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }

    class dice(val numside: Int) {
        fun roll(): Int {
            return (1..numside).random()
        }
    }

}