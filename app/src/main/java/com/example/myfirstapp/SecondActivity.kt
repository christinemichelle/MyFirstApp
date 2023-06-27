package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //declaration and initialization of a button
        var btn_2 : Button = findViewById(R.id.btn_second)

        //setting Onclicklistener Function to btn_2
        btn_2.setOnClickListener {
            val prv_intent =Intent(this,MainActivity::class.java)
            startActivity(prv_intent)

        }

        /* Block comment or Multi-line comment
        * A comment describes or gives views on  what is written in a code
        * A comment is a statement that is used to explain a code or a block of code more readable
        * There are two types of comments which are single abd block comments
        * This is an example of a block comment*/
    }


}