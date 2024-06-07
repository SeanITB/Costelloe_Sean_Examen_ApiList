package com.example.costelloe_sean_examen_apilist.Moduls

data class Character(
    val debut: Debut,
    val id: Int,
    val images: List<String>,
    val jutsu: List<String>,
    val name: String,
    val natureType: List<String>,
    val personal: Personal,
    val rank: Rank,
    val tools: List<String>,
    val uniqueTraits: List<String>,
    val voiceActors: VoiceActors
)