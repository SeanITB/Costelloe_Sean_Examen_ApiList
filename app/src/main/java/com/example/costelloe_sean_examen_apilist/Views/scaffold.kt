package com.example.costelloe_sean_examen_apilist.Views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.costelloe_sean_examen_apilist.Navigation.Routes
import com.example.costelloe_sean_examen_apilist.ViewModel.NarutoViewModel

@Composable
fun MyScaffold(narutoVM: NarutoViewModel, navController: NavController) {

    Scaffold(
        bottomBar = {/*toDO*/}
    ) {paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            MyNavigation(narutoVM, navController)
        }

    }
}

//toDO: aqui
@Composable
fun MyNavigation(narutoVM: NarutoViewModel, navController: NavController) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = Routes.ListScreen.routes
    ) {
        composable(Routes.ListScreen.routes) {
            ListScreen(narutoVM, navController)
        }
    }
}
