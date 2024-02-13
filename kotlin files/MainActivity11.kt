package com.alikhan.i210766

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)

        val sendimageview10=findViewById<ImageView>(R.id.imageView10_Back)
        sendimageview10.setOnClickListener {
            val tenth_intent = Intent(this,MainActivity10::class.java)
            startActivity(tenth_intent)
        }

        val sendbutton11=findViewById<Button>(R.id.btn_send11)
        sendbutton11.setOnClickListener {
            val eleventh_intent = Intent(this,MainActivity11::class.java)
            startActivity(eleventh_intent)
        }
    }
}