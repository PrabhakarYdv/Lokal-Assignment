package com.prabhakar.lokalassignment.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.prabhakar.lokalassignment.data.roomdb.model.JobModel
import com.prabhakar.lokalassignment.databinding.BookmarkLayoutBinding

class BookmarkViewHolder(private val binding: BookmarkLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun setData(model: JobModel) {
        binding.apply {
            jobTitle.text = model.title
            jobLocation.text = "Location: ${model.location}"
            jobSalary.text = "Salary: ${model.salary}"
            phone.text = "Contact: ${model.contact}"

        }
    }
}