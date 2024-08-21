package com.prabhakar.lokalassignment.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Locations(

    @SerialName("id") var id: Int? = null,
    @SerialName("locale") var locale: String? = null,
    @SerialName("state") var state: Int? = null

)