package com.roadsosx.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.roadsosx.data.local.dao.ContactDao
import com.roadsosx.data.local.dao.SOSEventDao
import com.roadsosx.data.local.dao.UserDao
import com.roadsosx.data.local.entity.ContactEntity
import com.roadsosx.data.local.entity.SOSEventEntity
import com.roadsosx.data.local.entity.UserEntity

@Database(
    entities = [
        UserEntity::class,
        SOSEventEntity::class,
        ContactEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun sosEventDao(): SOSEventDao
    abstract fun contactDao(): ContactDao
}
