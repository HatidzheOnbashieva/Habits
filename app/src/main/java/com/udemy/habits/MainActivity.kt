package com.udemy.habits

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.udemy.habits.db.HabitDbTable
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

        Log.e("mainActivity", "onCreate()")
        rv.setHasFixedSize(true) //this tells the recyclerView that everytime a new cardView item is added its size is going to be constant
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = HabitsAdapter(HabitDbTable(this).readAllHabits())
    }

//    override fun onPause() {
//        super.onPause()
//        Log.e("mainActivity", "onPause()")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.e("mainActivity", "onStop()")
//    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        Log.e("mainActivity", "onCreateOptionsMenu")
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.add_habit) {
            switchTo(CreateHabitActivity::class.java)
        }
        return true
    }

    private fun switchTo(c: Class<*>) {
        val intent = Intent(this, c)
        startActivity(intent)
    }
}