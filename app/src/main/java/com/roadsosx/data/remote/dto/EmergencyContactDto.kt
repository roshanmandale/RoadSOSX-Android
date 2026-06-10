package com.roadsosx.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class EmergencyContactDto(
    val id: String,
    val userId: String,
    val contactName: String,
    val contactNumber: String,
    val relationship: String?
)
