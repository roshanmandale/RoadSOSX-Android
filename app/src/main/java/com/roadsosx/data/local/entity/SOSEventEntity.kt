package com.roadsosx.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sos_events")
data class SOSEventEntity(
    @PrimaryKey val id: String,
    val timestamp: Long,
    val latitude: Double,
    val longitude: Double,
    val status: String, // e.g. ACTIVE, RESOLVED
    val description: String?
)
