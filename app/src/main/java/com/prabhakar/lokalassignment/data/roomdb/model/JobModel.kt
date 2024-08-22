package com.prabhakar.lokalassignment.data.roomdb.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "bookmarkJobs")
data class JobModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "location") val location: String,
    @ColumnInfo(name = "salary") val salary: String,
    @ColumnInfo(name = "contact") val contact: String
)
