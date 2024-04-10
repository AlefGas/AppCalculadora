package com.example.appcalculadorarm99487

import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CalculadoraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val valor1EditText: EditText = findViewById(R.id.valor1)
        val valor2EditText: EditText = findViewById(R.id.valor2)
        val btnSoma: RadioButton = findViewById(R.id.btn_soma)
        val btnSubtracao: RadioButton =findViewById(R.id.Btn_subtracao)
        val btnMultiplicacao: RadioButton =findViewById(R.id.Btn_multiplicacao)
        val btnDivisao: RadioButton =findViewById(R.id.Btn_divisao)

        btnSoma.setOnClickListener {
            val valor1PlainText = valor1EditText.text.toString()
            val valor2PlainText = valor2EditText.text.toString()

            if (valor1PlainText.isNotEmpty() && valor2PlainText.isNotEmpty()) {
                try {
                    // Converte os valores para Double e realiza a soma
                    val soma = valor1PlainText.toDouble() + valor2PlainText.toDouble()

                    // Mostra o resultado com um Toast
                    Toast.makeText(this, "Resultado: $soma", Toast.LENGTH_SHORT).show()
                } catch (e: NumberFormatException) {
                    // Trata o erro se a conversão falhar
                    Toast.makeText(this, "Por favor, insira números válidos.", Toast.LENGTH_SHORT)
                        .show()
                }
            } else {
                Toast.makeText(this, "Por favor, preencha ambos os campos.", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        btnSubtracao.setOnClickListener {
            val valor1PlainText = valor1EditText.text.toString()
            val valor2PlainText = valor2EditText.text.toString()

            if (valor1PlainText.isNotEmpty() && valor2PlainText.isNotEmpty()) {
                try {

                    val subtracao = valor1PlainText.toDouble() - valor2PlainText.toDouble()

                    // Mostra o resultado com um Toast
                    Toast.makeText(this, "Resultado: $subtracao", Toast.LENGTH_SHORT).show()
                } catch (e: NumberFormatException) {
                    // Trata o erro se a conversão falhar
                    Toast.makeText(this, "Por favor, insira números válidos.", Toast.LENGTH_SHORT)
                        .show()
                }
            } else {
                Toast.makeText(this, "Por favor, preencha ambos os campos.", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        btnMultiplicacao.setOnClickListener {
            val valor1PlainText = valor1EditText.text.toString()
            val valor2PlainText = valor2EditText.text.toString()

            if (valor1PlainText.isNotEmpty() && valor2PlainText.isNotEmpty()) {
                try {

                    val multiplicacao = valor1PlainText.toDouble() * valor2PlainText.toDouble()


                    Toast.makeText(this, "Resultado: $multiplicacao", Toast.LENGTH_SHORT).show()
                } catch (e: NumberFormatException) {

                    Toast.makeText(this, "Por favor, insira números válidos.", Toast.LENGTH_SHORT)
                        .show()
                }
            } else {
                Toast.makeText(this, "Por favor, preencha ambos os campos.", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        btnDivisao.setOnClickListener {
            val valor1PlainText = valor1EditText.text.toString()
            val valor2PlainText = valor2EditText.text.toString()

            if (valor1PlainText.isNotEmpty() && valor2PlainText.isNotEmpty()) {
                try {

                    val divisao = valor1PlainText.toDouble()/valor2PlainText.toDouble()


                    Toast.makeText(this, "Resultado: $divisao", Toast.LENGTH_SHORT).show()
                } catch (e: NumberFormatException) {

                    Toast.makeText(this, "Por favor, insira números válidos.", Toast.LENGTH_SHORT)
                        .show()
                }
            } else {
                Toast.makeText(this, "Por favor, preencha ambos os campos.", Toast.LENGTH_SHORT)
                    .show()
            }
        }

    }
}