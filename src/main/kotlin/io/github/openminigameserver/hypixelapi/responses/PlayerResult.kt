package io.github.openminigameserver.hypixelapi.responses

import com.fasterxml.jackson.databind.JsonNode
import io.github.openminigameserver.hypixelapi.models.HypixelPlayer

data class RawPlayerResult(val success: Boolean, val player: JsonNode?)

data class PlayerResult(val success: Boolean, val player: HypixelPlayer?)