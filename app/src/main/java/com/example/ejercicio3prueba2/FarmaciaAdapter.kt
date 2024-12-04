package com.example.ejercicio3prueba2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ArrayAdapter

class FarmaciaAdapter(context: Context, farmacias: List<Farmacia>) : ArrayAdapter<Farmacia>(context, 0, farmacias) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val farmacia = getItem(position)
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_farmacia, parent, false)

        val nombreTextView = view.findViewById<TextView>(R.id.nombreTextView)
        val telefonoTextView = view.findViewById<TextView>(R.id.telefonoTextView)

        nombreTextView.text = farmacia?.nombre
        telefonoTextView.text = farmacia?.telefono

        return view
    }
}