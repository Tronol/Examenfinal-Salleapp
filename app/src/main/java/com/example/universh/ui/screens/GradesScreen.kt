package com.example.universh.ui.screens

import androidx.navigation.compose.rememberNavController

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.universh.R
import com.example.universh.ui.components.ScreenTemplate
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.universh.ui.utils.Screens

@Composable
fun GradesScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(80.dp))

        Box(
            modifier = Modifier
                .size(175.dp)
                .background(Color(0xFFEBEBEB)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.note_icon),
                    contentDescription = "note-icon",
                    modifier = Modifier.size(84.dp)
                )
                Text(
                    text = "Calificaciones",
                    color = Color(0xFF002F5D),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            // Primer semestre button
            Button(
                onClick = { navController.navigate(Screens.Semester.route) },
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
                        text = "1er semestre",
                        color = Color(0xFF002F5D)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.next_icon),
                        contentDescription = "next-icon"
                    )
                }
            }

            // Segundo semestre button
            Button(
                onClick = { navController.navigate(Screens.Semester.route) },
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
                        text = "2do semestre",
                        color = Color(0xFF002F5D)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.next_icon),
                        contentDescription = "next-icon"
                    )
                }
            }


            Button(
                onClick = { navController.navigate(Screens.Semester.route) },
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
                        text = "3er semestre",
                        color = Color(0xFF002F5D)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.next_icon),
                        contentDescription = "next-icon"
                    )
                }
            }

            Button(
                onClick = { navController.navigate(Screens.Semester.route) },
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
                        text = "4to semestre",
                        color = Color(0xFF002F5D)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.next_icon),
                        contentDescription = "next-icon"
                    )
                }
            }



            Button(
                onClick = { navController.navigate(Screens.Semester.route) },
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
                        text = "5to semestre",
                        color = Color(0xFF002F5D)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.next_icon),
                        contentDescription = "next-icon"
                    )
                }
            }

        }
    }
}
