package com.example.rapt3

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Clients::class], version = 1)
abstract class DataBase : RoomDatabase() {

    abstract fun getDao(): com.example.rapt3.Dao

    companion object{
        fun getDB(context: Context): DataBase{
            return Room.databaseBuilder(
                context.applicationContext,
                DataBase::class.java,
                "clients.db"
            ).build()
        }
    }
}