package com.example.appcalculadorarm99487

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TelefoneActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telefone)
        val valorConta: EditText = findViewById(R.id.assinatura)
        val telefonelocal: EditText = findViewById(R.id.minutoslocal)
        val telefonecelular: EditText = findViewById(R.id.minutoscelular)
        val btncalcular: Button = findViewById(R.id.botaoCalcular)
        val Btnvoltar: ImageButton = findViewById(R.id.ButtonReturn)


        Btnvoltar.setOnClickListener{
            finish()
        }

        btncalcular.setOnClickListener {
            val valorAssinatura = valorConta.text.toString().toDoubleOrNull() ?: 0.0
            val valorTelefoneLocal = telefonelocal.text.toString().toDoubleOrNull() ?: 0.0
            val valorTelefoneCelular = telefonecelular.text.toString().toDoubleOrNull() ?: 0.0

            // Realiza os cálculos com os valores convertidos
            val resultadoAssinatura = valorAssinatura
            val resultado1 = valorTelefoneLocal * 0.04
            val resultado2 = valorTelefoneCelular * 0.20
            // Certifique-se de que resultadoTotal é a soma dos resultados com o valor da assinatura
            val resultadoTotal = resultado1 + resultado2 + 59.90

            // Prepara o Intent com os valores a serem passados para a próxima Activity
            val intent = Intent(this, ResultadoActivity::class.java).apply {
                putExtra("Assinatura", resultadoAssinatura) // Use nomes consistentes para as chaves
                putExtra("TelefoneLocal", resultado1)
                putExtra("TelefoneCelular", resultado2)
                putExtra("Total", resultadoTotal)
            }
            startActivity(intent)
        }





        }
        }

