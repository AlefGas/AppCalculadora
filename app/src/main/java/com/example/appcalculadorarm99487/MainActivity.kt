package com.example.appcalculadorarm99487


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meuBotao: Button = findViewById(R.id.aluno)
        meuBotao.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Desenvolvido por")
            builder.setMessage("nome: Alef \n Rm: 99487")


            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        val botaoCalculadora: Button = findViewById(R.id.calculadora)
        botaoCalculadora.setOnClickListener {

        }
        val intent = Intent(this, CalculadoraActivity::class.java)
        startActivity(intent)
    }

}