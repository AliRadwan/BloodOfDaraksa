package com.example.bloodofdaraksa;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShowFragment extends Fragment {


    private TextView tvShow;

    RecyclerView recyclerView;
    ShowDataAdapter adapter;

    List<UserEntity> data;

    UserEntity userEntity;

    public ShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_show, container, false);

        recyclerView = view.findViewById(R.id.recycler_data);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
//        tvShow = view.findViewById(R.id.tv_show);


//        List<UserEntity> data = MainActivity.bloodDB.myDao().getUsers();

//        List<UserEntity> data = MainActivity.bloodDB.myDao().getUsersBlood("A");


        if (HomeFragment.fragName == "A+") {
            data = MainActivity.bloodDB.myDao().getUsersBlood("A+");
            adapter = new ShowDataAdapter(data, getContext());
            recyclerView.setAdapter(adapter);
        } else if (HomeFragment.fragName == "A-") {

            data = MainActivity.bloodDB.myDao().getUsersBlood("A-");
            adapter = new ShowDataAdapter(data, getContext());
            recyclerView.setAdapter(adapter);
        } else if (HomeFragment.fragName == "B+") {
            data = MainActivity.bloodDB.myDao().getUsersBlood("B+");
            adapter = new ShowDataAdapter(data, getContext());
            recyclerView.setAdapter(adapter);
        } else if (HomeFragment.fragName == "AB+") {

            data = MainActivity.bloodDB.myDao().getUsersBlood("AB+");
            adapter = new ShowDataAdapter(data, getContext());
            recyclerView.setAdapter(adapter);
        } else if (HomeFragment.fragName == "AB-") {

            data = MainActivity.bloodDB.myDao().getUsersBlood("AB-");
            adapter = new ShowDataAdapter(data, getContext());
            recyclerView.setAdapter(adapter);
        } else if (HomeFragment.fragName == "O+") {

            data = MainActivity.bloodDB.myDao().getUsersBlood("O+");
            adapter = new ShowDataAdapter(data, getContext());
            recyclerView.setAdapter(adapter);

        } else if (HomeFragment.fragName == "O-") {

            data = MainActivity.bloodDB.myDao().getUsersBlood("O-");
            adapter = new ShowDataAdapter(data, getContext());
            recyclerView.setAdapter(adapter);

        } else {

            data = MainActivity.bloodDB.myDao().getUsers();
            recyclerView.setAdapter(adapter);

        }

//        String  info = "";
//        for (UserEntity userEntity :data){
//
//            String name =userEntity.getUserName();
//            String address = userEntity.getUserAddress();
//            String blood = userEntity.getBloodType();
//
//            info = info + "\n\n"+name+"\n address " +address+"\n"+"Blood = "+blood;
//        }
//        tvShow.setText(info);
        return view;
    }

}
