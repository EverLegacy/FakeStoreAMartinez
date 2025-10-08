package com.pjsoft.fakestoreapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pjsoft.fakestoreapp.components.*
import com.pjsoft.fakestoreapp.models.Product
import com.pjsoft.fakestoreapp.ui.theme.ProductDetailScreenRoute
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(navController: NavController) {
    var uiState by remember { mutableStateOf("loading") }

    // Simulate loading delay
    LaunchedEffect(Unit) {
        delay(1200)
        uiState = "data"
    }

    when (uiState) {
        "loading" -> LoadingState()
        "empty" -> EmptyState()
        "error" -> ErrorState(onRetry = { uiState = "loading" })
        else -> ProductList(navController)
    }
}

@Composable
fun ProductList(navController: NavController) {
    val sampleProducts = listOf(
        Product(1, "Laptop Pro 15", "Powerful laptop for professionals", 1499.99, "https://via.placeholder.com/150"),
        Product(2, "Smartphone X2", "Next-gen performance smartphone", 899.99, "https://via.placeholder.com/150"),
        Product(3, "Headphones Max", "Immersive sound experience", 299.99, "https://via.placeholder.com/150")
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(sampleProducts) { product ->
            ProductCard(product = product) {
                navController.navigate(ProductDetailScreenRoute(product.id))
            }
            Spacer(Modifier.height(12.dp))
        }
    }
}
