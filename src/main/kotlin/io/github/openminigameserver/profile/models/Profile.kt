package io.github.openminigameserver.profile.models

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*


data class Profile(
    val code: Int?,
    val uuid: UUID?,
    @JsonProperty("username") val name: String?,
    val textures: ProfileTextures?
) {
    val id: UUID?
        get() = uuid

    val isError: Boolean
        get() = code != null

    val uniqueId: UUID?
        get() = uuid
}