package com.example.the_dog_jetpack_compose.feature.component

import android.util.Size
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.benidict.common.ext.loadImageUrl
import com.benidict.domain.model.Breed
import com.example.the_dog_jetpack_compose.R
import com.example.the_dog_jetpack_compose.feature.component.shimmer.ShimmerBrush
import com.example.the_dog_jetpack_compose.ui.theme.fontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DogCard(
    breed: Breed,
    onClick: (Breed) -> Unit
) {
    Card(
        shape = RoundedCornerShape(size = 12.dp),
        modifier = Modifier.clickable {
            onClick(breed)
        }
    ) {
        Column {
            Row(
                modifier = Modifier
                    .padding(all = 12.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val showShimmer = remember { mutableStateOf(true) }
                AsyncImage(
                    model = breed.image.url,
                    contentDescription = "",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(60.dp)
                        .background(ShimmerBrush(targetValue = 1300f, showShimmer = showShimmer.value)),
                    onSuccess = { showShimmer.value = false },
                    contentScale = ContentScale.Crop
                )
//                Image(
//                    modifier = Modifier
//                        .clip(shape = CircleShape)
//                        .size(60.dp),
//                    contentScale = ContentScale.Crop,
//                    painter = loadImageUrl(breed.image.url),
//                    contentDescription = ""
//                )
                Spacer(modifier = Modifier.width(width = 8.dp))
                Text(
                    fontFamily = fontFamily, fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(0.dp, 0.dp, 10.dp, 0.dp),
                    text = breed.name
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DogCardPreview() {
    DogCard(Breed.empty()) {
    }
}