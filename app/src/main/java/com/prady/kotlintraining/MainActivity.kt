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
        rollDice()
        supportActionBar?.title = "KotlinTraining: Dice Roll"
    }

    private fun rollDice() {
        val dice = dice(6)
        val diceroll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.contentDescription = diceroll.toString()
        val drawableResource = when (diceroll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

    class dice(val numside: Int) {
        fun roll(): Int {
            return (1..numside).random()
        }
    }

}