package com.example.universh.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.universh.R

@Composable
fun PagosScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Contenido centrado
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(vertical = 30.dp),
            verticalArrangement = Arrangement.spacedBy(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Pagos Box
            Column(
                modifier = Modifier
                    .size(175.dp)
                    .background(Color(0xFFEBEBEB), shape = RoundedCornerShape(8.dp)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cash_icon),
                    contentDescription = "dollar-icon",
                    modifier = Modifier.size(84.dp)
                )
                Text(
                    text = "Pagos",
                    color = Color(0xFF002F5D),
                    fontSize = 18.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            // Months Section
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                MonthItem(month = "Enero", iconRes = R.drawable.check_icon)
                MonthItem(month = "Febrero", iconRes = R.drawable.check_icon)
                MonthItem(month = "Marzo", iconRes = R.drawable.check_icon)
                MonthItem(month = "Abril", iconRes = R.drawable.check_icon)
                MonthItem(month = "Mayo", iconRes = R.drawable.check_icon)
                MonthItem(month = "Junio", iconRes = R.drawable.danger_icon)
            }
        }
    }
}

@Composable
fun MonthItem(month: String, iconRes: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEBEBEB))
            .padding(horizontal = 20.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = month,
            color = Color(0xFF002F5D),
            fontSize = 16.sp
        )
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = "$month-icon",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PagosScreenPreview() {
    PagosScreen()
}
