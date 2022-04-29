package com.example.tugasmvp.Presenter

import com.example.tugasmvp.Model.GetDataUserResponseItem

interface UserInterface {
    fun onSuccess(pesan: String, user: List<GetDataUserResponseItem>)
    fun onError(pesan: String)
}