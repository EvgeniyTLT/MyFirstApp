package com.example.myfirstapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.myfirstapp.constance.Constance

import com.example.myfirstapp.databinding.ActivitySingUpInBinding


class SignInUpAct : AppCompatActivity() {
    lateinit var bindingClass: ActivitySingUpInBinding
    private var singState = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySingUpInBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        singState = intent.getStringExtra(Constance.SING_STATE)!!
        if (singState == Constance.SING_IN_STATE) {
            bindingClass.edName.visibility = View.GONE
            bindingClass.edName2.visibility = View.GONE
            bindingClass.edName3.visibility = View.GONE
            bindingClass.bAvatar.visibility = View.INVISIBLE
        }
    }

    fun onClickDone(view: View) {
        if (singState == Constance.SING_UP_STATE) {
            val intent = Intent()
            intent.putExtra(Constance.LOGIN, bindingClass.edLogin.text.toString())
            intent.putExtra(Constance.PASSWORD, bindingClass.edPassword.text.toString())
            intent.putExtra(Constance.NAME, bindingClass.edName.text.toString())
            intent.putExtra(Constance.NAME2, bindingClass.edName.text.toString())
            intent.putExtra(Constance.NAME3, bindingClass.edName2.text.toString())
            intent.putExtra(Constance.LOGIN, bindingClass.edName3.text.toString())
            if (bindingClass.imAvatar.isVisible) intent.putExtra(Constance.AVATAR_ID,R.drawable.sergey_fase)
            setResult(RESULT_OK, intent)
            finish()
        } else if (singState == Constance.SING_IN_STATE) {
            val intent = Intent()
            intent.putExtra(Constance.LOGIN, bindingClass.edLogin.text.toString())
            intent.putExtra(Constance.PASSWORD, bindingClass.edPassword.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }


    }

    fun onClickAvatar(view: View) {
        bindingClass.imAvatar.visibility = View.VISIBLE
    }

}