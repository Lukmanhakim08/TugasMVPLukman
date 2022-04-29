package com.example.tugasmvp.Network

import com.example.tugasmvp.Model.GetDataUserResponseItem
import retrofit2.Call
import retrofit2.http.GET

interface EndPoin {
    @GET ("user")
    fun getDataUser(): Call<List<GetDataUserResponseItem>>
}