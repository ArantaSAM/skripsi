package com.example.skripsi2.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.skripsi2.R
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        gejala.setOnClickListener {
            val intent = Intent (this, GejalaActivity::class.java)
            startActivity(intent)
        }

        pengetahuan.setOnClickListener {
            val intent = Intent (this, PengetahuanActivity::class.java)
            startActivity(intent)
        }
        penyakit.setOnClickListener {
            val intent = Intent (this, PenyakitActivity::class.java)
            startActivity(intent)
        }
    }
}