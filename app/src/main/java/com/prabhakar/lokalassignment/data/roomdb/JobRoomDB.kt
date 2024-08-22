package com.prabhakar.lokalassignment.data.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.prabhakar.lokalassignment.data.roomdb.model.JobModel

@Database(entities = [JobModel::class], version = 1)
abstract class JobRoomDB : RoomDatabase() {
    abstract fun getDAO(): JobDAO

    companion object {
        var instance: JobRoomDB? = null
//        fun getDBObject(context: Context): JobRoomDB {
//            if (instance != null) {
//                return instance!!
//            } else {
//                val builder = Room.databaseBuilder(
//                    context.applicationContext,
//                    JobRoomDB::class.java,
//                    "BookmarkJobsDB"
//                )
//                builder.fallbackToDestructiveMigration()
//                instance = builder.build()
//                return instance!!
//            }
//        }

        @Synchronized
        fun getInstance(ctx: Context): JobRoomDB {
            if(instance == null)
                instance = Room.databaseBuilder(ctx.applicationContext, JobRoomDB::class.java,
                    "BookmarkJobsDB")
                    .fallbackToDestructiveMigration()
                    .build()

            return instance!!

        }
    }
}