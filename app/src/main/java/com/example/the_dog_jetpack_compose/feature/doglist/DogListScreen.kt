package com.example.the_dog_jetpack_compose.feature.doglist

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.hilt.navigation.compose.hiltViewModel
import com.benidict.domain.model.Breed
import com.benidict.domain.state.ResponseState
import com.example.the_dog_jetpack_compose.R
import com.example.the_dog_jetpack_compose.feature.component.DogCard
import com.example.the_dog_jetpack_compose.ui.theme.fontFamily
import kotlinx.coroutines.Dispatchers

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DogListScreen(
    navigateToDogDetails: (Breed) -> Unit
) {
    val viewModel = hiltViewModel<DogListViewModel>()
    LaunchedEffect(Unit) {
        viewModel.loadBreed()
    }
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = colorResource(id = R.color.purple_500)),
                modifier = Modifier
                    .fillMaxWidth(),
                title = {
                    Text(
                        fontFamily = fontFamily, fontWeight = FontWeight.Medium,
                        text = stringResource(id = R.string.home),
                        color = colorResource(id = R.color.white),
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            )
        },
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

            when (val state = viewModel.state.collectAsState(Dispatchers.IO).value) {
                is ResponseState.Loading -> {}
                is ResponseState.Success<*> -> {
                    DogList(state.data as List<*>) {
                        navigateToDogDetails(it)
                    }
                }

                is ResponseState.Failure -> {}
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
private fun DogList(list: List<*>, navigateToDogDetails: (Breed) -> Unit) {
    LazyColumn(
        Modifier.padding(start = 16.dp, end = 16.dp)
    ) {
        items(list) { dog ->
            Spacer(
                modifier = Modifier
                    .height(height = 8.dp)
                    .fillMaxWidth()
                    .background(color = Color.White)
            )
            DogCard(
                dog as Breed
            ) {
                navigateToDogDetails(it)
            }
        }
    }

}