package com.example.imagerecycle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.menu_list_item.view.*

class MenuAdapter : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    val items = arrayListOf<Menu>(
        Menu(R.drawable.eggrice),
        Menu(R.drawable.spicysoup)
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MenuViewHolder((parent))

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MenuAdapter.MenuViewHolder, position: Int) {
        holder.menuImg.setImageResource(items.get(position).image)
    }

    inner class MenuViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder
        (LayoutInflater.from(parent.context).inflate(R.layout.menu_list_item, parent,false)){

        val menuImg = itemView.img_menu
    }


}