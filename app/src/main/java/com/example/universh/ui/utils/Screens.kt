package com.example.universh.ui.utils

sealed class Screens(val route : String) {
    data object Home : Screens("home")
    data object Grades : Screens("grades")
    data object Calendar : Screens("calendar")
    data object Settings : Screens("settings")
    data object NewsDetail: Screens("news-detail")
    data object Pagos: Screens("pagos")
    data object Semester : Screens("semester")
    data object Password : Screens("password")
}