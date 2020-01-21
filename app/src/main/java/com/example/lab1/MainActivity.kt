package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val testButton = findViewById(R.id.button) as Button

        testButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Its toast!", Toast.LENGTH_SHORT).show()
        }

        // get reference to button
        val mapButton = findViewById(R.id.mapButton) as Button
        mapButton.setOnClickListener {

        }

    }
}
