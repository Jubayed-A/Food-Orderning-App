package com.jubayedalam.adminfoodorderingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jubayedalam.adminfoodorderingapp.databinding.ActivityCreateUserBinding

class CreateUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCreateUserBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            finish()
        }
    }
}