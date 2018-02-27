package com.azenic.mvvmtest.ui.main.characters

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.azenic.mvvmtest.R
import com.azenic.mvvmtest.data.models.CharacterModel
import com.azenic.mvvmtest.data.models.PeopleResponseModel
import com.azenic.mvvmtest.di.components.DaggerAdapterComponent
import com.azenic.mvvmtest.ui.main.MainViewModel
import kotlinx.android.synthetic.main.fragment_character_list.*
import javax.inject.Inject

/**
 * Created by Azenic on 10-Feb-18.
 */
class CharacterListFragment: Fragment(), CharacterListAdapter.OnCharacterClicked {

    private lateinit var viewModel: MainViewModel
    private lateinit var characterListAdapter: CharacterListAdapter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_character_list, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUi()
        setupViewModel()
    }

    private fun setupUi(){
        characterListAdapter = CharacterListAdapter(this)
        characterRecyclerView.layoutManager = LinearLayoutManager(activity)
        characterRecyclerView.adapter = characterListAdapter
    }

    private fun setupViewModel(){
        viewModel = ViewModelProviders.of(activity).get(MainViewModel::class.java)
        viewModel.getPeople().observe(activity, Observer<PeopleResponseModel> { people ->
            characterListAdapter.addNewData(people!!.results)
        })
    }

    override fun onCharacterClicked(character: CharacterModel) {
       viewModel.setSelectedCharacter(character)
        startCharacterDetailsFragment()
    }

    private fun startCharacterDetailsFragment(){
        fragmentManager.beginTransaction().replace(R.id.fragment_container, CharacterDetailsFragment()).commit()
    }
}