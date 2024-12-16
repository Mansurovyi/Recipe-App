package com.example.recipeapp

import retrofit2.http.GET

data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)

data class CategoriesResponse(val categories: List<Category>)

interface ApiService {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
}