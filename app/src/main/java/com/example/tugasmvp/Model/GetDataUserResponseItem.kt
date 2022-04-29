package com.example.tugasmvp.Model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GetDataUserResponseItem(
    @SerializedName("alamat")
    val alamat: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("namauser")
    val namauser: String,
    @SerializedName("tempat")
    val tempat: String,
    @SerializedName("umur")
    val umur: String
): Parcelable