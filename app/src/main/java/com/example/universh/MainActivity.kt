package com.example.universh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.universh.ui.screens.CalendarScreen
import com.example.universh.ui.screens.GradesScreen
import com.example.universh.ui.screens.HomeScreen
import com.example.universh.ui.screens.NewsDetailScreen
import com.example.universh.ui.screens.ProfileScreen
import com.example.universh.ui.screens.PagosScreen
import com.example.universh.ui.screens.PasswordsScreen
import com.example.universh.ui.screens.SemesterScreen
import com.example.universh.ui.theme.UnivershAppTheme
import com.example.universh.ui.utils.Screens
import com.example.universh.ui.utils.bottomNavBarItems
import com.exyte.animatednavbar.AnimatedNavigationBar
import com.exyte.animatednavbar.animation.indendshape.shapeCornerRadius

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            var selectedItemIndex by rememberSaveable {
                mutableStateOf(0)
            }
            val bottomNavRoutes = listOf(
                Screens.Home.route,
                Screens.Grades.route,
                Screens.Settings.route,
                Screens.Calendar.route,
                Screens.Pagos.route,
                Screens.Semester.route,
                Screens.Password.route
            )
            UnivershAppTheme {
                val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        if(currentRoute in bottomNavRoutes){
                            AnimatedNavigationBar(
                                selectedIndex = selectedItemIndex,
                                modifier = Modifier.height(90.dp),
                                barColor = MaterialTheme.colorScheme.primary,
                                ballColor = MaterialTheme.colorScheme.primary,
                            ) {
                                bottomNavBarItems.forEachIndexed { index, bottomNavigationItem ->
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable {
                                                selectedItemIndex = index
                                                navController.navigate(bottomNavigationItem.route)
                                            }
                                    ) {
                                        Icon(
                                            imageVector = bottomNavigationItem.icon,
                                            contentDescription = bottomNavigationItem.title,
                                            tint = if (selectedItemIndex == index) Color.White else Color.White.copy(
                                                alpha = 0.5f
                                            ),
                                            modifier = Modifier.size(26.dp)
                                        )
                                        Text(
                                            text = bottomNavigationItem.title,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = if (selectedItemIndex == index) Color.White else Color.White.copy(
                                                alpha = 0.5f
                                            ),
                                        )
                                    }
                                }
                            }
                        }

                    }
                ) { innerPadding ->
                    NavHost(navController = navController, startDestination = Screens.Home.route) {
                        composable(route = Screens.Home.route) {
                            HomeScreen(innerPadding = innerPadding, navController = navController)
                        }
                        composable(route = Screens.Calendar.route){
                            CalendarScreen(innerPadding = innerPadding)
                        }
                        composable(route = Screens.Grades.route){
                            GradesScreen(navController = navController)
                        }
                        composable(route = Screens.Settings.route) {
                            ProfileScreen(navController= navController)
                        }
                        composable(
                            route = Screens.NewsDetail.route+"/{id}",
                            arguments = listOf(
                                navArgument("id"){
                                    type = NavType.IntType
                                    nullable = false
                                }
                            )
                        ) {
                            val id = it.arguments?.getInt("id",0) ?: 0
                            NewsDetailScreen(newsId=id,innerPadding = innerPadding)
                        }
                        composable(route = Screens.Pagos.route) {
                            PagosScreen()
                        }
                        composable(route = Screens.Semester.route) {
                            SemesterScreen() // Asegúrate de que este Composable esté definido
                        }
                        composable(route = Screens.Password.route) {
                            PasswordsScreen()
                        }
                    }
                }
            }
        }
    }
}
