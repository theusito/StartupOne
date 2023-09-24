package br.com.fiap.startupone.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DashboardScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(109, 156, 105))
            .padding(32.dp)
    ) {
        Text(text = "Dashboard",
            color = Color.White,
            fontSize = 24.sp)
        Button(
            onClick = {
                navController.navigate("login")
            },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(text = "Sair", fontSize = 20.sp)
        }
    }
}