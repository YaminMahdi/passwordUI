package com.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ui.databinding.ActivityMain2Binding
import com.ui.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.resrtButton.setOnClickListener {
            Toast.makeText(this, "Reset Password Successful", Toast.LENGTH_SHORT).show()
        }
        binding.backBtn.setOnClickListener {
            super.onBackPressed()
        }
    }
}