package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv: TextView
    lateinit var bt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tvTest)
        tv.text="1111"
        bt = findViewById(R.id.bTest)
        bt.setOnClickListener{
            tv.text = "2222"
        }



    }

    override fun onPause() {
        super.onPause()

    }




}