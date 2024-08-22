package com.prabhakar.lokalassignment

import com.prabhakar.lokalassignment.data.remote.model.Results
import com.prabhakar.lokalassignment.data.roomdb.model.JobModel

interface ClickListener {
    fun goToDetails(model: Results, position: Int)
    fun onClickBookmark(model: JobModel, position: Int)
}