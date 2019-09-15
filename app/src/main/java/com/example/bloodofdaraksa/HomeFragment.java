package com.example.bloodofdaraksa;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {


    public static String  fragName ="";


    private Button buttonAddUser,buttonShowa,buttonShowa2,buttonDelete,buttonUpdate;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        buttonAddUser = view.findViewById(R.id.btn_fragment_add_user);
        buttonShowa = view.findViewById(R.id.btn_fragment_showa);
        buttonShowa2 = view.findViewById(R.id.btn_fragment_show_a2);

        buttonDelete = view.findViewById(R.id.btn_fragment_delete);
        buttonUpdate = view.findViewById(R.id.btn_fragment_update);

        buttonShowa.setOnClickListener(this);
        buttonAddUser.setOnClickListener(this);
        buttonDelete.setOnClickListener(this);
        buttonUpdate.setOnClickListener(this);


        buttonShowa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new ShowFragment()).addToBackStack(null).commit();

                fragName = "A+";
            }
        });

        buttonShowa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new ShowFragment()).addToBackStack(null).commit();

                fragName = "A-";
            }
        });





        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_fragment_add_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new AddFragment()).addToBackStack(null).commit();
                break;


            case R.id.btn_fragment_showa:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new ShowFragment()).addToBackStack(null).commit();
                break;


            case R.id.btn_fragment_delete:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new DeleteFragment()).addToBackStack(null).commit();
                break;

            case R.id.btn_fragment_update:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new UpdateFragment()).addToBackStack(null).commit();
                break;
        }
    }
}
