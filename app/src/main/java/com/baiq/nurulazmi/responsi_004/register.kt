package com.baiq.nurulazmi.responsi_004

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_register.*


class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nama = findViewById<EditText>(R.id.nama)
        val alamat = findViewById<EditText>(R.id.alamat)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)

        btn_register.setOnClickListener(){
            val nama_o =nama.text.toString()
            val alamat_o=alamat.text.toString()
            val username_o =username.text.toString()
            val password_o=password.text.toString()



            intent=Intent(this,dashboard::class.java)
            intent.putExtra("username",username_o)
            intent.putExtra("password",password_o)
            startActivity(intent)
        }

        btn_register.setOnClickListener(){
            val username_o =username.text.toString()
            val password_o=password.text.toString()


            intent=Intent(this,register::class.java)
            intent.putExtra("username",username_o)
            intent.putExtra("password",password_o)
            startActivity(intent)
        }

    }
}
