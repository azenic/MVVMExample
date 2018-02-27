package com.azenic.mvvmtest.ui.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.azenic.mvvmtest.data.models.CharacterModel
import com.azenic.mvvmtest.data.models.PeopleResponseModel
import com.azenic.mvvmtest.data.repository.PeopleRepository
import javax.inject.Inject

/**
 * Created by Azenic on 10-Feb-18.
 */
class MainViewModel @Inject constructor(peopleRepository: PeopleRepository) : ViewModel(){

    private var people = MutableLiveData<PeopleResponseModel>()
    private val selectedCharacter = MutableLiveData<CharacterModel>()

    init {
        people = peopleRepository.getPeople()
        Log.d("test", "testttt")
    }


    fun getPeople() : LiveData<PeopleResponseModel>{
        return people
    }

    fun setSelectedCharacter(selectedCharacter: CharacterModel){
        this.selectedCharacter.value = selectedCharacter
    }

    fun getSelectedCharacter(): LiveData<CharacterModel> = selectedCharacter
}