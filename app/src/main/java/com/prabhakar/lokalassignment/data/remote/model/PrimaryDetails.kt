package com.prabhakar.lokalassignment.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class PrimaryDetails(

    @SerialName("Place") var Place: String? = null,
    @SerialName("Salary") var Salary: String? = null,
    @SerialName("Job_Type") var JobType: String? = null,
    @SerialName("Experience") var Experience: String? = null,
    @SerialName("Fees_Charged") var FeesCharged: String? = null,
    @SerialName("Qualification") var Qualification: String? = null

)