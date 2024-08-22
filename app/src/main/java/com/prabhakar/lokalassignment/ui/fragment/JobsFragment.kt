package com.prabhakar.lokalassignment.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.prabhakar.lokalassignment.ClickListener
import com.prabhakar.lokalassignment.Utils
import com.prabhakar.lokalassignment.adapter.JobAdapter
import com.prabhakar.lokalassignment.data.remote.Status
import com.prabhakar.lokalassignment.data.remote.model.Results
import com.prabhakar.lokalassignment.databinding.FragmentJobsBinding
import com.prabhakar.lokalassignment.ui.activity.DetailsActivity
import com.prabhakar.lokalassignment.viewmodel.JobViewModel


class JobsFragment : Fragment(), ClickListener {

    private lateinit var binding: FragmentJobsBinding
    private val viewModel: JobViewModel by viewModels()
    private lateinit var adapter: JobAdapter
    private var jobList = listOf<Results>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentJobsBinding.inflate(layoutInflater)


//        viewModel = ViewModelProvider(this).get(JobViewModel::class.java)
        showData()
        return binding.root
    }

    private fun showData() {
        viewModel.getAllJob().observe(viewLifecycleOwner, Observer {
            it?.run {
                when (this.status) {
                    Status.ERROR -> {
                        Utils.showToast(requireContext(), "Something error")
                    }

                    Status.SUCCESS -> {
                        jobList = this?.data!!
                        setRecyclerView()
                    }

                    Status.LOADING -> {
                        Utils.showToast(requireContext(), "Loading Jobs")
                    }
                }
            }
        })
    }

    private fun setRecyclerView() {
        adapter = JobAdapter(jobList, this)
        binding.jobRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.jobRecyclerView.adapter = adapter
    }

    override fun goToDetails(model: Results, position: Int) {
//        Utils.showToast(requireContext(),"Clicked at $position")
        val intent = Intent(requireContext(), DetailsActivity::class.java)
        intent.putExtra("title", model.title)
        intent.putExtra("location", model.primaryDetails?.Place)
        intent.putExtra("salary", model.primaryDetails?.Salary)
        intent.putExtra("contact", model.whatsappNo)
        intent.putExtra("experience", model.primaryDetails?.Experience)
        intent.putExtra("type", model.jobHours)
        intent.putExtra("category", model.jobCategory)
        startActivity(intent)
    }


    override fun onClickBookmark(model: Results, position: Int) {
        Utils.showToast(requireContext(), "Bookmark job $position")
    }
}