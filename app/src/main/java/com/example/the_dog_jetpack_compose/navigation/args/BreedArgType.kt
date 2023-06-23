package com.example.the_dog_jetpack_compose.navigation.args

import com.benidict.common.navigation.NavCustomType
import com.benidict.domain.ext.convertObjectToJsonString
import com.benidict.domain.ext.convertStringToObject
import com.benidict.domain.model.Breed

class BreedArgType : NavCustomType<Breed>() {

    override fun fromJsonParse(value: String): Breed = convertStringToObject(value)

    override fun Breed.getJsonParse(): String = convertObjectToJsonString()
}