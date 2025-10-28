package com.example.homeswap

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnfacebook = findViewById<Button>(R.id.btnFacebook)
        val btnapple = findViewById<Button>(R.id.btnApple)
        val btngoogle = findViewById<Button>(R.id.btnGoogle)
        val btnemail = findViewById<Button>(R.id.btnEmail)
        val btnlogin = findViewById<Button>(R.id.btnLogin)

        btnemail.setOnClickListener {
            val intent = Intent(this, CrearCuentaActivity::class.java)
            startActivity(intent)
        }
    }
}
