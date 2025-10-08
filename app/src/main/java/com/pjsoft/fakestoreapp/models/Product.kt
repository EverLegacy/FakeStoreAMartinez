package com.pjsoft.fakestoreapp.models
data class Product(
    val id: Int,
    val title: String,
    val price: Double,          // ← expects a Double
    val description: String,
    val category: String = "General",
    val image: String = "",
    val rating: Rating = Rating(0.0, 0)
)


