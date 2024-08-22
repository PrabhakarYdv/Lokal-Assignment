package com.prabhakar.lokalassignment.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.prabhakar.lokalassignment.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val jobTitle = intent?.getStringExtra("title")
        val jobLocation = intent?.getStringExtra("location")
        val jobSalary = intent?.getStringExtra("salary")
        val jobContact = intent?.getStringExtra("contact")
        val jobType = intent?.getStringExtra("type")
        val jobCategory = intent?.getStringExtra("category")
        val jobExperience = intent?.getStringExtra("experience")

        binding.apply {
            title.text = jobTitle
            location.text = "Location: $jobLocation"
            salary.text = "Salary: $jobSalary"
            contact.text = "Contact: $jobContact"
            type.text = "Type: $jobType"
            category.text = "Category: $jobCategory"
            experience.text = "Experience: $jobExperience"
        }
    }
}