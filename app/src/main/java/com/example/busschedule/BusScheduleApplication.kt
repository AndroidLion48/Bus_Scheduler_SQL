package com.example.busschedule

import android.app.Application
import com.example.busschedule.database.AppDatabase

/**
 * Created by Clarence E Moore on 2023-02-23.
 *
 * Description:
 *
 *
 */
class BusScheduleApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}
