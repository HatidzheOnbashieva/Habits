package com.udemy.habits.db

import android.provider.BaseColumns

val DATABASE_NAME = "habits.db"
val DATABASE_VERSION = 10


object HabitEntry: BaseColumns {
    val TABLE_NAME = "habit"
    val _ID = "id"
    val TITLE_COL = "title"
    val DESCR_COL = "description"
    val IMAGE_COL = "image"

}