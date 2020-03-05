package com.example.projetowebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_magalu.*

class BuscapeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscape)

        idWebViewBuscape.webViewClient = WebViewClient();
        idWebViewBuscape.settings.javaScriptEnabled = true;
        idWebViewBuscape.loadUrl("https://www.buscape.com.br/")
    }
}
