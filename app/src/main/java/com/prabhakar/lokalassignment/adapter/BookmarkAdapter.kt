package com.prabhakar.lokalassignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prabhakar.lokalassignment.data.roomdb.model.JobModel
import com.prabhakar.lokalassignment.databinding.BookmarkLayoutBinding
import com.prabhakar.lokalassignment.viewholder.BookmarkViewHolder

class BookmarkAdapter(private val bookmarkList: List<JobModel>) :
    RecyclerView.Adapter<BookmarkViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookmarkViewHolder {
        val view = BookmarkLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BookmarkViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookmarkViewHolder, position: Int) {
        val model = bookmarkList[position]
        holder.setData(model)
    }

    override fun getItemCount(): Int {
        return bookmarkList.size
    }

}