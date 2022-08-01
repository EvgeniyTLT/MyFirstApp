package com.example.myfirstapp

class User(var name: String, var id: String,var age: Int) {
        fun addAge(years: Int){
            age= age.plus(years)
        }

}