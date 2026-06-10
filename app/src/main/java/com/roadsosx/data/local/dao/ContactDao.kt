package com.roadsosx.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import com.roadsosx.data.local.entity.ContactEntity

@Dao
interface ContactDao {
    @Query("SELECT * FROM emergency_contacts ORDER BY name ASC")
    fun getAllContactsFlow(): Flow<List<ContactEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertContact(contact: ContactEntity)

    @Delete
    suspend fun deleteContact(contact: ContactEntity)

    @Query("DELETE FROM emergency_contacts")
    suspend fun clearAllContacts()
}
