package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClickTest(view: View) {
        val tvTest = findViewById<TextView>(R.id.tvTest)
        if (tvTest.text.equals("privet")) tvTest.text = "NOTprivet"
        else tvTest.text = "privet"

    }
}