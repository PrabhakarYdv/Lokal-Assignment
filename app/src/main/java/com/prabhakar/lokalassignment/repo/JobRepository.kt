package com.prabhakar.lokalassignment.repo

import com.prabhakar.lokalassignment.data.Network
import com.prabhakar.lokalassignment.data.remote.Resource
import com.prabhakar.lokalassignment.data.remote.ResponseHandler
import com.prabhakar.lokalassignment.data.remote.model.Results

class JobRepository {
    private val apiService = Network.provideAPIService()
    private val responseHandler = ResponseHandler()

    suspend fun getDataFromServer(): Resource<List<Results>> {
        val data = apiService.getAllJobs()
        return try {
            responseHandler.handleSuccess(data)
        } catch (e: Exception) {
            responseHandler.handleException(e)
        }

    }
}