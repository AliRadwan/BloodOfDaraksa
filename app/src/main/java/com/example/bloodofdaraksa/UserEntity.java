package com.example.bloodofdaraksa;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")
public class UserEntity {

    // Table Colume
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    private int userId;
    @ColumnInfo(name = "name")
    private String userName;
    @ColumnInfo(name = "blood_type")
    private String bloodType;
    // we make age Int because we want to make it the priority of people
    @ColumnInfo(name = "age")
    private String userAge;
    @ColumnInfo(name = "address")
    private String userAddress;
    @ColumnInfo(name = "phone")
    private String userPhone;

//    @Ignore
//    public UserEntity() {
//    }

//    @Ignore
//    public UserEntity(int userId, String userName, String bloodType, String  userAge, String userAddress, String userPhone) {
//        this.userId = userId;
//        this.userName = userName;
//        this.bloodType = bloodType;
//        this.userAge = userAge;
//        this.userAddress = userAddress;
//        this.userPhone = userPhone;
//    }

    public UserEntity(String userName, String bloodType, String  userAge, String userAddress, String userPhone) {
        this.userName = userName;
        this.bloodType = bloodType;
        this.userAge = userAge;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}


