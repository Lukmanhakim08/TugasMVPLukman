package com.example.tugasmvp.Presenter

import com.example.tugasmvp.Model.GetDataUserResponseItem
import com.example.tugasmvp.Network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserPresenter(val viewuser : UserInterface) {
    fun getDataUser(){
        ApiClient.instance.getDataUser()
            .enqueue(object : Callback<List<GetDataUserResponseItem>>{
                override fun onResponse(
                    call: Call<List<GetDataUserResponseItem>>,
                    response: Response<List<GetDataUserResponseItem>>
                ) {
                    if (response.isSuccessful){
                        viewuser.onSuccess(response.message(), response.body()!!)
                    }else{
                        viewuser.onError(response.message())
                    }
                }

                override fun onFailure(call: Call<List<GetDataUserResponseItem>>, t: Throwable) {
                    viewuser.onError(t.message!!)
                }

            })
    }
}