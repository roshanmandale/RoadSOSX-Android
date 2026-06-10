package com.roadsosx.domain.repository

import kotlinx.coroutines.flow.Flow

interface SettingsRepository {
    fun getDarkModeThemeEnabled(): Flow<Boolean>
    suspend fun setDarkModeThemeEnabled(enabled: Boolean)
    fun getLanguagePreference(): Flow<String>
    suspend fun setLanguagePreference(languageCode: String)
}
