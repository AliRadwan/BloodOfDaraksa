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
public class AddFragment extends Fragment {

    private EditText userName,userAddress,bloodType;
    private Button buttonSave;

    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);
        userName = view.findViewById(R.id.edt_user_name);
        userAddress = view.findViewById(R.id.edt_user_address);
        bloodType = view.findViewById(R.id.edt_blood_type);
        buttonSave = view.findViewById(R.id.btn_add);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = userName.getText().toString();
                String address = userAddress.getText().toString();
                String blood = bloodType.getText().toString();


////                UserEntity userEntity = new UserEntity(userName.getText(),bloodType.getText(),);
//                userEntity.setUserName(name);
//                userEntity.setUserAddress(address);
//                userEntity.setBloodType(blood);
//
//                MainActivity.bloodDB.myDao().insert(userEntity);
                Toast.makeText(getActivity(), "Done", Toast.LENGTH_SHORT).show();

                userName.setText("");
                userAddress.setText("");
                bloodType.setText("");

            }
        });
        return view;
    }

}
