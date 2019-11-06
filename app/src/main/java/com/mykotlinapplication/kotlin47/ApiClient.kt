package com.mykotlinapplication.kotlin47

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private val BASE_URL = "https://jsonplaceholder.typicode.com/"

    fun getApiClient(): ApiInterface {
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL).build().create(ApiInterface::class.java)
    }
}