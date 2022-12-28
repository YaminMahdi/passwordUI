package com.ui

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ui.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.emlButton.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_MAIN)
                intent.addCategory(Intent.CATEGORY_APP_EMAIL)
                this.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                Toast.makeText(this, "There is no email client installed.", Toast.LENGTH_SHORT).show()
            }
        }
        binding.skipBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
        binding.skipBtn.paint?.isUnderlineText = true
        binding.tryBtn.setOnClickListener {
            super.onBackPressed()
        }
        binding.backBtn.setOnClickListener {
            super.onBackPressed()
        }
    }
}