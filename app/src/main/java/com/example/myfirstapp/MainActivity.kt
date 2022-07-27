package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.constance.Constance
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.btResult.setOnClickListener {
            val result = bindingClass.edValue.text.toString()

            when (result) {
                Constance.INGINER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.INGINER_ZP} рублей"
                    bindingClass.tvResult.text =
                        if (bindingClass.edPassword.text.toString() == Constance.INGINER_PASSWORD) {
                            tempText
                        } else {
                            "Введен не верный пароль"
                        }
                }
                Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DIRECTOR_ZP} рублей"
                    bindingClass.tvResult.text =
                        if (bindingClass.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD) {
                            tempText
                        } else {
                            "Введен не верный пароль"
                        }
                }
                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Нет такого рабочего"
                }
            }
        }
    }
}