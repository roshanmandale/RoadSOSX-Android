package com.roadsosx.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import com.roadsosx.data.local.entity.SOSEventEntity

@Dao
interface SOSEventDao {
    @Query("SELECT * FROM sos_events ORDER BY timestamp DESC")
    fun getAllSOSEventsFlow(): Flow<List<SOSEventEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSOSEvent(event: SOSEventEntity)

    @Query("DELETE FROM sos_events")
    suspend fun clearAllEvents()
}
