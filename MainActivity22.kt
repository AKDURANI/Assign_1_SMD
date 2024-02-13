package com.alikhan.i210766

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main22)


        val sendimageview21=findViewById<ImageView>(R.id.imageView21_Back)
        sendimageview21.setOnClickListener {
            val rwentyonme_intent = Intent(this,MainActivity21::class.java)
            startActivity(rwentyonme_intent)
        }

        val sendbutton23=findViewById<Button>(R.id.btn_send23)
        sendbutton23.setOnClickListener {
            val twentythree_intent = Intent(this,MainActivity22::class.java)
            startActivity(twentythree_intent)
        }






    }

}