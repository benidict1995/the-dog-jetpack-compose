package com.benidict.network.model

import com.benidict.domain.model.Breed
import com.google.gson.annotations.SerializedName

data class BreedDTO(
    @SerializedName("id") val id: Int = 0,
    @SerializedName("name") val name: String = "",
    @SerializedName("image") val image: ImageDTO? = null,
    @SerializedName("weight") val weight: MeasurementDTO? = null,
    @SerializedName("height") val height: MeasurementDTO? = null,
    @SerializedName("bred_for") val bredFor: String = "",
    @SerializedName("breed_group") val breedGroup: String = "",
    @SerializedName("life_span") val lifeSpan: String = "",
    @SerializedName("temperament") val temperament: String = "",
    @SerializedName("origin") val origin: String = "",
    @SerializedName("reference_image_id") val referenceImageId: String = ""
) {
    companion object {
        fun toDomain(breedDTO: List<BreedDTO>): List<Breed> {
            return breedDTO.map {
                with(it) {
                    Breed(
                        id = id,
                        name = name,
                        weight = MeasurementDTO.toDomain(weight ?: MeasurementDTO()),
                        height = MeasurementDTO.toDomain(height ?: MeasurementDTO()),
                        image = ImageDTO.toDomain(image ?: ImageDTO()),
                        bredFor = bredFor,
                        breedGroup = breedGroup,
                        lifeSpan = lifeSpan,
                        temperament = temperament,
                        origin = origin,
                        referenceImageId = referenceImageId
                    )
                }
            }.toList()
        }
    }
}