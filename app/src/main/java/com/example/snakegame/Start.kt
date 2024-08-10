package com.example.snakegame

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Start: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start)    // set the layout

        val start: Button=findViewById<Button>(R.id.start)   // Initialize the start button
        start.setOnClickListener(){       // set click listener for the start button
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)      // start the main activity
        }

    }
}