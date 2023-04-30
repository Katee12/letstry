package com.example.letstry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.letstry.adapter.all_lessons_adapter;
import com.example.letstry.adapter.levels_adapter;

public class a1Lessons extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    String[] lessonsName = {"Alphabet", "Animals", "Family", "Clothes", "Colors", "Body parts", "Weather"};
    int[] lessonsImage = {R.drawable.alph, R.drawable.animal, R.drawable.family, R.drawable.clothes, R.drawable.colors,
    R.drawable.body, R.drawable.weather};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_lessons);

        recyclerView = findViewById(R.id.recyclerviewonpagea1);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        all_lessons_adapter all_lessons_adapter = new all_lessons_adapter (this, lessonsName, lessonsImage);
        recyclerView.setAdapter(all_lessons_adapter);
    }
}