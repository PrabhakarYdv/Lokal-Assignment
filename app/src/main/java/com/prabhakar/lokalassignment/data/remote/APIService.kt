package com.prabhakar.lokalassignment.data.remote

import com.prabhakar.lokalassignment.Utils
import com.prabhakar.lokalassignment.data.remote.model.Results
import retrofit2.http.GET

interface APIService {
    @GET(Utils.END_POINT)
    suspend fun getAllJobs():List<Results>
}