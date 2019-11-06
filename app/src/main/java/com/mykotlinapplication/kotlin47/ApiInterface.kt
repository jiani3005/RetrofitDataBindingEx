package com.mykotlinapplication.kotlin47

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("users")
    fun getUsers(): Call<List<User>>
}