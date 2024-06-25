package com.example.displaytest_desafiogertec.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.displaytest_desafiogertec.R
import com.example.displaytest_desafiogertec.databinding.ItemTestBinding

class DisplayAdapter(
    private val item : MutableList<DisplayTestVO>,
    private val onItemClicked : (DisplayTestVO) -> Unit,
    private val dimension : Pair<Int, Int>
) : RecyclerView.Adapter<DisplayAdapter.ItemViewHolder>(){

    inner class ItemViewHolder(private val binding: ItemTestBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            itemClick: DisplayTestVO,
            onBookClicked: (DisplayTestVO) -> Unit
        ) {
            binding.root.setOnClickListener {
                itemClick.item = true
                binding.ivTest.setBackgroundResource(R.color.green)
                onBookClicked(itemClick)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = ItemTestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        view.ivTest.layoutParams = ViewGroup.LayoutParams(dimension.second, dimension.first)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val itemClick = item[position]
        holder.bind(itemClick, onItemClicked)
    }
}