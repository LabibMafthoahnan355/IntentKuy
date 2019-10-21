package com.example.intentkuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TwoAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)


        val intent = intent
        val nim1 = intent.getStringExtra("Nim")
        val nama1 = intent.getStringExtra("Nama")
        val nilai1 = intent.getStringExtra("Nilai")
        var kate=intent.getStringArrayExtra("Keterangan")


        val view = findViewById<TextView>(R.id.view)

        view.text = "Nim        : "+nim1+"\n"+"Nama    : "+nama1+"\n"+"Nilai       : "+nilai1+
                "\n"+"Keterangan    :"+kate

    }
}