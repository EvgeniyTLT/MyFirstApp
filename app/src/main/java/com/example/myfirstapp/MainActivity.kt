package com.example.myfirstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    val maxPerson = 90
    val currentPerson = 89

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.b1.setOnClickListener {
            if (maxPerson > currentPerson) {
                bindingClass.tvResult.text = "Все в порядке"
                bindingClass.tvResult.setBackgroundColor(Color.MAGENTA)
            } else bindingClass.tvResult.text = "Много народу"
        }
        bindingClass.b2.setOnClickListener {

        }
        bindingClass.b3.setOnClickListener {

        }

    }
}