package com.example.volumecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CylinderActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cylinder)

        val textView : TextView = findViewById(R.id.textview2)
        val result = findViewById<TextView>(R.id.textview3)
        val button : Button = findViewById(R.id.button)
        val editext = findViewById<EditText>(R.id.edittext1)

        button.setOnClickListener {
            var side= editext.text.toString()
            var r= Integer.parseInt(side)
            var height=editext.text.toString()
            var h = Integer.parseInt(height)
            var volume = 3.14*r*h
            result.text = "V = $volume cm^3"

        }
    }
}