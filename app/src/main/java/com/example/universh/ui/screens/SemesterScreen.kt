package com.example.universh.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.universh.R





@Composable
fun SemesterScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Semestre",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Parcial headers and items
            ParcialList("1er parcial", listOf(
                "Introducción al Derecho" to "9.0",
                "Derecho Constitucional" to "8.7",
                "Derecho Penal" to "8.5",
                "Teoría del Estado" to "9.2",
                "Derecho Civil" to "8.9",
                "Derecho Internacional" to "8.8",
                "Historia del Derecho" to "9.1"
            ))

            ParcialList("2do parcial", listOf(
                "Introducción al Derecho" to "8.8",
                "Derecho Constitucional" to "8.9",
                "Derecho Penal" to "8.6",
                "Teoría del Estado" to "9.3",
                "Derecho Civil" to "8.7",
                "Derecho Internacional" to "8.9",
                "Historia del Derecho" to "9.0"
            ))

            ParcialList("3er parcial", listOf(
                "Introducción al Derecho" to "9.1",
                "Derecho Constitucional" to "8.6",
                "Derecho Penal" to "8.7",
                "Teoría del Estado" to "9.0",
                "Derecho Civil" to "8.8",
                "Derecho Internacional" to "9.1",
                "Historia del Derecho" to "8.9"
            ))

            // Footer
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF002F5D))
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Promedio", color = Color(0xFFEBEBEB), fontWeight = FontWeight.Bold)
                Text(text = "8.8", color = Color(0xFFEBEBEB), fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun ParcialList(headerText: String, items: List<Pair<String, String>>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEBEBEB))
            .padding(horizontal = 20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Materia", color = Color(0xFF002F5D), fontWeight = FontWeight.Bold)
            Text(text = headerText, color = Color(0xFF002F5D), fontWeight = FontWeight.Bold)
        }

        items.forEach { item ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = item.first, color = Color(0xFF002F5D))
                Text(text = item.second, color = Color(0xFF002F5D))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SemesterScreenPreview() {
    SemesterScreen()
}
