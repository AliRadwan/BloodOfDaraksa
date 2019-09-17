package com.example.bloodofdaraksa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static BloodDB bloodDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();

        bloodDB = Room.databaseBuilder(getApplicationContext(),BloodDB.class,"usersblood.db").allowMainThreadQueries().build();

        Log.e("users",bloodDB.myDao().getUsers().size()+"");
        if (findViewById(R.id.fragment_container) != null){
            if (savedInstanceState != null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container,new HomeFragment()).commit();
        }
    }
}
