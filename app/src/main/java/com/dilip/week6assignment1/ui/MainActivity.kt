package com.dilip.week6assignment1.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.dilip.week6assignment1.R

class MainActivity : AppCompatActivity() {
    private lateinit var etUser:EditText
    private lateinit var etPassword:EditText
    private lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUser = findViewById(R.id.etUser)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener{
            val userName = etUser.text.toString()
            val password = etPassword.text.toString()

            if (userName == "softwarica" && password == "coventry"){
                val intent = Intent(this, StudentDetails::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Make sure you have typed correct username and password", Toast.LENGTH_SHORT).show()
                etUser.error = " Your username or password is incorrect"
                etUser.requestFocus()
            }
        }
    }
    private fun validate():Boolean{
        var flag = true
        when{
            TextUtils.isEmpty(etUser.text) -> {
                etUser.error ="Your username or password is incorrect"
                etUser.requestFocus()
                flag = false
            }
        }
        return flag
    }
}