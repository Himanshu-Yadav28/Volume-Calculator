package com.example.volumecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SphereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sphere)

        val textView : TextView = findViewById(R.id.textview2)
        val result = findViewById<TextView>(R.id.textview3)
        val button : Button = findViewById(R.id.button)
        val editext = findViewById<EditText>(R.id.edittext1)

        button.setOnClickListener {
            var radius= editext.text.toString()
            var r= Integer.parseInt(radius)

            var volume = (4/3) * 3.14 * r*r*r
            result.text = "V = $volume cm^3"

        }
    }
}