package com.mykotlinapplication.kotlin47

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.mykotlinapplication.kotlin47.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        ApiClient.getApiClient().getUsers().enqueue(object: retrofit2.Callback<List<User>> {
            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                Log.e(TAG, t.message)
            }

            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                Log.d(TAG, response.body().toString())
                val userListObj = UserList(response.body()!!)

//                binding.userList = userListObj
//                binding.executePendingBindings()
            }

        })
    }
}
