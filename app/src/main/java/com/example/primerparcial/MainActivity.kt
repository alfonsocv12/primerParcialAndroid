package com.example.primerparcial

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextTotal.setText("0")
        editTextActual.setText("0")
        btnSetPT.setOnClickListener {
            Toast.makeText(this, "La produccion total: $(editTextTotal.text.toString().toInt() * 80).toString()", Toast.LENGTH_LONG).show()
        }
        btnSetActual.setOnClickListener {
            Toast.makeText(this, "La produccion $(editTextActual.text.toString().toInt() * 80).toString()", Toast.LENGTH_LONG).show()
        }
        btnPlus5.setOnClickListener {
            editTextActual.setText((editTextActual.text.toString().toInt() + 5).toString())
        }
        btnPlus15.setOnClickListener {
            editTextActual.setText((editTextActual.text.toString().toInt() + 15).toString())
        }
        btnPlus30.setOnClickListener {
            editTextActual.setText((editTextActual.text.toString().toInt() + 30).toString())
        }
        btnPlus50.setOnClickListener {
            editTextActual.setText((editTextActual.text.toString().toInt() + 50).toString())
        }
        btnCalcular.setOnClickListener {
            val porcentaje= ((editTextTotal.text.toString().toDouble() /100) * editTextActual.text.toString().toDouble())
            if (porcentaje >= 70.0){
                layoutMainActivity.setBackgroundColor(Color.RED)
            }
            editTextPorsentaje.setText(porcentaje.toString())
        }
    }
}
