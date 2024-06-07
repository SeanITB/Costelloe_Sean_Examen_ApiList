package com.example.costelloe_sean_examen_apilist.Retrofit

class Repository {
    val apiInterface = ApiInterface.create()
    suspend fun getAllCharacter() = apiInterface.getData()
}