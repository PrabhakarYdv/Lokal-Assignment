package com.prabhakar.lokalassignment.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ContentV3(

    @SerialName("V3") var V3: ArrayList<V3> = arrayListOf()

)