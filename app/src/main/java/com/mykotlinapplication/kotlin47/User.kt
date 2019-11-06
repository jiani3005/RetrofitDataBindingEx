package com.mykotlinapplication.kotlin47

import com.google.gson.annotations.SerializedName

data class User (
    @SerializedName("name") var name: String,
    @SerializedName("email") var email: String
)