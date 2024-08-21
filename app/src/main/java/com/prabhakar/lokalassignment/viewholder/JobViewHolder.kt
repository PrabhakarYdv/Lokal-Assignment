package com.prabhakar.lokalassignment.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.prabhakar.lokalassignment.ClickListener
import com.prabhakar.lokalassignment.data.remote.model.Results
import com.prabhakar.lokalassignment.databinding.JobLayoutBinding

class JobViewHolder(
    private val binding: JobLayoutBinding,
    private val clickListener: ClickListener
) : RecyclerView.ViewHolder(binding.root) {

    fun setData(model: Results) {
        binding.apply {
            jobTitle.text = model.title
            jobLocation.text = "Location: ${model.primaryDetails?.Place}"
            jobSalary.text = "Salary: ${model.primaryDetails?.Salary}"
            phone.text = "Contact: ${model.whatsappNo}"

            job.setOnClickListener {
                clickListener.goToDetails(model,adapterPosition)
            }
            bookmark.setOnClickListener{
                clickListener.onClickBookmark(model, adapterPosition)
            }
        }
    }
}