package com.example.myapp2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun makeColored(view: View){
        when(view.id){
            R.id.boxOne -> view.setBackgroundColor(Color.YELLOW)
            R.id.boxTwo -> view.setBackgroundColor(Color.BLUE)
            R.id.boxThree -> view.setBackgroundColor(Color.RED)
            R.id.boxFour -> view.setBackgroundColor(Color.GREEN)
            R.id.boxFive -> view.setBackgroundColor(Color.CYAN)
        }
    }

    private fun setListener(){
        val boxOneTxt = findViewById<TextView>(R.id.boxOne)
        val boxTwoTxt = findViewById<TextView>(R.id.boxTwo)
        val boxThreeTxt = findViewById<TextView>(R.id.boxThree)
        val boxFourTxt = findViewById<TextView>(R.id.boxFour)
        val boxFiveTxt = findViewById<TextView>(R.id.boxFive)

        val clickableViews: List<View> = listOf(boxOneTxt, boxTwoTxt, boxThreeTxt, boxFourTxt,boxFiveTxt)

        for(item in clickableViews){
            item.setOnClickListener{makeColored(it)}


        }

        for(item in clickableViews){
            item.setOnClickListener{makeColored(it)}
        }
    }
}