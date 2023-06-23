package com.example.the_dog_jetpack_compose.feature.dogdetails

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import com.benidict.domain.model.Breed
import com.example.the_dog_jetpack_compose.R
import com.example.the_dog_jetpack_compose.feature.component.DogDetails
import com.example.the_dog_jetpack_compose.feature.component.LineSeparator
import com.example.the_dog_jetpack_compose.ui.theme.fontFamily
import kotlinx.coroutines.Dispatchers

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DogDetailsScreen(breedId: Int, imageId: String, onBackPressed: () -> Unit) {
    var breed: Breed? = null
    var url = ""
    val viewModel = hiltViewModel<DogDetailsViewModel>()
    LaunchedEffect(Unit) {
        viewModel.loadBreedDetails(breedId = breedId, imageId)
    }
    when (val state = viewModel.state.collectAsState(initial = Dispatchers.IO).value) {
        is DogDetailsState.LoadDogDetails -> {
            breed = state.dogDetails
            url = state.url
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = colorResource(id = R.color.purple_500)),
                modifier = Modifier
                    .fillMaxWidth(),
                navigationIcon = {
                    IconButton(onClick = {
                        onBackPressed()
                    }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                },
                title = {
                    Text(
                        fontFamily = fontFamily, fontWeight = FontWeight.Medium,
                        text = breed?.name.orEmpty(),
                        color = colorResource(id = R.color.white),
                        textAlign = TextAlign.Start,
                        maxLines = 1,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)

        ) {
            DogDetails(breed = breed ?: Breed(), url = url)
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            )
            LineSeparator(Modifier.padding(start = 16.dp, end = 16.dp))
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(22.dp)
            )
            ConstraintLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
            ) {
                val (
                    labelTemperament,
                    textTemperament,
                    labelHeight,
                    textHeight,
                    labelWeight,
                    textWeight,
                    labelBreed,
                    textBreed,
                    labelLifeSpan,
                    textLifeSpan
                ) = createRefs()

                Text(text = stringResource(id = R.string.temperament),
                    fontFamily = fontFamily, fontWeight = FontWeight.Bold,
                    modifier = Modifier.constrainAs(labelTemperament) {
                        start.linkTo(parent.start)
                        top.linkTo(parent.top)
                    }
                )

                Text(
                    text = breed?.temperament.orEmpty(),
                    fontFamily = fontFamily, fontWeight = FontWeight.Normal,
                    modifier = Modifier.constrainAs(textTemperament) {
                        start.linkTo(parent.start)
                        top.linkTo(labelTemperament.bottom, 2.dp)
                    }
                )

                Text(
                    text = stringResource(id = R.string.height),
                    fontFamily = fontFamily, fontWeight = FontWeight.Bold,
                    modifier = Modifier.constrainAs(labelHeight) {
                        start.linkTo(parent.start)
                        top.linkTo(textTemperament.bottom, 22.dp)
                    }
                )

                Text(
                    text = breed?.height?.imperial.orEmpty(),
                    fontFamily = fontFamily, fontWeight = FontWeight.Normal,
                    modifier = Modifier.constrainAs(textHeight) {
                        start.linkTo(parent.start)
                        top.linkTo(labelHeight.bottom, 2.dp)
                    }
                )

                Text(text = stringResource(id = R.string.weight),
                    fontFamily = fontFamily, fontWeight = FontWeight.Bold,
                    modifier = Modifier.constrainAs(labelWeight) {
                        start.linkTo(labelHeight.end, 150.dp)
                        top.linkTo(textTemperament.bottom, 22.dp)
                    }
                )

                Text(
                    text = breed?.weight?.imperial.orEmpty(),
                    fontFamily = fontFamily, fontWeight = FontWeight.Normal,
                    modifier = Modifier.constrainAs(textWeight) {
                        start.linkTo(labelWeight.start)
                        top.linkTo(labelWeight.bottom, 2.dp)
                    }
                )

                Text(
                    text = stringResource(id = R.string.breed),
                    fontFamily = fontFamily, fontWeight = FontWeight.Bold,
                    modifier = Modifier.constrainAs(labelBreed) {
                        start.linkTo(parent.start)
                        top.linkTo(textHeight.bottom, 22.dp)
                    }
                )

                Text(
                    text = breed?.breedGroup.orEmpty(),
                    fontFamily = fontFamily, fontWeight = FontWeight.Normal,
                    modifier = Modifier.constrainAs(textBreed) {
                        top.linkTo(labelBreed.bottom, 2.dp)
                        start.linkTo(parent.start)
                    })

                Text(text = stringResource(id = R.string.life_span),
                    fontFamily = fontFamily, fontWeight = FontWeight.Bold,
                    modifier = Modifier.constrainAs(labelLifeSpan) {
                        top.linkTo(textWeight.bottom, 22.dp)
                        start.linkTo(labelBreed.end, 150.dp)
                    })

                Text(
                    text = breed?.lifeSpan.orEmpty(),
                    fontFamily = fontFamily, fontWeight = FontWeight.Normal,
                    modifier = Modifier.constrainAs(textLifeSpan) {
                        top.linkTo(labelLifeSpan.bottom, 2.dp)
                        start.linkTo(labelLifeSpan.start)
                    })
            }
        }
    }

}