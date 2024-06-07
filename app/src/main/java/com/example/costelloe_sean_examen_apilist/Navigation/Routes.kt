package com.example.costelloe_sean_examen_apilist.Navigation

sealed class Routes(val routes: String) {
    object ListScreen: Routes("listScreen")
    object DetailScreen: Routes("detailScreen")
    object AboutScreen: Routes("aboutScreen")
}