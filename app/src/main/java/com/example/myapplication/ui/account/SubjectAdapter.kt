package com.example.myapplication.ui.account

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.data.model.Subject
import com.example.myapplication.databinding.ItemSubjectBinding

class SubjectAdapter : RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder>(){
    var listSubject = mutableListOf<Subject>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    var subjectListener : SubjectListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val inflate = LayoutInflater.from(parent.context)

        val binding = DataBindingUtil.inflate<ItemSubjectBinding>(
            inflate,
            R.layout.item_subject,
            parent,
            false
        )
        val holder = SubjectViewHolder(binding)

        holder.itemView.setOnClickListener {
            if (subjectListener != null){
                subjectListener?.onSubjectClick(listSubject[holder.bindingAdapterPosition])
            }
        }

        return holder
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        val item = listSubject[position]
        holder.bindData(item)
    }

    override fun getItemCount(): Int {
        return listSubject.size
    }

    class SubjectViewHolder(val binding : ItemSubjectBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(item : Subject) {
            Glide.with(itemView).load(item.subjectCoverImage).into(binding.ivSubject)
            binding.tvSubjectName.text = item.subjectName
        }
    }

    interface SubjectListener {
        fun onSubjectClick(item : Subject){

        }
    }
}