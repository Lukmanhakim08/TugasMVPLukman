package com.example.tugasmvp.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugasmvp.Adapter.AdapterUser
import com.example.tugasmvp.Model.GetDataUserResponseItem
import com.example.tugasmvp.Presenter.UserInterface
import com.example.tugasmvp.Presenter.UserPresenter
import com.example.tugasmvp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), UserInterface {

    private lateinit var presentuser : UserPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presentuser = UserPresenter(this)
        presentuser.getDataUser()
    }

    override fun onSuccess(pesan: String, user: List<GetDataUserResponseItem>) {
        rv_user.layoutManager = LinearLayoutManager(this)
        rv_user.adapter = AdapterUser(user)
    }


    override fun onError(pesan: String) {
        Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show()
    }
}