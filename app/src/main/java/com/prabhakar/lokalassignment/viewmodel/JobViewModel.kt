package com.prabhakar.lokalassignment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.prabhakar.lokalassignment.data.remote.Resource
import com.prabhakar.lokalassignment.data.remote.model.Results
import com.prabhakar.lokalassignment.data.roomdb.JobDAO
import com.prabhakar.lokalassignment.data.roomdb.model.JobModel
import com.prabhakar.lokalassignment.repo.JobRepository
import kotlinx.coroutines.Dispatchers

class JobViewModel(private val repository: JobRepository) : ViewModel() {

    fun getAllJob(): LiveData<Resource<List<Results>>> {
        return liveData(Dispatchers.Main) {
            val data = repository.getDataFromServer()
            emit(data)
        }
    }

    fun getAllBookmarkJobs(): LiveData<List<JobModel>> {
        return repository.getAllBookMarkJobs()
    }

    fun addToBookmarkJob(model: JobModel){
        repository.addToBookmarkJob(model)
    }
}