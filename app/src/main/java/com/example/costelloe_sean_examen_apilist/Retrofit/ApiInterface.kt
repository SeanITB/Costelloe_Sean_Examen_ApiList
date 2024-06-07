package com.example.costelloe_sean_examen_apilist.Retrofit

import com.example.costelloe_sean_examen_apilist.Moduls.*
import okhttp3.OkHttpClient
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {
    @GET("characters")
    suspend fun getData(): Response<Data>

    companion object {
        val BASE_URL = "https://dattebayo-api.onrender.com/"
        fun create(): ApiInterface {
            val client = OkHttpClient.Builder().build()
            val retrofit = Retrofit
                .Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
            return retrofit.create(ApiInterface::class.java)
        }
    }
}