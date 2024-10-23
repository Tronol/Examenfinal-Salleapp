package com.example.universh.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.universh.R
import com.example.universh.ui.components.ScreenTemplate
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.universh.ui.utils.Screens

@Composable
fun ProfileScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        ProfileCard()
        Settings(navController = navController)
    }
}

@Composable
fun ProfileCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF002F5D))
            .padding(24.dp)
            .height(350.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(5.dp),
            modifier = Modifier.align(Alignment.Center).offset(y = (10).dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Profile Photo",
                modifier = Modifier.size(80.dp).clip(RoundedCornerShape(40.dp))
            )
            Text(
                text = "Andres Manuel Lopez Obrador",
                color = Color.White,
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontSize = 20.sp
                )
            )
            Text(
                text = "alo24007@lasallebajio.edu.mx",
                color = Color.White
            )
            Text(
                text = "Matricula: 024007",
                color = Color.White
            )
            Text(
                text = "Carrera: Derecho",
                color = Color.White
            )
            Text(
                text = "Semestre: 5to",
                color = Color.White
            )
        }
    }
}

@Composable
fun Settings(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        Button(
            onClick = { navController.navigate(Screens.Password.route) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 0.dp, vertical = 0.dp),
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color(0xFFEBEBEB))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 5.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Cambiar contraseña",
                    color = Color(0xFF002F5D)
                )
                Image(
                    painter = painterResource(id = R.drawable.new_password_icon),
                    contentDescription = "next-icon"
                )
            }
        }
        Button(
            onClick = { navController.navigate(Screens.Password.route) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 0.dp, vertical = 0.dp),
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color(0xFFEBEBEB))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 5.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Cambiar Tema",
                    color = Color(0xFF002F5D)
                )
                Image(
                    painter = painterResource(id = R.drawable.theme_icon),
                    contentDescription = "next-icon"
                )
            }
        }


        Button(
            onClick = { navController.navigate(Screens.Password.route) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 0.dp, vertical = 0.dp),
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color(0xFFEBEBEB))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 5.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Cerrar sesion",
                    color = Color(0xFF002F5D)
                )
                Image(
                    painter = painterResource(id = R.drawable.logout_icon),
                    contentDescription = "next-icon"
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfileScreen() {
    ProfileScreen(navController = rememberNavController())
}
