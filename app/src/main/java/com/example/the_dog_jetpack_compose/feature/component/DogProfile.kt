package com.example.the_dog_jetpack_compose.feature.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.benidict.domain.model.Breed
import com.example.the_dog_jetpack_compose.R
import com.example.the_dog_jetpack_compose.feature.component.shimmer.ShimmerBrush
import com.example.the_dog_jetpack_compose.ui.theme.fontFamily

@Composable
fun DogDetails(breed: Breed, url: String) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp)) {
        Row {
            val showShimmer = remember { mutableStateOf(true) }
            AsyncImage(
                model = url,
                contentDescription = "",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(60.dp)
                    .background(ShimmerBrush(targetValue = 1300f, showShimmer = showShimmer.value)),
                onSuccess = { showShimmer.value = false },
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(id = R.string.breed_description, breed.name, breed.bredFor),
                fontFamily = fontFamily, fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 22.dp, top = 7.dp)
                    .wrapContentWidth()
            )
        }
    }
}