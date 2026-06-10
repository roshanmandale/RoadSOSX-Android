package com.roadsosx.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class IncidentReportDto(
    val id: String,
    val userId: String,
    val description: String,
    val imageUrl: String?,
    val latitude: Double,
    val longitude: Double,
    val timestamp: Long
)
