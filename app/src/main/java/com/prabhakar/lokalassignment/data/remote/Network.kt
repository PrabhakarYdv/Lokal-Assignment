package com.prabhakar.lokalassignment.data.remote

import com.prabhakar.lokalassignment.Utils
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Network {
    private fun retrofitInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(Utils.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun provideAPIService(): APIService {
        return retrofitInstance().create(APIService::class.java)
    }
}