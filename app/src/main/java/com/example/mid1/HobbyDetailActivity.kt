package com.example.mid1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mid1.databinding.ActivityHobbyDetailBinding

class HobbyDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHobbyDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHobbyDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hobbyTitle = intent.getStringExtra("HOBBY_TITLE")
        val hobbyImage = intent.getIntExtra("HOBBY_IMAGE", 0)

        binding.tvHobbyTitle.text = hobbyTitle
        binding.ivHobbyImage.setImageResource(hobbyImage)
    }
}
