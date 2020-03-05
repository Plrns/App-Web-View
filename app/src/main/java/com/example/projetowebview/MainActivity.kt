package com.example.projetowebview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idMercado.setOnClickListener {
            var intent = Intent(this, MercadoActivity::class.java)
            startActivity(intent)
        }

        idNetshoes.setOnClickListener {
            var intent = Intent(this, NetshoesActivity::class.java)
            startActivity(intent)
        }

        idSubmarino.setOnClickListener {
            var intent = Intent(this, SubmarinoActivity::class.java)
            startActivity(intent)
        }

        idAmericanas.setOnClickListener {
            var intent = Intent(this, AmericanasActivity::class.java)
            startActivity(intent)
        }

        idBuscape.setOnClickListener {
            var intent = Intent(this, BuscapeActivity::class.java)
            startActivity(intent)
        }

        idEbay.setOnClickListener {
            var intent = Intent(this, EbayActivity::class.java)
            startActivity(intent)
        }

        idMagalu.setOnClickListener {
            var intent = Intent(this, MagaluActivity::class.java)
            startActivity(intent)
        }

        idWebMotors.setOnClickListener {
            var intent = Intent(this, WebMotorsActivity::class.java)
            startActivity(intent)
        }

        idSobre.setOnClickListener {
            var intent = Intent(this, SobreActivity::class.java)
            startActivity(intent)
        }
    }
}
