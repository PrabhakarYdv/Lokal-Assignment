package com.prabhakar.lokalassignment.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Creatives(

    @SerialName("file") var file: String? = null,
    @SerialName("thumb_url") var thumbUrl: String? = null,
    @SerialName("creative_type") var creativeType: Int? = null

)