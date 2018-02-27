package com.azenic.mvvmtest.ui.main.characters

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.azenic.mvvmtest.R
import com.azenic.mvvmtest.data.models.CharacterModel
import com.azenic.mvvmtest.ui.main.MainViewModel
import kotlinx.android.synthetic.main.fragment_character_details.*

/**
 * Created by Azenic on 10-Feb-18.
 */
class CharacterDetailsFragment: Fragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_character_details, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel()
    }

    private fun setupViewModel(){
        viewModel = ViewModelProviders.of(activity).get(MainViewModel::class.java)
        viewModel.getSelectedCharacter().observe(activity, Observer<CharacterModel> { character ->
           bindDataToViews(character!!)
        })
    }

    private fun bindDataToViews(character: CharacterModel){
        nameTextView.text = character.name
        heightTextView.text = character.height
        massTextView.text = character.mass
        genderTextView.text = character.hairColor
    }

}