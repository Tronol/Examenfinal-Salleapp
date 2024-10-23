package com.example.universh.ui.screens


import android.util.Log
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.universh.R
import com.example.universh.ui.components.CardImage
import com.example.universh.ui.components.Widget
import com.example.universh.ui.theme.UnivershAppTheme
import com.example.universh.ui.utils.Cash
import com.example.universh.ui.utils.Logout
import com.example.universh.ui.utils.Screens
import com.example.universh.ui.utils.Task
import com.example.universh.ui.utils.communities
import com.example.universh.ui.utils.newsList


@Composable
fun HomeScreen(innerPadding: PaddingValues, navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(
                rememberScrollState()
            )
    ) {
        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(270.dp)
                .background(MaterialTheme.colorScheme.primary)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image( //Profil
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .size(70.dp)
                        .clip(RoundedCornerShape(40.dp))
                )

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .offset(x = 10.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.welcome_text),
                        color = Color.White,
                        fontSize = 18.sp
                    )
                    Text(
                        text = "Manuel",
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                }
                Icon(
                    imageVector = Logout,
                    contentDescription = "Logout",
                    modifier = Modifier
                        .size(45.dp)
                        .clickable {
                            Log.i("HomeScreen", "Cerrando sesion")
                        },
                    tint = Color.White
                )

            }
        }

        // Widgets
        Box(
            modifier = Modifier
                .fillMaxSize() // Ocupa todo el espacio disponible
                .padding(vertical = 30.dp), // Puedes ajustar el padding si es necesario
            contentAlignment = Alignment.Center // Centra el contenido
        ){
            Box(
                modifier = Modifier
                    .width(700.dp)
                    .height(100.dp)
                    .offset(y = (-160).dp)
                    .padding(horizontal = 24.dp)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {

                    Widget(
                        icon = Cash,
                        text = stringResource(id = R.string.cash_text),
                        onClick = {
                            Log.d("HomeScreen", "Navegando a PagosScreen")
                            navController.navigate("pagos")
                        }
                    )
                    Widget(
                        icon = Icons.Default.Person,
                        text = "perfil",
                        onClick = {
                            Log.d("HomeScreen", "Navegando a PagosScreen")
                            navController.navigate("settings")
                        }
                    )

                }
            }
        }

        // Body
        Box(
            modifier = Modifier
                .offset(y = (-140).dp)
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)

            ) {
                Text(
                    text = stringResource(id = R.string.news),
                    style = MaterialTheme.typography.titleLarge
                )
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(newsList){ news ->
                        CardImage(news = news){
                            navController.navigate(Screens.NewsDetail.route+"/${news.id}")
                        }
                    }
                }
                Text(
                    text = "Comunidad",
                    modifier = Modifier.padding(top = 20.dp),
                    style = MaterialTheme.typography.titleLarge
                )
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(500.dp)
                ) {
                    items(communities){
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .size(180.dp)
                                .padding(16.dp)
                        ) {
                            AsyncImage(
                                model = it.image,
                                contentDescription = it.id.toString(),
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }
                }
            }
        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomeScreenPreview() {
    val navController = rememberNavController()
    UnivershAppTheme {
        HomeScreen(innerPadding = PaddingValues(0.dp), navController = navController)
    }
}