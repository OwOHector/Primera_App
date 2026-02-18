package com.example.primeaapp

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primeaapp.composables.ContadorCafes
import com.example.primeaapp.composables.ListaCompras
import com.example.primeaapp.composables.PantallaPerfil
import com.example.primeaapp.composables.PantallaPerfilPreview
import com.example.primeaapp.composables.crearPerfil
import com.example.primeaapp.ui.theme.PrimeaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeaAppTheme {
                ListaCompras()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Button( {}) {
        Icon(Icons.Filled.Favorite, contentDescription = "")
        Text("Hola $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimeaAppTheme {
        Greeting("Bienvenido")
    }
}