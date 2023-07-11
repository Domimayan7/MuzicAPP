package com.example.muzik1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AmapianoArtist : AppCompatActivity() {

    lateinit var home:TextView
    lateinit var music:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amapiano_artist)

        home=findViewById(R.id.Home)
        music=findViewById(R.id.Music)

        home.setOnClickListener {
            val intent=Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        music.setOnClickListener {
            val intent=Intent(this, AmapianoActivity::class.java)
            startActivity(intent)
        }
    }
}