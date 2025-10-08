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
fun HomeScreen() {
    // Simulate loading (for design demo)
    var isLoading = true

    if (isLoading) {
        LoadingState()
    } else {
        // your product list here
    }
}


@Composable
fun ProductList(navController: NavController) {
    val sampleProducts = listOf(
        Product(
            id = 1,
            title = "Laptop Pro 15",
            price = 1499.99,
            description = "Powerful laptop for professionals with a Retina display and 1TB SSD.",
            category = "Electronics",
            image = "https://picsum.photos/300/200?random=1"
        ),
        Product(
            id = 2,
            title = "Smartphone X2",
            price = 899.99,
            description = "Next-gen performance smartphone with an ultra-wide camera and 5G support.",
            category = "Electronics",
            image = "https://picsum.photos/300/200?random=2"
        ),
        Product(
            id = 3,
            title = "Headphones Max",
            price = 299.99,
            description = "Immersive sound experience with noise cancellation and 30-hour battery life.",
            category = "Audio",
            image = "https://picsum.photos/300/200?random=3"
        ),
        Product(
            id = 4,
            title = "Smartwatch Fit Pro",
            price = 199.99,
            description = "Advanced fitness tracking smartwatch with heart rate and sleep monitoring.",
            category = "Wearables",
            image = "https://picsum.photos/300/200?random=4"
        ),
        Product(
            id = 5,
            title = "Mechanical Keyboard RGB",
            price = 149.99,
            description = "Compact mechanical keyboard with customizable RGB lighting and tactile switches.",
            category = "Accessories",
            image = "https://picsum.photos/300/200?random=5"
        ),
        Product(
            id = 6,
            title = "4K Action Camera",
            price = 249.99,
            description = "Compact waterproof camera ideal for capturing outdoor adventures in stunning 4K.",
            category = "Cameras",
            image = "https://picsum.photos/300/200?random=6"
        ),
        Product(
            id = 7,
            title = "Bluetooth Speaker X",
            price = 129.99,
            description = "Portable Bluetooth speaker with deep bass and 12-hour playtime.",
            category = "Audio",
            image = "https://picsum.photos/300/200?random=7"
        ),
        Product(
            id = 8,
            title = "Wireless Mouse Ultra",
            price = 59.99,
            description = "Ergonomic wireless mouse with adjustable DPI and silent buttons.",
            category = "Accessories",
            image = "https://picsum.photos/300/200?random=8"
        ),
        Product(
            id = 9,
            title = "Gaming Monitor 27”",
            price = 329.99,
            description = "27-inch QHD monitor with 165Hz refresh rate and adaptive sync technology.",
            category = "Monitors",
            image = "https://picsum.photos/300/200?random=9"
        ),
        Product(
            id = 10,
            title = "Drone Air Lite",
            price = 499.99,
            description = "Lightweight drone with 4K camera, GPS stabilization, and smart flight modes.",
            category = "Drones",
            image = "https://picsum.photos/300/200?random=10"
        )
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
