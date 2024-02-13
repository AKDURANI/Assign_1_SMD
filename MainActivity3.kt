package com.alikhan.i210766

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val sendbutton4=findViewById<Button>(R.id.btn_send4)
        sendbutton4.setOnClickListener {
            val fourth_intent = Intent(this,MainActivity4::class.java)
            startActivity(fourth_intent)
        }


        val set_text2 = findViewById<TextView>(R.id.text_send2)
        set_text2.setOnClickListener{
            val fifth_intent = Intent(this, MainActivity2::class.java)
            startActivity(fifth_intent)

        }



    }
}