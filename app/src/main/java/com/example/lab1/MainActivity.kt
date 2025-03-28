package com.example.lab1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lab1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var view: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)

        view.birthdayCardButton.setOnClickListener {
            val intent = Intent(this, BirthdayCardActivity::class.java)
            startActivity(intent)
            // val et = findViewById<EditText>(R.id.editText)
            // et.text.toString()
            // val text = view.editText.text.toString()

            // Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

            // val intent = Intent(this, Activity::class.java)
            // intent.putExtra("NAME", "VALUE")
            // startActivity(intent)

            // val intent  = intent
            // Toast.makeText(this, intent.getStringExtra("NAME"), Toast.LENGTH_SHORT).show()
        }

        view.scrambleButton.setOnClickListener {
            val intent = Intent(this, ScrambleGameActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(view.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()

        // Log.d("LAB1", "Activity started")
    }
}