package com.example.tugasmvp.Presenter

import com.example.tugasmvp.Model.GetDataStafResponseItem
import com.example.tugasmvp.Model.GetDataUserResponseItem
import com.example.tugasmvp.Network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StafPresenter(val viewstaf : StafInterface) {
    fun getDataStaf(){
        ApiClient.instance.getDataStaf()
            .enqueue(object : Callback<List<GetDataStafResponseItem>>{
                override fun onResponse(
                    call: Call<List<GetDataStafResponseItem>>,
                    response: Response<List<GetDataStafResponseItem>>
                ) {
                    if (response.isSuccessful){
                        viewstaf.onSuccess(response.message(), response.body()!!)
                    }else{
                        viewstaf.onError(response.message())
                    }
                }

                override fun onFailure(call: Call<List<GetDataStafResponseItem>>, t: Throwable) {
                    viewstaf.onError(t.message!!)
                }

            })

    }
}