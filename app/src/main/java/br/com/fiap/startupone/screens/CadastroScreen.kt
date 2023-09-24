package br.com.fiap.startupone.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.startupone.R

@Composable
fun CadastroScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .padding(20.dp, 30.dp)
            .border(
                width = 0.8.dp,
                color = Color.Black.copy(alpha = 0.5f),
                shape = RoundedCornerShape(32.dp)
            )
    )
    Box(
        modifier = Modifier
            .size(3.dp)
            .padding(28.dp, 38.dp)
            .border(
                width = 0.8.dp,
                color = Color.Black.copy(alpha = 0.5f),
                shape = RoundedCornerShape(28.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
    }

    var texto by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.padding(32.dp), Arrangement.spacedBy(32.dp)) {
        TextField(
            value = texto,
            onValueChange = { letra ->
                texto = letra
            },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Qual o seu nome??")
            },
            placeholder = {
                Text(text = "Insira seu nome")
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.person_24),
                    contentDescription = "Icone de pessoa"
                )
            })
        TextField(
            value = texto,
            onValueChange = { letra ->
                texto = letra
            },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Qual seu email?")
            },
            placeholder = {
                Text(text = "Digite seu email")
            })
        TextField(
            value = texto,
            onValueChange = { letra ->
                texto = letra
            },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Confirme seu email")
            })
        TextField(
            value = texto,
            onValueChange = { letra ->
                texto = letra
            },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Qual sua senha?")
            },
            placeholder = {
                Text(text = "Digite sua senha")
            })
        TextField(
            value = texto,
            onValueChange = { letra ->
                texto = letra
            },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Confirme sua senha")
            })
        TextField(
            value = texto,
            onValueChange = { letra ->
                texto = letra
            },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Você é uma empresa?")
            })
        Button(
            onClick = {
                      navController.navigate("dashboard")
            },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(Color.Green)
        ) {
            Text(
                text = "Cadastre-se"
            )
        }

    }
}

