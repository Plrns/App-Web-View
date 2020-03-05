package com.example.projetowebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_magalu.*
import kotlinx.android.synthetic.main.activity_web_motors.*

class MagaluActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magalu)

        idWebViewMagalu.webViewClient = WebViewClient();
        idWebViewMagalu.settings.javaScriptEnabled = true;
        idWebViewMagalu.loadUrl("https://www.magazineluiza.com.br/")
    }
}
