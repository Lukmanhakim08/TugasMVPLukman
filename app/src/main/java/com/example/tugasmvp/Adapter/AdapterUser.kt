package com.example.tugasmvp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tugasmvp.Model.GetDataUserResponseItem
import com.example.tugasmvp.R
import kotlinx.android.synthetic.main.item_user.view.*

class AdapterUser (private var datauser : List<GetDataUserResponseItem>): RecyclerView.Adapter<AdapterUser.ViewHolder>() {

    class ViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview)  {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val result = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return ViewHolder(result)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tvnama.text = datauser!![position].namauser
        holder.itemView.tvlahir.text = datauser!![position].tempat
        holder.itemView.tvalamat.text = datauser!![position].alamat

        Glide.with(holder.itemView.context)
            .load(datauser!![position].image)
            .into(holder.itemView.img_user)

//        holder.itemView.onclick_user.setOnClickListener {
//            onclick(datauser!![position])
//        }
    }

    override fun getItemCount(): Int {
        return datauser.size
    }
}