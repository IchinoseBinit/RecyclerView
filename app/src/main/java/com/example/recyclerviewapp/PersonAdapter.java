package com.example.recyclerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    ArrayList<PersonPojo> persons;

    public PersonAdapter(ArrayList persons) {
        this.persons = persons;
    }


    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        PersonPojo person = persons.get(position);

        holder.txtViewName.setText(person.name);
        holder.txtViewAge.setText(person.age + " years");
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}
