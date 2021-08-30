package com.udemy.habits

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_card.view.*

class HabitsAdapter(val habits: List<Habit>) : RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>(){


    class HabitViewHolder(val card: View) : RecyclerView.ViewHolder(card)

    //Create a new ViewHolder - which means that this is for one item and one item in our case corresponds to one cardView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card, parent, false)
        return HabitViewHolder(view)
    }


    //Specifies the contents for the shown habit
    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
       if(holder != null){
           holder.card.tv_title.text = habits[position].title
           holder.card.tv_description.text = habits[position].description
           holder.card.ivIcon.setImageBitmap(habits[position].image) //setImageResource(habits[position].image)
       }
    }

    override fun getItemCount() = habits.size

}