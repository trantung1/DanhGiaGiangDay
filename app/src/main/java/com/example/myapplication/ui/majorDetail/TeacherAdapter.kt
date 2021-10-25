package com.example.myapplication.ui.majorDetail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.data.model.Teacher
import com.example.myapplication.databinding.ItemTeacherBinding

class TeacherAdapter : RecyclerView.Adapter<TeacherAdapter.TeacherViewHolder>() {

    var listTeacher = mutableListOf<Teacher>()
    set(value) {
        field = value
        notifyDataSetChanged()
    }
    var teacherListener : TeacherListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val inflate = LayoutInflater.from(parent.context)

        val binding = DataBindingUtil.inflate<ItemTeacherBinding>(
            inflate,
            R.layout.item_teacher,
            parent,
            false
        )
        val holder = TeacherViewHolder(binding)

        holder.itemView.setOnClickListener {
            if(teacherListener != null) {
                teacherListener?.onTeacherClick(listTeacher[holder.bindingAdapterPosition])
            }
        }

        return holder
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        val item = listTeacher[position]
        holder.bindData(item)
    }

    override fun getItemCount(): Int {
        return listTeacher.size
    }

    class TeacherViewHolder(val binding : ItemTeacherBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(item : Teacher) {
            Glide.with(itemView).load(item.teacherImage).into(binding.ivTeacher)
            binding.tvTeacherName.text = item.teacherName
        }
    }

    interface TeacherListener {
        fun onTeacherClick(item : Teacher){

        }
    }
}