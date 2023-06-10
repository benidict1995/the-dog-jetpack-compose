package com.benidict.network.model

import com.benidict.domain.model.Image
import com.google.gson.annotations.SerializedName

data class ImageDTO(
    @SerializedName("id") val id: String = "",
    @SerializedName("width") val width: Int = 0,
    @SerializedName("height") val height: Int = 0,
    @SerializedName("url") val url: String = ""
) {
    companion object {
        fun toDomain(imageDTO: ImageDTO): Image {
            return with(imageDTO) {
                Image(
                    id = id,
                    width = width,
                    height = height,
                    url = url
                )
            }
        }
    }
}