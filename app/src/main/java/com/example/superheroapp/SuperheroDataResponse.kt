package com.example.superheroapp

import com.google.gson.annotations.SerializedName

class SuperheroDataResponse(
    @SerializedName("response") val response: String,
    @SerializedName("results") val superheros: List<SuperheroItemResponse>
)

data class SuperheroItemResponse(
    @SerializedName("id") val superheroId: String,
    @SerializedName("name") val name: String
)