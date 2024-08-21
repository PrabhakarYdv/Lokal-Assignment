package com.prabhakar.lokalassignment.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.prabhakar.lokalassignment.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)

        val bundle = arguments
        val jobTitle = bundle?.getString("title")
        val jobLocation = bundle?.getString("location")
        val jobSalary = bundle?.getString("salary")
        val jobContact = bundle?.getString("contact")
        val jobType = bundle?.getString("type")
        val jobCategory = bundle?.getString("category")
        val jobExperience = bundle?.getString("experience")

        binding.apply {
            title.text = jobTitle
            location.text = "Location: $jobLocation"
            salary.text = "Salary: $jobSalary"
            contact.text = "Contact: $jobContact"
            type.text = "Type: $jobType"
            category.text = "Category: $jobCategory"
            experience.text = "Experience: $jobExperience"
        }
        return binding.root

    }
}