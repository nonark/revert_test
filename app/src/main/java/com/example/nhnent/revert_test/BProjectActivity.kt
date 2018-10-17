package com.example.nhnent.revert_test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class BProjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_project)

        var button : Button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(BProjectActivity@ this, "B Project", Toast.LENGTH_SHORT).show()
        }
    }
}
