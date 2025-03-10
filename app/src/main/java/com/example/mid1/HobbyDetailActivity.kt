package com.example.mid1

import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HobbyDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby_detail)

        val hobbyTitle = intent.getStringExtra("HOBBY_TITLE")
        val hobbyDesc = intent.getStringExtra("HOBBY_DESC")
        val hobbyImage = intent.getIntExtra("HOBBY_IMAGE", 0)

        findViewById<TextView>(R.id.tvHobbyTitle).apply {
            text = hobbyTitle
            textSize = 28f
            typeface = Typeface.DEFAULT_BOLD
        }
        findViewById<TextView>(R.id.tvHobbyDesc).apply {
            text = hobbyDesc
            textSize = 18f
        }
        findViewById<ImageView>(R.id.ivHobbyImage).setImageResource(hobbyImage)
        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
