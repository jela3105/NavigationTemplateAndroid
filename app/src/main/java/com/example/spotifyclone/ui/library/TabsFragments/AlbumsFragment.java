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

import com.example.spotifyclone.ItemMusic;
import com.example.spotifyclone.R;

import java.util.ArrayList;

public class AlbumsFragment extends Fragment {

    View fragmentAlbums;
    RecyclerView recyclerAlbums;
    ArrayList<ItemMusic> arrayAlbums;

    public AlbumsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragmentAlbums= inflater.inflate(R.layout.fragment_albums, container, false);
        recyclerAlbums = fragmentAlbums.findViewById(R.id.albums_recycler);
        return fragmentAlbums;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        arrayAlbums = new ArrayList<>();
        recyclerAlbums.setLayoutManager(new LinearLayoutManager(getContext()));
        fillArrayAlbums();
        ItemMusicNormalAdapter itemMusicNormalAdapter = new ItemMusicNormalAdapter(arrayAlbums);
        recyclerAlbums.setAdapter(itemMusicNormalAdapter);
    }

    private void fillArrayAlbums() {
        arrayAlbums.add(new ItemMusic("https://images-na.ssl-images-amazon.com/images/I/71v1pBcehfL._AC_SX342_.jpg","Evolve","Imagine Dragons"));
        arrayAlbums.add(new ItemMusic("https://t2.genius.com/unsafe/220x220/https%3A%2F%2Fimages.genius.com%2Fbbea4553e61a94577e5d928cb49a5406.999x999x1.jpg","Under the moon","Foster the people"));
        arrayAlbums.add(new ItemMusic("https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Trench_Twenty_One_Pilots.png/220px-Trench_Twenty_One_Pilots.png","Trench","Twenty one pilots"));
        arrayAlbums.add(new ItemMusic("https://upload.wikimedia.org/wikipedia/en/0/01/OneRepublic_-_Human.png","Human","One Republic"));
        arrayAlbums.add(new ItemMusic("https://www.elquintobeatle.com/wp-content/uploads/2019/10/coldplay-everyday-life-1-1068x1068.jpeg","Everyday life","Coldplay"));
    }
}