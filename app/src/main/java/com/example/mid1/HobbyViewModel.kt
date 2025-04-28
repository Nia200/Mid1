package com.example.mid1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HobbyViewModel : ViewModel() {

    private val _hobbies = MutableLiveData<List<Hobby>>()
    val hobbies: LiveData<List<Hobby>> = _hobbies

    init {
        loadHobbies()
    }

    private fun loadHobbies() {
        _hobbies.value = listOf(
            Hobby("Зал", R.drawable.gym),
            Hobby("Чтение", R.drawable.books),
            Hobby("Программирование", R.drawable.coding)
        )
    }
}
