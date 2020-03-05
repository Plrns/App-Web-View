package com.example.projetowebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_mercado.*

class MercadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercado)

        idWebViewMercado.webViewClient = WebViewClient();
        idWebViewMercado.settings.javaScriptEnabled = true;
        idWebViewMercado.loadUrl("https://www.mercadolivre.com.br/")
    }
}
