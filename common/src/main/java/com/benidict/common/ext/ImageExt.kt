package com.benidict.common.ext

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@Composable
fun loadImageUrl(url: String) = rememberAsyncImagePainter(
    model = ImageRequest.Builder(LocalContext.current)
        .data(url)
        .size(coil.size.Size.ORIGINAL)
        .build()
)