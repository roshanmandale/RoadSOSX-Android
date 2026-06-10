package com.roadsosx.di

import com.roadsosx.data.repository.AuthRepositoryImpl
import com.roadsosx.data.repository.ContactsRepositoryImpl
import com.roadsosx.data.repository.MapsRepositoryImpl
import com.roadsosx.data.repository.ProfileRepositoryImpl
import com.roadsosx.data.repository.ReportsRepositoryImpl
import com.roadsosx.data.repository.SOSRepositoryImpl
import com.roadsosx.data.repository.SettingsRepositoryImpl
import com.roadsosx.domain.repository.AuthRepository
import com.roadsosx.domain.repository.ContactsRepository
import com.roadsosx.domain.repository.MapsRepository
import com.roadsosx.domain.repository.ProfileRepository
import com.roadsosx.domain.repository.ReportsRepository
import com.roadsosx.domain.repository.SOSRepository
import com.roadsosx.domain.repository.SettingsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindAuthRepository(
        authRepositoryImpl: AuthRepositoryImpl
    ): AuthRepository

    @Binds
    @Singleton
    abstract fun bindSOSRepository(
        sosRepositoryImpl: SOSRepositoryImpl
    ): SOSRepository

    @Binds
    @Singleton
    abstract fun bindContactsRepository(
        contactsRepositoryImpl: ContactsRepositoryImpl
    ): ContactsRepository

    @Binds
    @Singleton
    abstract fun bindReportsRepository(
        reportsRepositoryImpl: ReportsRepositoryImpl
    ): ReportsRepository

    @Binds
    @Singleton
    abstract fun bindMapsRepository(
        mapsRepositoryImpl: MapsRepositoryImpl
    ): MapsRepository

    @Binds
    @Singleton
    abstract fun bindProfileRepository(
        profileRepositoryImpl: ProfileRepositoryImpl
    ): ProfileRepository

    @Binds
    @Singleton
    abstract fun bindSettingsRepository(
        settingsRepositoryImpl: SettingsRepositoryImpl
    ): SettingsRepository
}
