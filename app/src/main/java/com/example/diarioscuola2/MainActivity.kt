package com.example.diarioscuola2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            val button1 = findViewById(R.id.button1) as Button
            button1.setOnClickListener {
                val intent = Intent(this, lezioni::class.java)
                startActivity(intent)
            }

            val button2 = findViewById(R.id.button2) as Button
            button2.setOnClickListener {
                val intent = Intent(this, compiti::class.java)
                startActivity(intent)
            }

            val button3 = findViewById(R.id.button3) as Button
            button3.setOnClickListener {
                val intent = Intent(this, appunti::class.java)
                startActivity(intent)
            }

            val button4 = findViewById(R.id.button4) as Button
            button4.setOnClickListener {
                val intent = Intent(this, calendario::class.java)
                startActivity(intent)
            }

            val button5 = findViewById(R.id.button5) as Button
            button5.setOnClickListener {
                val intent = Intent(this, impostazioni::class.java)
                startActivity(intent)
            }

            val button6 = findViewById(R.id.button6) as Button
            button6.setOnClickListener {
                val intent = Intent(this, news::class.java)
                startActivity(intent)
            }
        }
    }