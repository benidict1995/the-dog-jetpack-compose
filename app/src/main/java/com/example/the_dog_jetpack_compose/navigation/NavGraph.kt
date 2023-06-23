package com.example.the_dog_jetpack_compose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.DogListScreen.path
    ) {
        provideDogListScreen(navController)
        provideDogDetailsScreen(navController)
    }
}
