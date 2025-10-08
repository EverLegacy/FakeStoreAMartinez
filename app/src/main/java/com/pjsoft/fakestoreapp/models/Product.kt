package com.pjsoft.fakestoreapp.models

data class Product(
    val id: Int,
    val title: String,
    val price: Double,
    val description: String,
    val category: String = "General",             // ✅ Default value
    val image: String = "",                       // ✅ Safe default for missing image
    val rating: Rating = Rating(0.0, 0)           // ✅ Default rating
)

data class Rating(
    val rate: Double,
    val count: Int
)
