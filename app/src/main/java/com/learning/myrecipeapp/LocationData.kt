package com.learning.myrecipeapp

data class LocationData(
    val latitude:Double,
    val longitude: Double
)

data class GeocodingResponse(
    val results: List<GeocodingResult>,
    val status: String
)

data class GeocodingResult(
    val fomatted_address: String
)
