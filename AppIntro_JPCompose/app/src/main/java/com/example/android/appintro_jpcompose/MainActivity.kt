package com.example.android.appintro_jpcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.appintro_jpcompose.ui.theme.AppIntro_JPComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { //Permite crear el Activity (es una pantallita en el celular
                        // que va a tener interacción con el usuario)
            //Un fragmento no contiene Activity, pero un Activity puede contener fragmentos
            //Text(text = "Mi primera App en Compose... y no será la última!!")
            PersonalData(name = "Gianella <3")
        }
    }
}

@Composable //Es importante poner el Compose para que funcione
//Para crear una función en Kotlin se pone "fun"
private fun PersonalData(name: String){
    MaterialTheme() { //Se puede dar propiedades a los elementos que están dentro (Ejm: style)
        Column() { //Sirve para poner a los elementos que tiene en columna
            Text(text = "Mi nombre es $name", style = MaterialTheme.typography.h4)
            Text(text = "Curso: Móviles, el mejor curso del ciclo!!")
            Text(text = "Sesión 2 - Sem 2")
        }
    }

}

@Preview //Se pone para poder visualizarlo en Split
@Composable
fun PreviewPersonalData(){
    PersonalData(name = "Giane <3")
}