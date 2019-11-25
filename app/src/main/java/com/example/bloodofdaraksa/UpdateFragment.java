package com.example.bloodofdaraksa;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpdateFragment extends Fragment {


    private EditText editTextName;
    private EditText editTextAdddress;
    private EditText editTextBlood;
    private Button buttonUbdate;
    public UpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update, container, false);
        editTextName = view.findViewById(R.id.edt_user_name);
        editTextAdddress = view.findViewById(R.id.edt_user_address);
        editTextBlood = view.findViewById(R.id.edt_blood_type);
        buttonUbdate = view.findViewById(R.id.btn_update);

        buttonUbdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                String address = editTextAdddress.getText().toString();
                String blood = editTextBlood.getText().toString();

//                UserEntity userEntity = new UserEntity();
//                userEntity.setUserName(name);
//                userEntity.setUserAddress(address);
//                userEntity.setBloodType(blood);

//                MainActivity.bloodDB.myDao().updateUser(userEntity);
                Toast.makeText(getActivity(), "update", Toast.LENGTH_SHORT).show();

                editTextName.setText("");
                editTextAdddress.setText("");
                editTextBlood.setText("");
            }
        });

        return view;
    }

}
