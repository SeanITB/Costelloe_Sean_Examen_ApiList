package com.example.costelloe_sean_examen_apilist.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.costelloe_sean_examen_apilist.ViewModel.NarutoViewModel
import com.example.costelloe_sean_examen_apilist.Views.DetailScreen
import com.example.costelloe_sean_examen_apilist.Views.ListScreen
import com.example.costelloe_sean_examen_apilist.Views.MyAboutScreen

@Composable
fun MyNavigation(narutoVM: NarutoViewModel, navController: NavController) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = Routes.ListScreen.routes
    ) {
        composable(Routes.ListScreen.routes) {
            narutoVM.getCharacters()
            ListScreen(narutoVM, navController)
        }
        composable(Routes.DetailScreen.routes) {
            DetailScreen(narutoVM)
        }
        composable(Routes.AboutScreen.routes) {
            MyAboutScreen()
        }
    }
}


