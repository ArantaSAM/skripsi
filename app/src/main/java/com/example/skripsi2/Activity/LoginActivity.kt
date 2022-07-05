package com.example.skripsi2.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.skripsi2.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        bt_login.setOnClickListener {
            val username = etusername.text.toString()
            val password = etPassword.text.toString()
            if (username.isEmpty()||password.isEmpty())
            {
                Toast.makeText(this, "Please Insert username and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (username == "admin"||password == "admin")
            {
                val intent = Intent(this,MenuActivity::class.java)
                startActivity(intent)
                finish()
            }

        }
    }
}