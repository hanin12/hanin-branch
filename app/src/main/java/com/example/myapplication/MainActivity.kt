package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun buClickEvent(view: View){
        val yearOfBirth=itUserYearOfBirth.text.toString().toInt()
        val currentYear=Calendar.getInstance().get(Calendar.YEAR)
        val age= currentYear-yearOfBirth
        tvShowAge.text="your age"+age+"years"
    }
}