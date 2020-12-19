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

public class ItemMusicBigAdapter extends RecyclerView.Adapter<ItemMusicBigAdapter.ItemMusicBigViewHolder>{
    ArrayList<ItemMusic> musicList;
    @NonNull
    @Override
    public ItemMusicBigViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music_big, null, false);
        return new ItemMusicBigViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemMusicBigViewHolder holder, int position) {
        Picasso.with(holder.context).load(musicList.get(position).getImage()).into(holder.image);
        holder.title.setText(musicList.get(position).getTitle());
        holder.description.setText(musicList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    public class ItemMusicBigViewHolder extends RecyclerView.ViewHolder {
        Context context;
        TextView title;
        TextView description;
        ImageView image;
        public ItemMusicBigViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            title = itemView.findViewById(R.id.item_music_big_title);
            description = itemView.findViewById(R.id.item_music_big_description);
            image = itemView.findViewById(R.id.item_music_big_image);
        }
    }
}
