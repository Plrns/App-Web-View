package com.example.projetowebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_submarino.*


class SubmarinoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submarino)

        idWebViewSubmarino.webViewClient = WebViewClient();
        idWebViewSubmarino.settings.javaScriptEnabled = true
        idWebViewSubmarino.loadUrl("https://www.submarino.com.br/");
    }
}
