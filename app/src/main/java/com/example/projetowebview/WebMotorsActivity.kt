package com.example.projetowebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_mercado.*
import kotlinx.android.synthetic.main.activity_web_motors.*

class WebMotorsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_motors)

        idWebViewWebMotors.webViewClient = WebViewClient();
        idWebViewWebMotors.settings.javaScriptEnabled = true;
        idWebViewWebMotors.loadUrl("https://www.webmotors.com.br/")
    }
}
