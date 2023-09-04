package com.example.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("2498658776941462/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName: String):Response<SuperheroDataResponse>

    @GET("2498658776941462/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId: String):Response<SuperheroDetailResponse>
}