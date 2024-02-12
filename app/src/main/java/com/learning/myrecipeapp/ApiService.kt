package com.learning.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val recipeService = retrofit.create(ApiService::class.java)

interface ApiService {
    // asynchronous or non blocking programming
    // example: wait while the data loads from the api
    @GET("categories.php")
    suspend fun getCategories(): CatagoriesResponse
}