package com.example.spotifyclone.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spotifyclone.R;
import com.example.spotifyclone.items.ItemMusic;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ItemWelcomeAdapter extends RecyclerView.Adapter<ItemWelcomeAdapter.ItemWelcomeViewHoler>{

    ArrayList<ItemMusic> musicList;

    @NonNull
    @Override
    public ItemWelcomeAdapter.ItemWelcomeViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_welcome, null, false);
        return new ItemWelcomeViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemWelcomeAdapter.ItemWelcomeViewHoler holder, int position) {
        Picasso.with(holder.context).load(musicList.get(position).getImage()).into(holder.image);
        holder.title.setText(musicList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    public class ItemWelcomeViewHoler extends RecyclerView.ViewHolder{
        Context context;
        TextView title;
        ImageView image;
        public ItemWelcomeViewHoler(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.item_welcome_title);
            image = itemView.findViewById(R.id.item_welcome_image);
            context = itemView.getContext();
        }
    }
}
