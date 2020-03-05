package com.example.projetowebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_americanas.*
import kotlinx.android.synthetic.main.activity_magalu.*

class AmericanasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_americanas)

        idWebViewAmericanas.webViewClient = WebViewClient();
        idWebViewAmericanas.settings.javaScriptEnabled = true;
        idWebViewAmericanas.loadUrl("https://www.americanas.com.br/")
    }
}
