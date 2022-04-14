package com.example.android.app_sem_3_20220407

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = intent.getStringExtra(EXTRA_MESS)

        //Muestra en el textView
        val textView = findViewById<TextView>(R.id.tvData).apply {
            text = message
        }
    }
}