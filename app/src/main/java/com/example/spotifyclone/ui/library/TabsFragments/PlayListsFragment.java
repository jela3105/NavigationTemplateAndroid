package com.example.spotifyclone.ui.library.TabsFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.spotifyclone.items.ItemMusic;
import com.example.spotifyclone.R;
import com.example.spotifyclone.adapters.ItemMusicNormalAdapter;

import java.util.ArrayList;


public class PlayListsFragment extends Fragment {

    View fragmentPlayList;
    RecyclerView recyclerPlayList;
    ArrayList<ItemMusic> arrayPlayList;
    public PlayListsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragmentPlayList = inflater.inflate(R.layout.fragment_play_lists, container, false);
        recyclerPlayList = fragmentPlayList.findViewById(R.id.playlist_recycler);

        return fragmentPlayList;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        arrayPlayList = new ArrayList<>();
        recyclerPlayList.setLayoutManager(new LinearLayoutManager(getContext()));
        fillArrayPlayList();
        ItemMusicNormalAdapter itemMusicNormalAdapter = new ItemMusicNormalAdapter(arrayPlayList);
        recyclerPlayList.setAdapter(itemMusicNormalAdapter);
    }

    private void fillArrayPlayList() {
        arrayPlayList.add(new ItemMusic("https://images-na.ssl-images-amazon.com/images/I/71v1pBcehfL._AC_SX342_.jpg","Evolve","Imagine Dragons"));
        arrayPlayList.add(new ItemMusic("https://t2.genius.com/unsafe/220x220/https%3A%2F%2Fimages.genius.com%2Fbbea4553e61a94577e5d928cb49a5406.999x999x1.jpg","Under the moon","Foster the people"));
        arrayPlayList.add(new ItemMusic("https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Trench_Twenty_One_Pilots.png/220px-Trench_Twenty_One_Pilots.png","Trench","Twenty one pilots"));
        arrayPlayList.add(new ItemMusic("https://upload.wikimedia.org/wikipedia/en/0/01/OneRepublic_-_Human.png","Human","One Republic"));
        arrayPlayList.add(new ItemMusic("https://www.elquintobeatle.com/wp-content/uploads/2019/10/coldplay-everyday-life-1-1068x1068.jpeg","Everyday life","Coldplay"));
    }
}