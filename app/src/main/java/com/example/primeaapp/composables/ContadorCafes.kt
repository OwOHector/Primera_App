package com.example.primeaapp.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.primeaapp.R


@Composable
fun ContadorCafes(modifier: Modifier){
    var contador by remember {mutableStateOf(0)}

    Column(modifier = modifier.fillMaxWidth().statusBarsPadding(), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.cafe),
            contentDescription = "cafe",
            modifier = Modifier.size(300.dp)
        )
        Text("Te has tomado ${contador} cafes hoy")
        Button({contador++}) {
            Text("Tomar cafe")
        }
    }
}