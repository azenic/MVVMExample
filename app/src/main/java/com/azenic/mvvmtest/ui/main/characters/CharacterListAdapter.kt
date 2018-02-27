package com.azenic.mvvmtest.ui.main.characters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.azenic.mvvmtest.R
import com.azenic.mvvmtest.R.id.characterNameTextView
import kotlinx.android.synthetic.main.item_character.view.*
import com.azenic.mvvmtest.data.models.CharacterModel

/**
 * Created by Azenic on 10-Feb-18.
 */
class CharacterListAdapter(val onCharacterClicked: OnCharacterClicked): RecyclerView.Adapter<CharacterListAdapter.CharacterItemViewHolder>() {

    private var data = ArrayList<CharacterModel>()

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int) =
            CharacterItemViewHolder(LayoutInflater.from(parent!!.context)
                    .inflate(R.layout.item_character, parent, false))
    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CharacterItemViewHolder?, position: Int)
            = holder!!.bindData(data[position], onCharacterClicked)

    fun addNewData(newData: ArrayList<CharacterModel>){
        this.data = newData
        notifyDataSetChanged()
    }

    class CharacterItemViewHolder(view: View): RecyclerView.ViewHolder(view){

        fun bindData(item: CharacterModel, callback: OnCharacterClicked) = with(itemView){
           characterNameTextView.text = item.name
            setOnClickListener{_ -> callback.onCharacterClicked(item)}
        }

    }

    interface OnCharacterClicked{

        fun onCharacterClicked(character: CharacterModel)
    }
}