package com.example.recipeapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import retrofit2.http.GET

@Parcelize
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
) : Parcelable

data class CategoriesResponse(val categories: List<Category>)

interface ApiService {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
}