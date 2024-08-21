package com.prabhakar.lokalassignment.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class V3(

    @SerialName("field_key") var fieldKey: String? = null,
    @SerialName("field_name") var fieldName: String? = null,
    @SerialName("field_value") var fieldValue: String? = null

)