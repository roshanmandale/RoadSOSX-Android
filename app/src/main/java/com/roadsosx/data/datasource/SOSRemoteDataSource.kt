package com.roadsosx.data.datasource

import io.github.jan.supabase.SupabaseClient
import io.ktor.client.HttpClient
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SOSRemoteDataSource @Inject constructor(
    private val supabaseClient: SupabaseClient,
    private val httpClient: HttpClient
) {
    suspend fun createSOSRequest(latitude: Double, longitude: Double, description: String?): String {
        return "fake-sos-id"
    }

    suspend fun getActiveSOSRequests(): List<String> {
        return emptyList()
    }
}
