package io.github.openminigameserver.hypixelapi.responses

import io.github.openminigameserver.hypixelapi.models.HypixelKeyRecord

data class KeyResult(val success: Boolean, val record: HypixelKeyRecord? = null)