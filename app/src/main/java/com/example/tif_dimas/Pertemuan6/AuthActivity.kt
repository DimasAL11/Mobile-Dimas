package com.example.tif_dimas.Pertemuan6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tif_dimas.MainActivity
import com.example.tif_dimas.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Akses "user_pref"
        val sharedPref = getSharedPreferences("user_pref", MODE_PRIVATE)

        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString()
            // Langkah 2 modul: set isLogin = true dan simpan username
            val editor = sharedPref.edit()
            editor.putBoolean("isLogin", true)
            editor.putString("username", username)
            editor.apply()

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}