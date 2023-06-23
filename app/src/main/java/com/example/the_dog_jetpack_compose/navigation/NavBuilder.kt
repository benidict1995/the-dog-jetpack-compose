package com.example.the_dog_jetpack_compose.navigation

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.the_dog_jetpack_compose.feature.doglist.DogListScreen
import com.example.the_dog_jetpack_compose.feature.dogdetails.DogDetailsScreen

fun NavGraphBuilder.provideDogListScreen(
    navController: NavHostController
) {
    composable(route = NavRoute.DogListScreen.path) {
        DogListScreen(navigateToDogDetails = { breed ->
            navController.navigate(
                NavRoute.DogDetailsScreen.withArgs(
                    breed.id.toString(),
                    breed.referenceImageId
                )
            )
        })
    }
}

fun NavGraphBuilder.provideDogDetailsScreen(navController: NavController) {
    composable(
        route = NavRoute.DogDetailsScreen.withArgsFormat(
            NavRoute.DogDetailsScreen.breedId,
            NavRoute.DogDetailsScreen.imageId
        ),
        arguments = listOf(
            navArgument(NavRoute.DogDetailsScreen.breedId) {
                type = NavType.StringType
            },
            navArgument(NavRoute.DogDetailsScreen.imageId) {
                type = NavType.StringType
            }
        )
    ) { navBackStackEntry ->
        val breedId =
            navBackStackEntry.arguments?.getString(NavRoute.DogDetailsScreen.breedId).orEmpty()
        val imageId =
            navBackStackEntry.arguments?.getString(NavRoute.DogDetailsScreen.imageId).orEmpty()
        DogDetailsScreen(breedId = breedId.toInt(), imageId = imageId){
            navController.popBackStack()
        }
    }
}