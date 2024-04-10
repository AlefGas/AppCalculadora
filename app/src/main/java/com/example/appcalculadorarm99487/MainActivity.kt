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

        fun IrParaSegundaTela(){
            val segundaTela = Intent(this,CalculadoraActivity::class.java)
            startActivity(segundaTela)
        }

        val botaoCalculadora: Button = findViewById(R.id.calculadora)
        botaoCalculadora.setOnClickListener {
            IrParaSegundaTela()
        }
        fun IrParaTelaTelefone(){
            val telaTelefone = Intent(this,TelefoneActivity::class.java)
            startActivity(telaTelefone)
        }
        val botaoTelefone: Button = findViewById(R.id.contaTelefonica)
        botaoTelefone.setOnClickListener {
            IrParaTelaTelefone()
        }

        val meuBotao: Button = findViewById(R.id.aluno)
        meuBotao.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Desenvolvido por")
            builder.setMessage("nome: Alef \n Rm: 99487")


            val dialog: AlertDialog = builder.create()
            dialog.show()
        }



    }

}