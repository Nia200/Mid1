package com.example.mid1

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mid1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: HobbyAdapter
    private val viewModel: HobbyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = HobbyAdapter(emptyList()) { hobby: Hobby ->
            openHobbyDetail(hobby.title, hobby.imageRes)
        }

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        viewModel.hobbies.observe(this) { hobbies: List<Hobby> ->
            adapter.updateData(hobbies)
        }
    }

    private fun openHobbyDetail(title: String, imageRes: Int) {
        val intent = Intent(this, HobbyDetailActivity::class.java).apply {
            putExtra("HOBBY_TITLE", title)
            putExtra("HOBBY_IMAGE", imageRes)
        }
        startActivity(intent)
    }
}
