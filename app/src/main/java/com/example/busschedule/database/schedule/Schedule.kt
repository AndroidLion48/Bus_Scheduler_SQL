package com.example.busschedule.database.schedule

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Clarence E Moore on 2023-02-23.
 *
 * Description:
 */
@Entity
data class Schedule(
    @PrimaryKey val id: Int,
    @NonNull @ColumnInfo(name =  "stop_name") val stopName: String,
    @NonNull @ColumnInfo(name =  "arrival_time") val arrivalTime: Int
    )
