package com.example.costelloe_sean_examen_apilist.Moduls

data class Data(
    val characters: List<Character>,
    val currentPage: Int,
    val pageSize: Int,
    val total: Int
)