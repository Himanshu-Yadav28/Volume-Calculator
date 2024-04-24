package com.example.volumecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PrismActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prism)

        val textView : TextView = findViewById(R.id.prismtext)
        val result = findViewById<TextView>(R.id.prismtext2)
        val button : Button = findViewById(R.id.prismbutton)
        val editext = findViewById<EditText>(R.id.prismedit)
        val editext1 = findViewById<EditText>(R.id.prismedit2)

        button.setOnClickListener {
            var basee= editext.text.toString()
            var r= Integer.parseInt(basee)
            var height = editext1.text.toString()
            var h = Integer.parseInt(height)

            var volume = r*h
            result.text = "V = $volume cm^3"

        }
    }
}