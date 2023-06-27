package com.example.myfirstapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //fundamentals of kotlin

        var btn_1 : Button = findViewById(R.id.btn_main)

        btn_1.setOnClickListener {
            val nxt_intent = Intent(this,SecondActivity::class.java)
            startActivity(nxt_intent)
        }


    }
}