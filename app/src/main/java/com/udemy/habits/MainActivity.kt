package com.udemy.habits

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        tv_description.text = getString(R.string.description) //this is done with the help of android plugin: 'kotlin-android-extensions'
//        //it is automatically creating member variables that we can access in our code without doing it by ourselves and clutter our code(no boiler plate code)
//        //this way it is way more concise and we don't have to use nulls or mutable variables
//        tv_title.text = getString(R.string.title)
//        ivIcon.setImageResource(R.drawable.water)

        rv.setHasFixedSize(true) //this tells the recyclerView that everytime a new cardView item is added its size is going to be constant
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = HabitsAdapter(getSampleHabits())

    }
}