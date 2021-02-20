package io.github.openminigameserver.hypixelapi

import io.github.openminigameserver.hypixelapi.responses.KeyResult
import io.github.openminigameserver.hypixelapi.responses.PlayerResult
import io.github.openminigameserver.hypixelapi.responses.RawPlayerResult
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface HypixelService {

    @GET("/player")
    suspend fun getPlayerById(@Query("uuid") id: UUID): PlayerResult

    @GET("/player")
    suspend fun getPlayerByIdRaw(@Query("uuid") id: UUID): RawPlayerResult

    @GET("/player")
    @Deprecated("This endpoint was deprecated by Hypixel.")
    suspend fun getPlayerByName(@Query("name") name: String): PlayerResult

    @GET("/key")
    suspend fun getKeyInformation(): KeyResult
}