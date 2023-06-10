package com.example.the_dog_jetpack_compose.feature.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import com.example.the_dog_jetpack_compose.ui.theme.Purple80
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopToolbar(title: String) {
    TopAppBar(
        title = {
            Text(
                title.uppercase(Locale.getDefault()),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.Black
            )
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Purple80)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun TopToolbarPreview() {
    TopAppBar(title = {
        Text("THE DOG")
    })
}