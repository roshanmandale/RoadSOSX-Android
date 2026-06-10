package com.roadsosx.di

import android.content.Context
import androidx.room.Room
import com.roadsosx.core.common.Constants
import com.roadsosx.data.local.database.AppDatabase
import com.roadsosx.data.local.dao.ContactDao
import com.roadsosx.data.local.dao.SOSEventDao
import com.roadsosx.data.local.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            Constants.DATABASE_NAME
        ).fallbackToDestructiveMigration().build()
    }

    @Provides
    fun provideUserDao(db: AppDatabase): UserDao {
        return db.userDao()
    }

    @Provides
    fun provideSOSEventDao(db: AppDatabase): SOSEventDao {
        return db.sosEventDao()
    }

    @Provides
    fun provideContactDao(db: AppDatabase): ContactDao {
        return db.contactDao()
    }
}
