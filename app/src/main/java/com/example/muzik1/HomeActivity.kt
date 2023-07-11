package com.example.muzik1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    lateinit var raggae:CardView
    lateinit var drills:CardView
    lateinit var rnb:CardView
    lateinit var amapiano:CardView
    lateinit var bongo:CardView
    lateinit var local:CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        raggae=findViewById(R.id.Reggae1)
        drills=findViewById(R.id.cardDrill1)
        amapiano=findViewById(R.id.cardAmapiano1)
        bongo=findViewById(R.id.cardBongo1)
        rnb=findViewById(R.id.cardRnb1)
        local=findViewById(R.id.cardLocal1)

        raggae.setOnClickListener {
            val intent=Intent(this,ReggaeActivity::class.java)
            startActivity(intent)
        }
        drills.setOnClickListener {
            val intent=Intent(this,DrillActivity::class.java)
            startActivity(intent)
        }
        amapiano.setOnClickListener {
            val intent=Intent(this,AmapianoActivity::class.java)
            startActivity(intent)
        }
        bongo.setOnClickListener {
            val intent=Intent(this,BongoActivity::class.java)
            startActivity(intent)
        }
        rnb.setOnClickListener {
            val intent=Intent(this,RnbActivity::class.java)
            startActivity(intent)
        }
        local.setOnClickListener {
            val intent=Intent(this,LocalActivity::class.java)
            startActivity(intent)
        }
    }
}