package com.shanu.goodbye_stress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val empInput = findViewById<TextInputLayout>(R.id.emp)
        val otpInput = findViewById<TextInputLayout>(R.id.opt)
        val loginBtn = findViewById<Button>(R.id.login)

        // if empInput is 123 and otpInput is 1234 then redirect to HomeActivity

        loginBtn.setOnClickListener {
            if (empInput.editText?.text.toString() == "123" && otpInput.editText?.text.toString() == "1234") {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()
            }
        }

    }
}