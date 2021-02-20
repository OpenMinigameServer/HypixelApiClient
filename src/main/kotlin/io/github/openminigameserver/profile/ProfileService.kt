package io.github.openminigameserver.profile

import io.github.openminigameserver.profile.models.Profile
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.*

interface ProfileService {
    @GET("user/{id}")
    suspend fun findById(@Path("id") id: UUID?): Profile?

    @GET("user/{name}")
    suspend fun findById(@Path("name") name: String?): Profile?
}