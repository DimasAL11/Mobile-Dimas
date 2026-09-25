package com.example.tif_dimas

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tif_dimas.databinding.ActivityThirdBinding
import com.example.tif_dimas.pertemuan4.FourthActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.root.setOnClickListener {
            //Mengambil value dari inputNama dan menampilkan di Logcat
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
        
    }
}