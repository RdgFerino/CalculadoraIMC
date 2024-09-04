package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText
        //Criar uma variável e associar o componente de UI <EditText>
        //Recuperar o botão da tela
        //colocar ação no botão setonclicklistener
        //recuperar o texto digitado no edit peso


        val edtpeso = findViewById<TextInputEditText>(R.id.edit_text_Peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edit_text_Altura)

        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener {
            val peso = edtpeso.text
            val altura = edtaltura.text

            println("Raoni ação do botão " + peso)
            println("Raoni ação do botão " + altura)


        }

    }
}