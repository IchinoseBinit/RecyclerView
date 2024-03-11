package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvStudents);
        PersonAdapter adapter = new PersonAdapter(getPerson());
        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
//        manager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);



    }

    public ArrayList getPerson() {
        ArrayList persons = new ArrayList<PersonPojo>();
        persons.add(new PersonPojo("Binit", 25));
        persons.add(new PersonPojo("Binod", 26));
        persons.add(new PersonPojo("Manish", 25));
        persons.add(new PersonPojo("Rezone", 22));
        persons.add(new PersonPojo("Abhishek", 20));
        return persons;
    }
}