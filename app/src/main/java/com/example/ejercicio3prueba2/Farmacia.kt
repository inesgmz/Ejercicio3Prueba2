package com.example.ejercicio3prueba2

data class Farmacia(
    var nombre: String? = null,
    var direccion: String? = null,
    var latitud: Double? = null,
    var longitud: Double? = null,
    var telefono: String? = null
) {

    constructor() : this(null, null, null, null, null)
}