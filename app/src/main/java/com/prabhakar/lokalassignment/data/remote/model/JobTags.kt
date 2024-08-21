package com.prabhakar.lokalassignment.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class JobTags(

    @SerialName("value") var value: String? = null,
    @SerialName("bg_color") var bgColor: String? = null,
    @SerialName("text_color") var textColor: String? = null

)