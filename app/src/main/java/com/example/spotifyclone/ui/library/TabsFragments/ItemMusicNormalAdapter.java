package com.example.spotifyclone.ui.library.TabsFragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spotifyclone.CircleTransform;
import com.example.spotifyclone.ItemMusic;
import com.example.spotifyclone.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ItemMusicNormalAdapter extends RecyclerView.Adapter<ItemMusicNormalAdapter.ItemMusicNormalViewHolder> {

    ArrayList<ItemMusic> musicList;

    public ItemMusicNormalAdapter(ArrayList<ItemMusic> musicList) {
        this.musicList = musicList;
    }

    @NonNull
    @Override
    public ItemMusicNormalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music_normal, null, false);
        return new ItemMusicNormalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemMusicNormalViewHolder holder, int position) {
        Picasso.with(holder.context).load(musicList.get(position).getImage()).transform(new CircleTransform()).into(holder.image);
        holder.title.setText(musicList.get(position).getTitle());
        holder.description.setText(musicList.get(position).getDescription());
    }


    @Override
    public int getItemCount() {return musicList.size();
    }

    public class ItemMusicNormalViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        Context context;
        TextView title;
        TextView description;
        ImageView image;
        public ItemMusicNormalViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            title = itemView.findViewById(R.id.item_music_normal_title);
            description = itemView.findViewById(R.id.item_music_normal_description);
            image = itemView.findViewById(R.id.item_music_normal_image);
        }

        //events
        @Override
        public void onClick(View view) {

        }
    }
}
