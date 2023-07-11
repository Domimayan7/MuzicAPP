package com.example.muzik1

import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DrillActivity : AppCompatActivity() {

    lateinit var web: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reggae)

        web=findViewById(R.id.web)


        web.webViewClient= WebViewClient()
        web.loadUrl("https://tubidy.watch/search.php?q=drill")
        web.settings.javaScriptEnabled=true
        web.settings.setSupportZoom(true)

    }
}
