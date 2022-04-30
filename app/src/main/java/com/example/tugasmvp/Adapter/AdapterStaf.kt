package com.example.tugasmvp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tugasmvp.Model.GetDataStafResponseItem
import com.example.tugasmvp.R
import kotlinx.android.synthetic.main.item_staf.view.*
import kotlinx.android.synthetic.main.item_user.view.img_user

class AdapterStaf (private var datastaf : List<GetDataStafResponseItem>): RecyclerView.Adapter<AdapterStaf.ViewHolder>() {

    class ViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview)  {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val result = LayoutInflater.from(parent.context).inflate(R.layout.item_staf, parent, false)
        return ViewHolder(result)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tvnamastaf.text = datastaf!![position].name
        holder.itemView.tvemail.text = datastaf!![position].email
        holder.itemView.tvtglstaf.text = datastaf!![position].createdAt

        Glide.with(holder.itemView.context)
            .load(datastaf!![position].image)
            .into(holder.itemView.img_user)

//        holder.itemView.onclick_user.setOnClickListener {
//            onclick(datauser!![position])
//        }
    }

    override fun getItemCount(): Int {
        return datastaf.size
    }
}