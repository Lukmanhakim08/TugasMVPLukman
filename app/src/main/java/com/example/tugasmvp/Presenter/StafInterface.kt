package com.example.tugasmvp.Presenter

import com.example.tugasmvp.Model.GetDataStafResponseItem

interface StafInterface {
    fun onSuccess(pesan: String, staf: List<GetDataStafResponseItem>)
    fun onError(pesan: String)
}