package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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
            val pesoStr: String = edtpeso.text.toString()
            val alturaStr: String = edtaltura.text.toString()

            if(pesoStr == "" || alturaStr == ""){
                //Mostrar mensagem ao usuário
                Snackbar
                    .make(
                        edtpeso,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                    )
                    .show()


            }else{
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                println("Raoni ação do botão" + resultado)
            }
        }
    }
}