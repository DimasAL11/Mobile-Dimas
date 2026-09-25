package com.example.tif_dimas.pertemuan4

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tif_dimas.MainActivity
import com.example.tif_dimas.Pertemuan3.ThirdActivity
import com.example.tif_dimas.Pertemuan3.ThirdResultActivity
import com.example.tif_dimas.R
import com.example.tif_dimas.databinding.ActivityFourthBinding
import com.example.tif_dimas.databinding.ActivityThirdBinding

class FourthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnkembali.setOnClickListener {
            //Mengambil value dari inputNama dan menampilkan di Logcat
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}