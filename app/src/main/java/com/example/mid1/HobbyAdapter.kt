package com.example.mid1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mid1.databinding.ItemHobbyBinding

class HobbyAdapter(
    private var hobbies: List<Hobby>,
    private val onItemClick: (Hobby) -> Unit
) : RecyclerView.Adapter<HobbyAdapter.HobbyViewHolder>() {

    inner class HobbyViewHolder(private val binding: ItemHobbyBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(hobby: Hobby) {
            binding.textViewTitle.text = hobby.title
            binding.imageView.setImageResource(hobby.imageRes)
            binding.root.setOnClickListener { onItemClick(hobby) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbyViewHolder {
        val binding = ItemHobbyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HobbyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HobbyViewHolder, position: Int) {
        holder.bind(hobbies[position])
    }

    override fun getItemCount(): Int = hobbies.size

    fun updateData(newHobbies: List<Hobby>) {
        hobbies = newHobbies
        notifyDataSetChanged()
    }
}
