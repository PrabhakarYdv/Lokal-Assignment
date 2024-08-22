package com.prabhakar.lokalassignment.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.prabhakar.lokalassignment.adapter.BookmarkAdapter
import com.prabhakar.lokalassignment.data.roomdb.JobDAO
import com.prabhakar.lokalassignment.data.roomdb.JobRoomDB
import com.prabhakar.lokalassignment.data.roomdb.model.JobModel
import com.prabhakar.lokalassignment.databinding.FragmentBookmarkBinding
import com.prabhakar.lokalassignment.repo.JobRepository
import com.prabhakar.lokalassignment.viewmodel.JobViewModel
import com.prabhakar.lokalassignment.viewmodel.JobViewModelFactory


class BookmarkFragment : Fragment() {
    private lateinit var binding: FragmentBookmarkBinding

    private lateinit var roomDB: JobRoomDB
    private lateinit var jobDAO: JobDAO
    private lateinit var repo: JobRepository
    private lateinit var viewModelFactory: JobViewModelFactory
    private lateinit var viewModel: JobViewModel

    private lateinit var adapter: BookmarkAdapter
    private var bookmarkJobList = listOf<JobModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBookmarkBinding.inflate(layoutInflater)

        roomDB = JobRoomDB.getInstance(requireActivity())
        jobDAO = roomDB.getDAO()
        repo = JobRepository(jobDAO)
        viewModelFactory = JobViewModelFactory(repo)
        viewModel = ViewModelProvider(this, viewModelFactory).get(JobViewModel::class.java)
        showData()

        return binding.root
    }

    private fun showData() {
        viewModel.getAllBookmarkJobs().observe(viewLifecycleOwner, Observer {
            it?.run {
                bookmarkJobList = this
                setRecyclerView()
            }
        })
    }

    private fun setRecyclerView() {
        adapter = BookmarkAdapter(bookmarkJobList)
        binding.bookmarkRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.bookmarkRecyclerView.adapter = adapter
    }
}