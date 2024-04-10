package com.example.appcalculadorarm99487

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)


        val assinaturaTextView: TextView = findViewById(R.id.assinaturaTextView)
        val chamadaLocalTextView: TextView = findViewById(R.id.chamadaLocalTextView)
        val chamadaCelularTextView: TextView = findViewById(R.id.chamadaCelularTextView)
        val totalTextView: TextView = findViewById(R.id.totalTextView)


        // Recupera os valores passados pela Intent
        val valorAssinatura = intent.getDoubleExtra("Assinatura", 0.0)
        val resultadoTelefoneLocal = intent.getDoubleExtra("TelefoneLocal", 0.0)
        val resultadoTelefoneCelular = intent.getDoubleExtra("TelefoneCelular", 0.0)
        val resultadoTotal = intent.getDoubleExtra("Total", 0.0)

        // Atualiza os TextViews com os valores
        assinaturaTextView.text = "Valor da Assinatura: 59,90"
        chamadaLocalTextView.text = "Resultado da Chamada Local: ${String.format("%.2f", resultadoTelefoneLocal)}"
        chamadaCelularTextView.text = "Resultado da Chamada Celular: ${String.format("%.2f", resultadoTelefoneCelular)}"
        totalTextView.text = "Total: ${String.format("%.2f", resultadoTotal)}"
    }

    }
