package com.example.bloodofdaraksa;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * Created by Ali Radwan on 9/12/2019.
 */
@Database(entities = {UserEntity.class},version = 1,exportSchema = false)
public abstract class BloodDB extends RoomDatabase {

    public abstract MyDao myDao();
}
