package com.example.korea_api

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.korea_api.databinding.ItemCenterBinding

class CenterAdapter: ListAdapter<Row, CenterAdapter.CenterViewHolder>(CenterCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CenterViewHolder {
        val binding = ItemCenterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CenterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CenterViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class CenterViewHolder(private val binding: ItemCenterBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item:Row) {
            with(binding) {
                binding.instNm.text = item.iNSTNM
                binding.jurisdNm.text = item.jURISDNM
                binding.oprCont.text = item.oPRCONT
                binding.satOprCont.text = item.sATOPRCONT
                binding.holdyOprChnt.text = item.hOLDYOPRCONT
                binding.phone.text = item.tELNO
                binding.rm.text = item.rM
            }
        }
    }
    companion object {
        private val CenterCallback = object : DiffUtil.ItemCallback<Row>() {
            override fun areContentsTheSame(oldItem: Row, newItem: Row): Boolean {
                return oldItem.hashCode() == newItem.hashCode()
            }

            override fun areItemsTheSame(oldItem: Row, newItem: Row): Boolean {
                return oldItem == newItem
            }
        }
    }


}