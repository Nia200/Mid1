package com.example.mid1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import android.widget.TextView
import android.graphics.Typeface
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gymCard = findViewById<CardView>(R.id.cardGym)
        val booksCard = findViewById<CardView>(R.id.cardBooks)
        val codingCard = findViewById<CardView>(R.id.cardCoding)
        val titleText = findViewById<TextView>(R.id.tvTitle)

        titleText.typeface = Typeface.DEFAULT_BOLD
        titleText.textSize = 26f

        gymCard.setOnClickListener {
            openHobbyDetail("Зал", "Я люблю тренироваться в зале, заниматься силовыми упражнениями и поддерживать здоровье.", R.drawable.gym)
        }

        booksCard.setOnClickListener {
            openHobbyDetail("Чтение", "Чтение книг помогает мне развиваться, погружаться в новые миры и учиться новому.", R.drawable.books)
        }

        codingCard.setOnClickListener {
            openHobbyDetail("Программирование", "Я увлекаюсь написанием кода, созданием приложений и изучением новых технологий.", R.drawable.coding)
        }
    }

    private fun openHobbyDetail(title: String, description: String, imageRes: Int) {
        val intent = Intent(this, HobbyDetailActivity::class.java).apply {
            putExtra("HOBBY_TITLE", title)
            putExtra("HOBBY_DESC", description)
            putExtra("HOBBY_IMAGE", imageRes)
        }
        startActivity(intent)
    }

}
