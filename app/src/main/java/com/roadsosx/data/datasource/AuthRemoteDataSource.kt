package com.roadsosx.data.datasource

import io.github.jan.supabase.SupabaseClient
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRemoteDataSource @Inject constructor(
    private val supabaseClient: SupabaseClient
) {
    suspend fun loginWithEmail(email: String, password: String): String {
        return "fake-jwt-token"
    }

    suspend fun registerWithEmail(name: String, email: String, password: String): String {
        return "fake-user-id"
    }

    suspend fun logout() {
    }
}
