package com.example.the_dog_jetpack_compose.feature.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.the_dog_jetpack_compose.R

@Composable
fun LineSeparator(modifier: Modifier){
    Spacer(
        modifier = modifier
            .height(1.dp)
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.line))
    )
}