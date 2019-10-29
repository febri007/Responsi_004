package com.baiq.nurulazmi.responsi_004

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_main.*

class dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val intent = intent
        val nama_o = intent.getStringExtra("nama")
        val alamat_o = intent.getStringExtra("alamat")
        val username_o = intent.getStringExtra("username")
        val password_o = intent.getStringExtra("password")


        val hasil = findViewById<TextView>(R.id.textView19)
        hasil.text = "Nama : "+textView19

        val hasil2 = findViewById<TextView>(R.id.textView20)
        hasil2.text = "Alamat : "+textView20

        val hasil3 = findViewById<TextView>(R.id.textView21)
        hasil3.text = "Username : "+textView21

        val hasil4 = findViewById<TextView>(R.id.textView22)
        hasil4.text = "Password : "+textView22
    }
}
