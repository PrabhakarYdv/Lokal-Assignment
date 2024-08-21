package com.prabhakar.lokalassignment.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.prabhakar.lokalassignment.data.remote.model.Results
import com.prabhakar.lokalassignment.databinding.JobLayoutBinding

class JobViewHolder(private val binding: JobLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    fun setData(model: Results) {
        binding.apply {
            jobTitle.text = "Job Title: ${model.title}"
            jobLocation.text = "Location: ${model.primaryDetails?.Place}"
            jobSalary.text = "Salary: ${model.primaryDetails?.Salary}"
            phone.text = "Contact: ${model.whatsappNo}"
        }
    }
}