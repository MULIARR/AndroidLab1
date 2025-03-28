package com.example.lab1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lab1.databinding.ActivityBirthdayCardBinding

class BirthdayCardActivity : AppCompatActivity() {

    private lateinit var view: ActivityBirthdayCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        view = ActivityBirthdayCardBinding.inflate(layoutInflater)
        setContentView(view.root)
    }

}