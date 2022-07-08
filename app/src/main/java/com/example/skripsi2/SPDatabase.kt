package com.example.skripsi2

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.skripsi2.Data.Basisdata.*

@Database(
    entities = [
        Gejala::class,
        Penyakit::class],
    version = 1,
    exportSchema = false
)
abstract class SPDatabase : RoomDatabase() {

    companion object {
        @Volatile
        private var INSTANCE: SPDatabase? = null

        fun getDatabase(context: Context): SPDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SPDatabase::class.java, "SPDatabase"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}