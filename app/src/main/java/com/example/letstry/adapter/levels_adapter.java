package com.example.letstry.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.example.letstry.R;
import com.example.letstry.a1Lessons;

public class levels_adapter extends RecyclerView.Adapter<levels_adapter.LevelsViewHolder> {

    Context context;
    String[] levelsText;
    int[] levelsimg;
    int[] levelsColor;

    public levels_adapter(Context context, String[] levelsText, int[] levelimg, int[] levelsColor){
        this.context = context;
        this.levelsText = levelsText;
        this.levelsimg = levelimg;
        this.levelsColor = levelsColor;
    }

    @NonNull
    @Override
    public LevelsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.levels_design, parent, false);
        return new levels_adapter.LevelsViewHolder(view);

    } //какой будет дизайн

    @Override
    public void onBindViewHolder(@NonNull LevelsViewHolder holder, int position) {

        holder.levelName.setText(levelsText[position]);
        holder.levelImage.setImageResource(levelsimg[position]);
        holder.levelColor.setCardBackgroundColor(holder.itemView.getResources().getColor(levelsColor[position], null));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (holder.getAdapterPosition()){
                    case 0:
                        Intent intent = new Intent(context, a1Lessons.class);
                        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation((Activity) context,
                                new Pair<View, String>(holder.levelName, "animation1"));
                        context.startActivity(intent, options.toBundle());


                }
            }
        });
    }

    @Override
    public int getItemCount() {return levelsimg.length;}

    public static final class LevelsViewHolder extends ViewHolder {
        TextView levelName;
        ImageView levelImage;
        CardView levelColor;

        public LevelsViewHolder(@NonNull View itemView) {
            super(itemView);

            levelName = itemView.findViewById(R.id.textView_levels);
            levelImage = itemView.findViewById(R.id.imageView_levels);
            levelColor = itemView.findViewById(R.id.card_view_levels);

        }
    } //с какими элементами в дизайне идет работа

}
