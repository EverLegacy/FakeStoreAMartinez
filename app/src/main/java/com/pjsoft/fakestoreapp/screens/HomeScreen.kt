package com.pjsoft.fakestoreapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pjsoft.fakestoreapp.components.ProductCard
import com.pjsoft.fakestoreapp.models.Product
import com.pjsoft.fakestoreapp.models.Rating
import com.pjsoft.fakestoreapp.ui.theme.ProductDetailScreenRoute

@Composable
fun HomeScreen(navController: NavHostController) {
    val sampleProducts = listOf(
        Product(1, "Laptop Pro 15", 1499.99, "Powerful laptop for professionals", "Electronics", "https://picsum.photos/300/200?random=1", Rating(4.5, 120)),
        Product(2, "Smartphone X2", 899.99, "Next-gen smartphone", "Phones", "https://picsum.photos/300/200?random=2", Rating(4.2, 300)),
        Product(3, "Headphones Max", 299.99, "Immersive sound experience", "Audio", "https://picsum.photos/300/200?random=3", Rating(4.8, 90)),
        Product(4, "Smartwatch Fit Pro", 199.99, "Track your fitness in style", "Wearables", "https://picsum.photos/300/200?random=4", Rating(4.1, 210)),
        Product(5, "Mechanical Keyboard RGB", 149.99, "Tactile feedback and RGB lights", "Accessories", "https://picsum.photos/300/200?random=5", Rating(4.6, 150))
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(12.dp),
        contentPadding = PaddingValues(bottom = 80.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(sampleProducts) { product ->
            ProductCard(
                product = product,
                onClick = {
                    navController.navigate(ProductDetailScreenRoute(product.id))
                }
            )
        }
    }
}
