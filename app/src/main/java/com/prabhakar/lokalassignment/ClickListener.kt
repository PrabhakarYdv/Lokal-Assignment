package com.prabhakar.lokalassignment

import com.prabhakar.lokalassignment.data.remote.model.Results

interface ClickListener {
    fun goToDetails(model: Results, position: Int)
    fun onClickBookmark(model: Results, position: Int)
}