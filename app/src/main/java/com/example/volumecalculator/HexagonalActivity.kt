package com.example.volumecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HexagonalActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hexagonal)

        val textView : TextView = findViewById(R.id.textview2)
        val result = findViewById<TextView>(R.id.textview3)
        val button : Button = findViewById(R.id.button)
        val editext = findViewById<EditText>(R.id.edittext1)
        val edd = findViewById<EditText>(R.id.edittext2)

        button.setOnClickListener {
            var base= editext.text.toString()
            var b= Integer.parseInt(base)

            var height= edd.text.toString()
            var h= Integer.parseInt(height)

            var volume = (0.865 * b*b*h)
            result.text = "V = $volume cm^3"

        }
    }
}