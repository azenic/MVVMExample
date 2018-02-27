package com.azenic.mvvmtest.data.models

/**
 * Created by Azenic on 10-Feb-18.
 */
data class PeopleResponseModel(
        val count: Int,
        val next: String,
        val previous: String,
        val results: ArrayList<CharacterModel>
        )