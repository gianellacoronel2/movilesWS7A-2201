package com.example.android.app_sem_3_20220407

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESS = "com.example.android.app_sem_3_20220407"
//Aquí esta la lógica
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Crear un método
    fun sendMessage(view: View){
        //El R es una convención de Android. Con eso se carga la interfaz
        //Se ha vinculado la variable al código
        val editText = findViewById<EditText>(R.id.etEmail)
        //text: Va a capturar lo que está en la variable
        val message = editText.text.toString()


        //La parte del intent
        val intent = Intent(this, DisplayMessageActivity::class.java).apply{
            putExtra(EXTRA_MESS, message)
        }
        startActivity(intent)
    }
}