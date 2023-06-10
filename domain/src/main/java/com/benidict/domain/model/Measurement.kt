package com.benidict.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Measurement(
    val imperial: String = "",
    val metric: String = ""
) : Parcelable {
    companion object {
        fun empty(): Measurement {
            return Measurement(
                imperial = "",
                metric = ""
            )
        }
    }
}