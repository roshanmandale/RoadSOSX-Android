package com.roadsosx.data.mapper

import com.roadsosx.data.local.entity.ContactEntity
import com.roadsosx.domain.model.EmergencyContact

fun ContactEntity.toDomain(): EmergencyContact {
    return EmergencyContact(
        id = id,
        name = name,
        phoneNumber = phoneNumber,
        relationship = relationship
    )
}

fun EmergencyContact.toEntity(): ContactEntity {
    return ContactEntity(
        id = id,
        name = name,
        phoneNumber = phoneNumber,
        relationship = relationship
    )
}
