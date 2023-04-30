package com.example.letstry;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.letstry.adapter.levels_adapter;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter lessonsAdapter;
    RecyclerView.LayoutManager layoutManager;

    String[] levelsText = {"Beginner", "Elementary", "Pre-Intermediate", "Intermediate", "Upper-Intermediate", "Advanced"};
    int[] levelsimg = {R.drawable.a1, R.drawable.a2, R.drawable.b1, R.drawable.b2, R.drawable.c1, R.drawable.c2};
    int[] levelsColor = {R.color.a1, R.color.a2, R.color.b1, R.color.b2, R.color.c1, R.color.c2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.lessons_recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        levels_adapter levels_adapter = new levels_adapter(this, levelsText, levelsimg, levelsColor);
        recyclerView.setAdapter(levels_adapter);

    }

}