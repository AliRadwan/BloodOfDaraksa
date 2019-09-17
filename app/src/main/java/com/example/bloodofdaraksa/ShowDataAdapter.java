package com.example.bloodofdaraksa;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by Ali Radwan on 9/15/2019.
 */
public class ShowDataAdapter extends RecyclerView.Adapter<ShowDataAdapter.UserViewHolder> {

    List<UserEntity> list;
    Context context;
    Dialog myDialog;


    public ShowDataAdapter(List<UserEntity> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_item, parent, false);
       final UserViewHolder dataview = new UserViewHolder(view);

        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.call_dialog_info);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        return dataview;



    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, final int position) {
        holder.textViewname.setText(list.get(position).getUserName());
        holder.textViewAddress.setText(list.get(position).getUserAddress());

        holder.imageViewCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView dialog_name_tv = myDialog.findViewById(R.id.dialog_name_id);
                TextView dialog_phone_tv =  myDialog.findViewById(R.id.dialog_phone_id);
                ImageView dialog_contact_img = myDialog.findViewById(R.id.dialog_img);

                dialog_name_tv.setText(list.get(position).getUserName());
                dialog_phone_tv.setText(list.get(position).getUserPhone());
                dialog_contact_img.setImageResource(R.drawable.profile);


//                final int phone = list.get(position).getUserPhone();


                Button buttonCall = myDialog.findViewById(R.id.dialog_btn_call);
                buttonCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" +list.get(position).getUserPhone()));
                        context.startActivity(callIntent);
                    }
                });

                Button buttonMessage = myDialog.findViewById(R.id.dialog_btn_msg);
                buttonMessage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent messageIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("sms:" +list.get(position).getUserPhone()));
                        messageIntent.putExtra("sms_body","help me");
                        context.startActivity(messageIntent);
                    }
                });



                myDialog.show();

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewname;
        private TextView textViewAddress;
        private ImageView imageViewCall;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewname = itemView.findViewById(R.id.tv_name);
            textViewAddress = itemView.findViewById(R.id.tv_address);
            imageViewCall = itemView.findViewById(R.id.img_pshow_item);


        }
    }

}
