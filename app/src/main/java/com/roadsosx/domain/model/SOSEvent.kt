package com.roadsosx.domain.model

data class SOSEvent(
    val id: String,
    val timestamp: Long,
    val latitude: Double,
    val longitude: Double,
    val status: String,
    val description: String?
)
