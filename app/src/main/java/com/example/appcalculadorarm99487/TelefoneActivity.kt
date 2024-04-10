package com.example.appcalculadorarm99487

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TelefoneActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telefone)

        val telefonelocal: EditText = findViewById(R.id.minutoslocal)
        val telefonecelular: EditText = findViewById(R.id.minutoscelular)
        val btncalcular: Button = findViewById(R.id.botaoCalcular)

        fun IrParaResultado() {
            val telaResultado = Intent(this, ResultadoActivity::class.java)
            startActivity(telaResultado)
        }

        btncalcular.setOnClickListener {
            val telefoneplaintext = telefonelocal.text.toString()
            val celularplaintext = telefonecelular.text.toString()
            IrParaResultado()

            val soma = 59.90 +(telefoneplaintext.toDouble()* 0.4) + (celularplaintext.toDouble()*0.20)





        }
        }
    }
}