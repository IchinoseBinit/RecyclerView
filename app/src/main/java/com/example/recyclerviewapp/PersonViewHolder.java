package com.example.recyclerviewapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class PersonViewHolder extends RecyclerView.ViewHolder {

    TextView txtViewName;
    TextView txtViewAge;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        txtViewName = itemView.findViewById(R.id.textViewName);
        txtViewAge = itemView.findViewById(R.id.textViewAge);
    }
}
