package com.example.flashcard_app

import android.R.id.button2
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswer1 = findViewById<TextView>(R.id.flashcard_answer1)
        val flashcardAnswer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val flashcardAnswer3 = findViewById<TextView>(R.id.flashcard_answer3)
        val flashcardAnswer4 = findViewById<TextView>(R.id.flashcard_answer4)
        val button1 = findViewById<Button>(R.id.button)

         button1.setOnClickListener {
             if (flashcardAnswer1.isVisible) {
                 flashcardAnswer1.visibility = View.INVISIBLE
                 flashcardAnswer2.visibility = View.INVISIBLE
                 flashcardAnswer3.visibility = View.INVISIBLE
             } else {
                 flashcardAnswer1.visibility = View.VISIBLE
                 flashcardAnswer2.visibility = View.VISIBLE
                 flashcardAnswer3.visibility = View.VISIBLE
             }
         }
    }
}








