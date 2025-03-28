package com.example.lab1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lab1.databinding.ActivityWordScrambleBinding

class ScrambleGameActivity : AppCompatActivity() {
    private lateinit var view: ActivityWordScrambleBinding

    private val words = listOf("kotlin", "android", "studio", "happy", "birthday", "cake", "party")
    private lateinit var currentWord: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        view = ActivityWordScrambleBinding.inflate(layoutInflater)
        setContentView(view.root)

        loadNewWord()

        view.checkButton.setOnClickListener {
            val userAnswer = view.userInput.text.toString().trim()
            if (userAnswer.equals(currentWord, ignoreCase = true)) {
                Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show()
                loadNewWord()
                view.userInput.text.clear()
            } else {
                Toast.makeText(this, "WRONG", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun loadNewWord() {
        currentWord = words.random()
        val scrambled = currentWord.toCharArray().apply { shuffle() }.joinToString("")
        view.scrambledWordText.text = scrambled
    }
}