package com.example.bloodofdaraksa;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * Created by Ali Radwan on 9/12/2019.
 */
@Dao
public interface BloodDao {

    @Insert
    public void insert(UserEntity user);

    @Query("select * from users")
    public List<UserEntity> getUsers();


    @Query("select * from users where blood_type like :bloodType")
    public List<UserEntity> getUsersBlood(String bloodType);



    @Delete
    public void deleteUser(UserEntity userEntity);

    @Update
    public void updateUser(UserEntity userEntity);




}
