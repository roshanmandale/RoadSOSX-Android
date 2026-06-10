package com.roadsosx.domain.model

data class AccidentReport(
    val id: String,
    val description: String,
    val imageUrls: List<String>,
    val latitude: Double,
    val longitude: Double,
    val timestamp: Long
)
