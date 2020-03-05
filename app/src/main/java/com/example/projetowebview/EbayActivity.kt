package com.example.projetowebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_ebay.*
import kotlinx.android.synthetic.main.activity_magalu.*

class EbayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ebay)

        idWebViewEbay.webViewClient = WebViewClient();
        idWebViewEbay.settings.javaScriptEnabled = true;
        idWebViewEbay.loadUrl("https://www.ebay.com/")
    }
}
