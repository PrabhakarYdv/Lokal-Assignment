package com.prabhakar.lokalassignment.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ExampleJson2KtKotlin(

    @SerialName("results") var results: ArrayList<Results> = arrayListOf()

)