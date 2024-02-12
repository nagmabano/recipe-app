package com.learning.myrecipeapp

data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)

data class CatagoriesResponse(val categories: List<Category>)