package com.android.mvisample.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.mvisample.R
import com.android.mvisample.data.model.User
import com.android.mvisample.databinding.ItemLayoutBinding
import com.bumptech.glide.Glide

class MainAdapter(
    val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = users.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind()
    }

    inner class ViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        lateinit var model: User
        fun onBind() {
            model = users[adapterPosition]
            binding.textViewUserName.text = model.name
            binding.textViewUserEmail.text = model.email
            Glide.with(binding.imageViewAvatar.context)
                .load(model.avatar)
                .into(binding.imageViewAvatar)
        }
    }
    fun addData(list: List<User>){
        users.addAll(list)
    }

}