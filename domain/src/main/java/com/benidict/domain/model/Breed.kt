package com.benidict.domain.model

import android.net.Uri
import android.os.Parcelable
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize

@Parcelize
data class Breed(
    val id: Int = 0,
    val name: String = "",
    val bredFor: String = "",
    val breedGroup: String = "",
    val image: Image = Image.empty(),
    val weight: Measurement = Measurement.empty(),
    val height: Measurement = Measurement.empty(),
    val lifeSpan: String = "",
    val temperament: String = "",
    val origin: String = "",
    val referenceImageId: String = ""
) : Parcelable {
    override fun toString(): String = Uri.encode(Gson().toJson(this))

    companion object {
        fun empty(): Breed {
            return Breed(
                id = 0,
                name = "",
                bredFor = "",
                breedGroup = "",
                lifeSpan = "",
                height = Measurement.empty(),
                weight = Measurement.empty(),
                image = Image.empty(),
                temperament = "",
                origin = "",
                referenceImageId = ""
            )
        }
    }
}