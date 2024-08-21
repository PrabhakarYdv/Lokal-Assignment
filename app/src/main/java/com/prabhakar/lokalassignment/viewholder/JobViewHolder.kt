package com.prabhakar.lokalassignment.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.prabhakar.lokalassignment.data.remote.model.Results
import com.prabhakar.lokalassignment.databinding.JobLayoutBinding

class JobViewHolder(private val binding: JobLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    fun setData(model: Results) {
        binding.apply {
            jobTitle.text = model.title
            jobLocation.text = model.primaryDetails?.Place
            jobSalary.text = model.primaryDetails?.Salary
            phone.text = model.customLink
        }
    }
}