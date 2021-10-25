package com.example.myapplication.ui.home

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.data.model.Major
import com.example.myapplication.databinding.ItemMajorBinding

class MajorAdapter : RecyclerView.Adapter<MajorAdapter.MajorViewHolder>() {

    private val TAG = "MajorAdapter"
    
    var listMajor = mutableListOf<Major>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    
    var majorListener: MajorListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MajorViewHolder {
        val inflate = LayoutInflater.from(parent.context)

        val binding = DataBindingUtil.inflate<ItemMajorBinding>(
            inflate,
            R.layout.item_major,
            parent,
            false
        )

        val holder = MajorViewHolder(binding)
        
        holder.itemView.setOnClickListener { 
            if (majorListener != null) {
                majorListener?.onMajorClick(listMajor[holder.bindingAdapterPosition])
            }
            Log.d(TAG, "onCreateViewHolder: ${listMajor[holder.bindingAdapterPosition]}")
        }

        return holder
    }

    override fun onBindViewHolder(holder: MajorViewHolder, position: Int) {
        val item = listMajor[position]
        holder.bindData(item)
    }

    override fun getItemCount(): Int {
        return listMajor.size
    }

    class MajorViewHolder(val binding: ItemMajorBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(item: Major){
            Glide.with(itemView).load(item.majorCoverImage).into(binding.ivMajor)
            binding.tvMajorName.text = item.majorName
        }
    }
    
    interface MajorListener {
        fun onMajorClick(item : Major){
            
        }
    }
}

