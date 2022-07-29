package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.constance.Constance
import com.example.myfirstapp.databinding.ActivityMainBinding
import com.example.myfirstapp.databinding.ActivityMainBinding.inflate
import com.example.myfirstapp.databinding.ActivitySingUpInBinding


class SignInUpAct : AppCompatActivity() {
    lateinit var bindingClass: ActivitySingUpInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySingUpInBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        val message = intent.getStringExtra(Constance.SING_STATE)


    }


}