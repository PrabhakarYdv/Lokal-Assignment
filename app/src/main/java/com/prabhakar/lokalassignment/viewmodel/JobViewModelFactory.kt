package com.prabhakar.lokalassignment.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.prabhakar.lokalassignment.repo.JobRepository

class JobViewModelFactory(private val repository: JobRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return JobViewModel(repository) as T
    }
}