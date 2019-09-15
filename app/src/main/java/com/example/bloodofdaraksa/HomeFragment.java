package com.example.bloodofdaraksa;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {


    public static String  fragName ="";

    private Button buttonShowa;
    private Button buttonShowa2;

    private Button buttonShowb;
    private Button buttonShowb2;

    private Button buttonShowab;
    private Button buttonShowab2;

    private Button buttonShowo;
    private Button buttonShowo2;

    private Button buttonAddUser,buttonDelete,buttonUpdate;
    FloatingActionButton fab;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);


//        FloatingActionButton fab = view.findViewById(R.id.btn_fragment_add_user);


//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        // Inflate the layout for this fragment
        fab = view.findViewById(R.id.fab_btn_fragment_add_user);
        buttonShowa = view.findViewById(R.id.btn_fragment_showa);
        buttonShowa2 = view.findViewById(R.id.btn_fragment_show_a2);

        buttonShowb = view.findViewById(R.id.btn_fragment_show_b);
        buttonShowb2 = view.findViewById(R.id.btn_fragment_show_b2);
        buttonShowab = view.findViewById(R.id.btn_fragment_showab);
        buttonShowab2 = view.findViewById(R.id.btn_fragment_show_ab2);
        buttonShowo = view.findViewById(R.id.btn_fragment_show_o);
        buttonShowo2 = view.findViewById(R.id.btn_fragment_show_o2);



//        buttonDelete = view.findViewById(R.id.btn_fragment_delete);
//        buttonUpdate = view.findViewById(R.id.btn_fragment_update);

        buttonShowa.setOnClickListener(this);
        fab.setOnClickListener(this);
//        buttonDelete.setOnClickListener(this);
//        buttonUpdate.setOnClickListener(this);


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


        buttonShowb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new ShowFragment()).addToBackStack(null).commit();
                fragName = "B+";
            }
        });

        buttonShowb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new ShowFragment()).addToBackStack(null).commit();
                fragName = "B-";
            }
        });

        buttonShowab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new ShowFragment()).addToBackStack(null).commit();
                fragName = "AB+";
            }
        });

        buttonShowab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new ShowFragment()).addToBackStack(null).commit();
                fragName = "AB-";
            }
        });


        buttonShowo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new ShowFragment()).addToBackStack(null).commit();
                fragName = "O+";
            }
        });

        buttonShowo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new ShowFragment()).addToBackStack(null).commit();
                fragName = "O-";
            }
        });





        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fab_btn_fragment_add_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new AddFragment()).addToBackStack(null).commit();
                break;


            case R.id.btn_fragment_showa:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
                        ,new ShowFragment()).addToBackStack(null).commit();
                break;


//            case R.id.btn_fragment_delete:
//                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
//                        ,new DeleteFragment()).addToBackStack(null).commit();
//                break;
//
//            case R.id.btn_fragment_update:
//                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container
//                        ,new UpdateFragment()).addToBackStack(null).commit();
//                break;
        }
    }
}
