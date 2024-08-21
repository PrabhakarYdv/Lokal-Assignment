package com.prabhakar.lokalassignment.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ContactPreference(

    @SerialName("preference") var preference: Int? = null,
    @SerialName("whatsapp_link") var whatsappLink: String? = null,
    @SerialName("preferred_call_start_time") var preferredCallStartTime: String? = null,
    @SerialName("preferred_call_end_time") var preferredCallEndTime: String? = null

)