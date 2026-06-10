package com.roadsosx.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject
import com.roadsosx.domain.repository.SettingsRepository

class SettingsRepositoryImpl @Inject constructor() : SettingsRepository {

    override fun getDarkModeThemeEnabled(): Flow<Boolean> {
        return flowOf(false)
    }

    override suspend fun setDarkModeThemeEnabled(enabled: Boolean) {
        // Stub implementation
    }

    override fun getLanguagePreference(): Flow<String> {
        return flowOf("en")
    }

    override suspend fun setLanguagePreference(languageCode: String) {
        // Stub implementation
    }
}
