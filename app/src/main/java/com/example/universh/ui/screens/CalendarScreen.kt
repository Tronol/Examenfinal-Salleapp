package com.example.universh.ui.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.universh.ui.components.DayItem
import com.example.universh.ui.components.ScreenTemplate
import com.example.universh.ui.theme.UnivershAppTheme
import com.example.universh.ui.theme.UnivershAppTheme

@Composable
fun CalendarScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Pantalla de Calendario")
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CalendarScreenPreview() {
    UnivershAppTheme {
        CalendarScreen(innerPadding = PaddingValues(0.dp))
    }
}