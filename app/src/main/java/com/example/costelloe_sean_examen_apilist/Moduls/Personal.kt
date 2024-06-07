package com.example.costelloe_sean_examen_apilist.Moduls

data class Personal(
    val affiliation: List<String>,
    val age: Age,
    val birthdate: String,
    val bloodType: String,
    val clan: String,
    val classification: List<String>,
    val height: Height,
    val kekkeiGenkai: List<String>,
    val kekkeiMōra: String,
    val occupation: List<String>,
    val partner: List<String>,
    val sex: String,
    val species: String,
    val status: String,
    val tailedBeast: String,
    val team: List<String>,
    val titles: List<String>,
    val weight: Weight
)