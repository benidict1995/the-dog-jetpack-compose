package com.example.the_dog_jetpack_compose.feature.doglist

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.benidict.domain.model.Breed
import com.benidict.domain.state.ResponseState
import com.example.the_dog_jetpack_compose.MainViewModel
import com.example.the_dog_jetpack_compose.feature.component.DogCard
import kotlinx.coroutines.Dispatchers

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DogList(viewModel: MainViewModel = viewModel()) {
    Scaffold(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
    ) {
        when(val state = viewModel.state.collectAsState(Dispatchers.IO).value){
            is ResponseState.Loading -> {
                Log.d("makerChecker", "Loading")
            }
            is ResponseState.Success<*> -> {
                Log.d("makerChecker", "Success")
                LazyColumn {
                    items(state.data as List<*>) { dog ->
                        Spacer(modifier = Modifier.height(height = 8.dp).fillMaxWidth().background(color = Color.White))
                        DogCard(
                            dog as Breed
                        ){
                            Log.d("makerChecker", "dog-dog:$it")
                        }
                    }
                }
            }
            is ResponseState.Failure -> {
                Log.d("makerChecker", "Failure:${state.e}")
            }
        }
    }
}