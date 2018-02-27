package com.azenic.mvvmtest.data.models

import com.google.gson.annotations.SerializedName

/**
 * Created by Azenic on 10-Feb-18.
 */
data class CharacterModel(
        val name: String,
        val height: String,
        val mass: String,
        val hairColor: String,
        val skinColor: String,
        val eyeColor: String,
        val birthYear: String,
        val gender: String,
        @SerializedName("homeworld")
        val homeWorld: String
)