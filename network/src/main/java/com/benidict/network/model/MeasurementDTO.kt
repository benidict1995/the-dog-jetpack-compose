package com.benidict.network.model

import com.benidict.domain.model.Measurement
import com.google.gson.annotations.SerializedName

data class MeasurementDTO(
    @SerializedName("imperial") val imperial: String = "",
    @SerializedName("metric") val metric: String = "",
) {
    companion object {
        fun toDomain(measurementDTO: MeasurementDTO): Measurement {
            return with(measurementDTO) {
                Measurement(
                    imperial = imperial,
                    metric = metric
                )
            }
        }
    }
}