package com.example.costelloe_sean_examen_apilist.Navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationItems(val route: String, val icon: ImageVector, val label: String) {
    object List: BottomNavigationItems(Routes.ListScreen.routes, Icons.Filled.Home, "Home")
    object About: BottomNavigationItems(Routes.AboutScreen.routes, Icons.Filled.Info, "About")
}