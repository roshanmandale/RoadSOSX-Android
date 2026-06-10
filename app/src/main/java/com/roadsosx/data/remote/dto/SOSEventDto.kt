package com.roadsosx.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class SOSEventDto(
    val id: String,
    val userId: String,
    val latitude: Double,
    val longitude: Double,
    val status: String,
    val timestamp: Long
)
