package com.roadsosx.data.mapper

import com.roadsosx.data.local.entity.SOSEventEntity
import com.roadsosx.domain.model.SOSEvent

fun SOSEventEntity.toDomain(): SOSEvent {
    return SOSEvent(
        id = id,
        timestamp = timestamp,
        latitude = latitude,
        longitude = longitude,
        status = status,
        description = description
    )
}

fun SOSEvent.toEntity(): SOSEventEntity {
    return SOSEventEntity(
        id = id,
        timestamp = timestamp,
        latitude = latitude,
        longitude = longitude,
        status = status,
        description = description
    )
}
