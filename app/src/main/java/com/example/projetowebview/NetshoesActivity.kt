package com.example.projetowebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_netshoes.*

class NetshoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_netshoes)

        idWebViewNetshoes.webViewClient = WebViewClient();
        idWebViewNetshoes.settings.javaScriptEnabled = true
        idWebViewNetshoes.loadUrl("https://www.netshoes.com.br/")
    }
}
