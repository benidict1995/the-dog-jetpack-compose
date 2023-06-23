package com.example.the_dog_jetpack_compose.navigation

sealed class NavRoute(val path: String) {

    object DogListScreen : NavRoute("dog_list")

    object DogDetailsScreen : NavRoute("dog_details") {
        const val breedId = "breedId"
        const val imageId = "imageId"
    }

    fun withArgs(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }

    fun withArgsFormat(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach { arg ->
                append("/{$arg}")
            }
        }
    }
}