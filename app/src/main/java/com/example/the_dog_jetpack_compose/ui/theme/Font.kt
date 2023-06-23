package com.example.the_dog_jetpack_compose.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.the_dog_jetpack_compose.R

val fontFamily = FontFamily(
    Font(
        resId = R.font.roboto_condensed_bold,
        weight = FontWeight.W900,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.roboto_condensed_bold_italic,
        weight = FontWeight.W900,
        style = FontStyle.Italic
    ),
    Font(
        resId = R.font.roboto_condensed_regular,
        weight = FontWeight.W500,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.roboto_condensed_regular,
        weight = FontWeight.W300,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.roboto_condensed_light,
        weight = FontWeight.W200,
        style = FontStyle.Normal
    )
)