package com.example.ejercicio3prueba2

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var firebaseService: FirebaseService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Farmacias"

        listView = findViewById(R.id.listView)
        firebaseService = FirebaseService()

        firebaseService.obtenerFarmacias { farmacias ->
            val adapter = FarmaciaAdapter(this, farmacias)
            listView.adapter = adapter

            listView.setOnItemClickListener { _, _, position, _ ->
                val selectedFarmacia = farmacias[position]
                val intent = Intent(this, MapaActivity::class.java).apply {
                    putExtra("latitud", selectedFarmacia.latitud)
                    putExtra("longitud", selectedFarmacia.longitud)
                }
                startActivity(intent)
            }
        }
    }
}