package com.prabhakar.lokalassignment.data.roomdb

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.prabhakar.lokalassignment.data.roomdb.model.JobModel


@Dao
interface JobDAO {

    @Query("select * from bookmarkJobs")
    fun getAllBookmarkJobs(): LiveData<List<JobModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addToBookmarkJob(jobModel: JobModel)
}