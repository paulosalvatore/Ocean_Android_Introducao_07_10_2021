package com.oceanbrasil.ocean_android_introducao_07_10_2021

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buscar o botão pelo ID
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btEnviar.setOnClickListener {
            tvResultado.text = "Olá, profs. Antonio Deusany e Paulo Salvatore!"
        }

        /*
        Exercício:
        Construir um elemento de EditText no layout (entre o TextView e o Botão)
        Ao clicar no botão, pegar o que foi digitado no EditText e atualizar no texto do TextView
        */
    }
}
