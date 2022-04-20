package com.example.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //Se crea un array list para las preguntas siguientes
    //lateinit var es para que se ejecuten después
    lateinit var questions: ArrayList<Question>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Agregar para que funcione
        setupViews()
        loadQuestion()
    }

    //Creamos un método para vincular los botones

    private fun setupViews(){
        //Esto es para llamar a los 3 controles que tenemos
        val btYes = findViewById<Button>(R.id.btYes)
        val btNo = findViewById<Button>(R.id.btNo)
        val tvQuestion = findViewById<TextView>(R.id.tvQuestion)

        btYes.setOnClickListener(){ //Cuando se presiones el boton
            Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show() //Length_long dura 4 sec, el short dura 2 sec
        }

        btNo.setOnClickListener(){ //Cuando se presiones el boton
            Toast.makeText(this, "Intenta de nuevo", Toast.LENGTH_LONG).show() //Length_long dura 4 sec, el short dura 2 sec
        }
    }

    private fun loadQuestion(){
        questions = ArrayList()
        var question = Question("¿Es Lima capital de Perú?", true)
        //Con esto se inserta el elemento
        questions.add(question)

        questions.add(Question("¿Es Lima la capital de Colombia?", false))
        questions.add(Question("¿Es La Paz la capital de Bolivia?", true))
        questions.add(Question("¿Es Santiago la capital de Chile?", true))
        questions.add(Question("¿Es Lima la capital de Brasil?", false))
        questions.add(Question("¿Es Buenos Aires la capital de Colombia?", false))
        questions.add(Question("¿Es Medellin la capital de Colombia?", false))
        questions.add(Question("¿Es Bogotá la capital de Colombia?", true))

    }
}