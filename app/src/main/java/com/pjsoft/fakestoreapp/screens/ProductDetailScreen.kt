package com.pjsoft.fakestoreapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.pjsoft.fakestoreapp.models.Product
import com.pjsoft.fakestoreapp.components.DisabledButton

@Composable
fun ProductDetailScreen(id: Int) {
    val product = Product(
        id = id,
        title = "Laptop Pro 15",
        description = "A professional-grade laptop with a sleek design, high performance, and long battery life.",
        price = 1499.99,
        image = "https://via.placeholder.com/300"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = rememberAsyncImagePainter(product.image),
            contentDescription = product.title,
            modifier = Modifier.size(220.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.height(16.dp))
        Text(text = product.title, style = MaterialTheme.typography.titleLarge)
        Text(text = "$${product.price}", style = MaterialTheme.typography.bodyMedium)
        Spacer(Modifier.height(12.dp))
        Text(text = product.description, style = MaterialTheme.typography.bodyMedium)
        Spacer(Modifier.height(20.dp))
        DisabledButton(label = "Agregar al carrito (Deshabilitado)")
    }
}
