package com.example.test.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.test.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_page)


        val button_log_in = findViewById<Button>(R.id.Btn_log_in)
        button_log_in.setOnClickListener{
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
        }

        val Btn_new_account = findViewById<Button>(R.id.Btn_new_account)
        Btn_new_account.setOnClickListener{
            val intent = Intent(this, NewAccountActivity::class.java)
            startActivity(intent)
        }
    }

}
