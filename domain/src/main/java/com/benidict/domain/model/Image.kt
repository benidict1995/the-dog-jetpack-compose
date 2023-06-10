package com.benidict.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Image(
    val id: String = "",
    val width: Int = 0,
    val height: Int = 0,
    val url: String = ""
) : Parcelable {
    companion object {
        fun empty(): Image {
            return Image(
                id = "",
                width = 0,
                height = 0,
                url = ""
            )
        }
    }
}