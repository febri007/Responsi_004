package com.baiq.nurulazmi.responsi_004

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import android.app.Dialog
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)

        val dialog = Dialog(this@MainActivity)
        dialog.setContentView(R.layout.dialog)

        btn_login.setOnClickListener(){
            val username_o =username.text.toString()
            val password_o=password.text.toString()
            if(username_o=="febri@mail.com" && password_o=="1234"){
                intent=Intent(this,dashboard::class.java)
                intent.putExtra("username",username_o)
                intent.putExtra("password",password_o)
                startActivity(intent)
            }
            else{
                val text = dialog.findViewById(R.id.alert) as TextView
                text.text = "Username Dan Password Salah"
                dialog.show()
            }

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
