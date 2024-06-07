package com.example.costelloe_sean_examen_apilist.Views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.costelloe_sean_examen_apilist.Navigation.BottomNavigationItems
import com.example.costelloe_sean_examen_apilist.Navigation.MyNavigation
import com.example.costelloe_sean_examen_apilist.ViewModel.NarutoViewModel

@Composable
fun MyScaffold(narutoVM: NarutoViewModel, navController: NavController) {
    Scaffold(
        bottomBar = {MyBottomBar(navController)}
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



