package com.example.letstry.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.letstry.R;
import com.example.letstry.a1Lessons;
import com.example.letstry.flesh_a1;

public class all_lessons_adapter extends RecyclerView.Adapter<all_lessons_adapter.LessonsViewHolder>{

    Context context;
    String[] lessonsName;
    int[] lessonsImage;

    public all_lessons_adapter(Context context, String[] lessonsName, int[] lessonsImage) {
        this.context = context;
        this.lessonsName = lessonsName;
        this.lessonsImage = lessonsImage;
    }

    @NonNull
    @Override
    public all_lessons_adapter.LessonsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.design_for_lessons, parent, false);
        return new all_lessons_adapter.LessonsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull all_lessons_adapter.LessonsViewHolder holder, int position) {
        holder.lessonsName.setText(lessonsName[position]);
        holder.lessonsImage.setImageResource(lessonsImage[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (holder.getAdapterPosition()){
                    case 0:
                        Intent intent = new Intent(context, flesh_a1.class);
                        context.startActivity(intent);


                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return lessonsName.length;
    }

    public class LessonsViewHolder extends RecyclerView.ViewHolder {
        TextView lessonsName;
        ImageView lessonsImage;
        public LessonsViewHolder(@NonNull View itemView) {
            super(itemView);
            lessonsName = itemView.findViewById(R.id.lessonsName);
            lessonsImage = itemView.findViewById(R.id.lessonsImage);
        }
    }
}
