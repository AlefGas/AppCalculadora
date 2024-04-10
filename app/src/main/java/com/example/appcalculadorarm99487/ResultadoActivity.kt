package com.example.appcalculadorarm99487

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telefone)

        val textViewRecebido: TextView = findViewById(R.id.chamadaCelularTextView)
        val valorRecebido = intent.getStringExtra("valorEnviado")

        textViewRecebido.text = valorRecebido ?: "Nenhum valor recebido"
    }
}