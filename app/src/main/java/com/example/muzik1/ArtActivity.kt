package com.example.muzik1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ArtActivity : AppCompatActivity() {
    lateinit var amapiano:Button
    lateinit var reggae:Button
    lateinit var dashboard:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_art)

        amapiano=findViewById(R.id.Amapiano)
        reggae=findViewById(R.id.Ragge)
        dashboard=findViewById(R.id.Dashboard)

        amapiano.setOnClickListener {
            val intent= Intent(this, AmapianoArtist::class.java)
            startActivity(intent)

        }

        reggae.setOnClickListener {
            val intent= Intent(this, ArtistActivity::class.java)
            startActivity(intent)

        }
        dashboard.setOnClickListener {
            val intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)

        }
    }
}