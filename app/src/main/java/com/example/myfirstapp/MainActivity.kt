package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.constance.Constance

import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var name2: String = "empty"
    private var avatarImageId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Constance.REQUEST_COD_SING_IN) {

        } else if (requestCode == Constance.REQUEST_COD_SING_UP) {

        }
    }

    fun onClickSingIn(view: View) {
        val intent = Intent(this, SignInUpAct::class.java)
        intent.putExtra(Constance.SING_STATE, Constance.SING_IN_STATE)
        startActivityForResult(intent, Constance.REQUEST_COD_SING_IN)
    }

    fun onClickSingUp(view: View) {
        val intent = Intent(this, SignInUpAct::class.java)
        intent.putExtra(Constance.SING_STATE, Constance.SING_UP_STATE)
        startActivityForResult(intent, Constance.REQUEST_COD_SING_UP)
    }

}