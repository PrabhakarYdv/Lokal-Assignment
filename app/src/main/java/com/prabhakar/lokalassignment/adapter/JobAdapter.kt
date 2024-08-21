package com.prabhakar.lokalassignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prabhakar.lokalassignment.ClickListener
import com.prabhakar.lokalassignment.data.remote.model.Results
import com.prabhakar.lokalassignment.databinding.JobLayoutBinding
import com.prabhakar.lokalassignment.viewholder.JobViewHolder

class JobAdapter(private val jobList: List<Results>, private val clickListener: ClickListener) :
    RecyclerView.Adapter<JobViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val view = JobLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return JobViewHolder(view, clickListener)
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val model = jobList[position]
        holder.setData(model)
    }

    override fun getItemCount(): Int {
        return jobList.size
    }

}