package com.baiq.nurulazmi.responsi_004

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_preview.*

class preview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)


        val intent = intent
        val nama_o = intent.getStringExtra("nama")
        val alamat_o = intent.getStringExtra("alamat")
        val username_o = intent.getStringExtra("username")
        val password_o = intent.getStringExtra("password")


        val hasil = findViewById<TextView>(R.id.textView3)
        hasil.text = "Nama : "+textView3

        val hasil2 = findViewById<TextView>(R.id.textView8)
        hasil2.text = "Alamat : "+textView8

        val hasil3 = findViewById<TextView>(R.id.textView9)
        hasil3.text = "Username : "+textView9

        val hasil4 = findViewById<TextView>(R.id.textView10)
        hasil4.text = "Password : "+textView10
    }
}
