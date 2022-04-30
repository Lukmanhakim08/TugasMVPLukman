package com.example.tugasmvp.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugasmvp.Adapter.AdapterStaf
import com.example.tugasmvp.Model.GetDataStafResponseItem
import com.example.tugasmvp.Presenter.StafInterface
import com.example.tugasmvp.Presenter.StafPresenter
import com.example.tugasmvp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), StafInterface {

    private lateinit var presentstaf : StafPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presentstaf = StafPresenter(this)
        presentstaf.getDataStaf()
    }

    override fun onSuccess(pesan: String, staf: List<GetDataStafResponseItem>) {
        rv_staf.layoutManager = LinearLayoutManager(this)
        rv_staf.adapter = AdapterStaf(staf)
    }

    override fun onError(pesan: String) {
        Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show()
    }
}