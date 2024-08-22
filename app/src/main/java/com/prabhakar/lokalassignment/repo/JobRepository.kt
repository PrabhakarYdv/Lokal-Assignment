package com.prabhakar.lokalassignment.repo

import androidx.lifecycle.LiveData
import com.prabhakar.lokalassignment.data.remote.Network
import com.prabhakar.lokalassignment.data.remote.Resource
import com.prabhakar.lokalassignment.data.remote.ResponseHandler
import com.prabhakar.lokalassignment.data.remote.model.Results
import com.prabhakar.lokalassignment.data.roomdb.JobDAO
import com.prabhakar.lokalassignment.data.roomdb.model.JobModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class JobRepository(private val dao: JobDAO) {
    private val apiService = Network.provideAPIService()
    private val responseHandler = ResponseHandler()

    suspend fun getDataFromServer(): Resource<List<Results>> {
        val data = apiService.getAllJobs().results
        return try {
            responseHandler.handleSuccess(data)
        } catch (e: Exception) {
            responseHandler.handleException(e)
        }

    }

    fun getAllBookMarkJobs(): LiveData<List<JobModel>> {
        return dao.getAllBookmarkJobs()
    }

    fun addToBookmarkJob(jobModel: JobModel) {
        CoroutineScope(Dispatchers.IO).launch {
            dao.addToBookmarkJob(jobModel)
        }
    }
}