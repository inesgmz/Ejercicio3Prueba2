package com.example.ejercicio3prueba2

import com.google.firebase.database.*

class FirebaseService {
    private val database: DatabaseReference = FirebaseDatabase.getInstance().getReference("farmacias")

    fun obtenerFarmacias(callback: (List<Farmacia>) -> Unit) {
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val farmacias = mutableListOf<Farmacia>()
                for (data in snapshot.children) {
                    val farmacia = data.getValue(Farmacia::class.java)
                    if (farmacia != null) {
                        farmacias.add(farmacia)
                    }
                }
                callback(farmacias)
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle error
            }
        })
    }
}