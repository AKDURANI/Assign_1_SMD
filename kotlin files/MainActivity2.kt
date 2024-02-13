package com.alikhan.i210766

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val sendbutton7=findViewById<Button>(R.id.btn_send7)

        sendbutton7.setOnClickListener {
            val seventh_intent = Intent(this,MainActivity7::class.java)
            startActivity(seventh_intent)
        }



        val set_text5 = findViewById<TextView>(R.id.text_send5)
        set_text5.setOnClickListener{
            val fifth_intent = Intent(this, MainActivity5::class.java)
            val msg = "Hello SMD"
            fifth_intent.putExtra(MainActivity.EXTRA_MESSAGE, msg)
            startActivity(fifth_intent)

        }

        val set_text3 = findViewById<TextView>(R.id.text_send3)
        set_text3.setOnClickListener{
            val fifth_intent = Intent(this, MainActivity3::class.java)
            val msg = "Hello SMD"
            fifth_intent.putExtra(MainActivity.EXTRA_MESSAGE, msg)
            startActivity(fifth_intent)

        }






    }
}