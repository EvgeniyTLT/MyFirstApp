package com.example.myfirstapp

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
    val a = 324
    val b = 34

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.b1.setOnClickListener {
            val result = a + b
            bindingClass.tvResult.text = "Результат сложения равен: $result"
        }
        bindingClass.b2.setOnClickListener {
            val result = a - b
            bindingClass.tvResult.text = "Результат вычитания равен: $result"
        }
        bindingClass.b3.setOnClickListener {
            val result = a * b
            bindingClass.tvResult.text = "Результат умножения равен: $result"
        }

    }
}