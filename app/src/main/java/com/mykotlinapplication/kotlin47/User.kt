package com.mykotlinapplication.kotlin47

import com.google.gson.annotations.SerializedName

class User (
    @SerializedName("name") var name: String,
    @SerializedName("email") var email: String
) {
    override fun toString(): String {
        return "User(name='$name', email='$email')\n"
    }
}