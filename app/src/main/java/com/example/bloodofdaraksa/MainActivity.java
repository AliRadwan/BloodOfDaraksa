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

        bloodDB = Room.databaseBuilder(getApplicationContext(),BloodDB.class,"userDB").allowMainThreadQueries().build();


        bloodDB.myDao().insert(new UserEntity("احمد عبد الهادى","A-","","حضانة الزهراء","1096160411"));

        bloodDB.myDao().insert(new UserEntity("محمد احمد صالح","A-","","الدراكسه","1007796554"));
        bloodDB.myDao().insert(new UserEntity("اسامة سامى عبد الرحيم","A-","","الدراكسه","1115133277"));
        bloodDB.myDao().insert(new UserEntity("ابراهيم على جاد","A-","","م.النصر","10013199771"));
        bloodDB.myDao().insert(new UserEntity("بالل منصور","A-","","م.النصر","1008851348"));
        bloodDB.myDao().insert(new UserEntity("احمد حمدى رافت","A-","","م.النصر","1065326680"));

        bloodDB.myDao().insert(new UserEntity("sddd","A-","","masn","56565666655666"));


        Log.e("users",bloodDB.myDao().getUsers().size()+"");
        if (findViewById(R.id.fragment_container) != null){
            if (savedInstanceState != null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container,new HomeFragment()).commit();
        }
    }
}
