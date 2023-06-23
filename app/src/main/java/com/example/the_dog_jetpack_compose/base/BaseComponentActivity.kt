package com.example.the_dog_jetpack_compose.base

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.the_dog_jetpack_compose.base.di.BaseHiltComponentActivity
import com.example.the_dog_jetpack_compose.ui.theme.ThedogjetpackcomposeTheme

abstract class BaseComponentActivity :
    BaseHiltComponentActivity() {

}