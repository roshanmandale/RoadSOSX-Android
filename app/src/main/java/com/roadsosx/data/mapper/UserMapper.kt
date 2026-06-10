package com.roadsosx.data.mapper

import com.roadsosx.data.local.entity.UserEntity
import com.roadsosx.domain.model.User

fun UserEntity.toDomain(): User {
    return User(
        id = id,
        name = name,
        email = email,
        phoneNumber = phoneNumber,
        profilePictureUrl = profilePictureUrl
    )
}

fun User.toEntity(): UserEntity {
    return UserEntity(
        id = id,
        name = name,
        email = email,
        phoneNumber = phoneNumber,
        profilePictureUrl = profilePictureUrl
    )
}
