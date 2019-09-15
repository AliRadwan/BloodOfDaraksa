package com.example.bloodofdaraksa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by Ali Radwan on 9/15/2019.
 */
public class ShowDataAdapter extends RecyclerView.Adapter<ShowDataAdapter.UserViewHolder> {

    List<UserEntity> list;
    Context context;


    public ShowDataAdapter(List<UserEntity> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_item, parent, false);
        return new UserViewHolder(view);
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
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.textViewname.setText(list.get(position).getUserName());
        holder.textViewAddress.setText(list.get(position).getUserAddress());

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
            imageViewCall = itemView.findViewById(R.id.img_phone);


        }
    }

}
