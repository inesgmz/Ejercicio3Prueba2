# Proyecto Ejercicio3Prueba2

Este proyecto es una aplicación de Android que muestra una lista de farmacias y permite ver la ubicación de cada una en un mapa utilizando OpenStreetMap (OSM).

## Descripción de Clases

### `MainActivity`
- **Descripción**: Actividad principal que muestra una lista de farmacias.
- **Métodos importantes**:
  - `onCreate(Bundle?)`: Inicializa la actividad, configura el `ListView` y carga las farmacias desde Firebase.

### `MapaActivity`
- **Descripción**: Actividad que muestra la ubicación de una farmacia en un mapa.
- **Métodos importantes**:
  - `onCreate(Bundle?)`: Inicializa la actividad, configura el mapa y añade un marcador en la ubicación de la farmacia.

### `Farmacia`
- **Descripción**: Clase de datos que representa una farmacia.
- **Propiedades**:
  - `nombre`: Nombre de la farmacia.
  - `direccion`: Dirección de la farmacia.
  - `latitud`: Latitud de la ubicación de la farmacia.
  - `longitud`: Longitud de la ubicación de la farmacia.
  - `telefono`: Teléfono de la farmacia.

### `FarmaciaAdapter`
- **Descripción**: Adaptador para mostrar la lista de farmacias en un `ListView`.
- **Métodos importantes**:
  - `getView(int, View?, ViewGroup)`: Infla la vista de cada elemento de la lista y asigna los datos de la farmacia.

### `FirebaseService`
- **Descripción**: Servicio para interactuar con Firebase y obtener los datos de las farmacias.
- **Métodos importantes**:
  - `obtenerFarmacias(callback: (List<Farmacia>) -> Unit)`: Obtiene la lista de farmacias desde Firebase y ejecuta el callback con los datos obtenidos.

## Archivos XML

### `activity_main.xml`
- **Descripción**: Layout de la actividad principal que contiene un `ListView` para mostrar la lista de farmacias.

### `activity_mapa.xml`
- **Descripción**: Layout de la actividad del mapa que contiene un `MapView` para mostrar la ubicación de la farmacia.

### `item_farmacia.xml`
- **Descripción**: Layout de cada elemento de la lista de farmacias, que incluye un `TextView` para el nombre y el teléfono, y un `ImageView` para el logo.

## Dependencias

- `osmdroid`: Biblioteca para trabajar con OpenStreetMap en Android.
- `Firebase`: Servicios de Firebase para la base de datos en tiempo real.
- `Glide`: Biblioteca para cargar imágenes.

## Configuración

- **Firebase**: Configurar el archivo `google-services.json` con los datos del proyecto de Firebase.
- **Gradle**: Añadir las dependencias necesarias en el archivo `build.gradle`.

URL: 
