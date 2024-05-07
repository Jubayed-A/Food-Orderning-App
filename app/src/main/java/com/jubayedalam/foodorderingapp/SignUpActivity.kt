package com.jubayedalam.foodorderingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jubayedalam.foodorderingapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
   private val binding by lazy {
       ActivitySignUpBinding.inflate(layoutInflater)
   }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.alreadyhavebtn.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}