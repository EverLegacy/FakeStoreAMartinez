package com.pjsoft.fakestoreapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.pjsoft.fakestoreapp.ui.theme.TextSecondary

@Composable
fun LoadingState() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        CircularProgressIndicator()
    }
}

@Composable
fun EmptyState() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "No hay productos disponibles",
            style = MaterialTheme.typography.bodyMedium.copy(color = TextSecondary)
        )
    }
}

@Composable
fun ErrorState(onRetry: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Error al cargar los productos",
            style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.error),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = onRetry) { Text("Reintentar") }
    }
}

@Composable
fun DisabledButton(label: String) {
    Button(onClick = {}, enabled = false) {
        Text(label)
    }
}
