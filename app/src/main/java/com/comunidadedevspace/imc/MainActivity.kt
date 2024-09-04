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
            val peso: Float = edtpeso.text.toString().toFloat()
            val altura: Float = edtaltura.text.toString().toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2

            println("Raoni ação do botão" + resultado)



        }

    }
}