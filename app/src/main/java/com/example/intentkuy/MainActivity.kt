package com.example.intentkuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nim = findViewById<EditText>(R.id.nim)
        val nama = findViewById<EditText>(R.id.nama)
        val nilai = findViewById<EditText>(R.id.nilai)
        val save = findViewById<Button>(R.id.save)


            var kete: Int = 65
            var grade: String = ""

            when (kete) {
                in 80..100 -> grade = "A"
                in 60..79 -> grade = "B"
                in 40..59 -> grade = "C"
                in 20..39 -> grade = "D"
                in 0..19 -> grade = "E"
                else -> grade = "F"

            }
            save.setOnClickListener {
                val nim1 = nim.text.toString()
                val nama1 = nama.text.toString()
                val nilai1 = nilai.text.toString()


                val intent = Intent(this@MainActivity, TwoAct::class.java)
                intent.putExtra("Nim", nim1)
                intent.putExtra("Nama", nama1)
                intent.putExtra("Nilai", nilai1)
                var kate = grade

                startActivity(intent)


            }
        }
    }
