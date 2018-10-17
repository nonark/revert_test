package com.example.nhnent.revert_test

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button : Button = findViewById<Button>(R.id.button_01)
        button.setOnClickListener {
            var intent : Intent = Intent(MainActivity@this, AProjectActivity@this::class.java)
            startActivity(intent)
        }
    }
}
