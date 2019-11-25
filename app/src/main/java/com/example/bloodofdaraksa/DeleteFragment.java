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
public class DeleteFragment extends Fragment {

    private EditText editTextId;
    private Button buttonDelete;

    public DeleteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete, container, false);
        editTextId = view.findViewById(R.id.edt_delete_user);
        buttonDelete = view.findViewById(R.id.btn_delete);
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = Integer.parseInt(editTextId.getText().toString());
//                UserEntity userEntity = new UserEntity();
//                userEntity.setUserId(id);
//                MainActivity.bloodDB.myDao().deleteUser(userEntity);

                Toast.makeText(getActivity(), "delete user", Toast.LENGTH_SHORT).show();
                editTextId.setText("");
            }
        });
    return view;
    }

}
