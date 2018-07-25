package com.example.abdurahman.ecommerseapp;

/**
 * Created by abdurahman on 16/07/2018.
 */

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
@Database(entities = {Business.class},version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract BusinessDao businessDao();
}
