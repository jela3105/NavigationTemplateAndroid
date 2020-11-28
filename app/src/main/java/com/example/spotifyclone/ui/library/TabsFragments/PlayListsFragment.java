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
        arrayPlayList.add(new ItemMusic("https://raw.githubusercontent.com/jela3105/CanContentoFrontend/main/images/index/estetica.jpg","Evolve","Imagine Dragons"));
        arrayPlayList.add(new ItemMusic("https://images-na.ssl-images-amazon.com/images/I/71v1pBcehfL._AC_SX342_.jpg","Evolve","Imagine Dragons"));
        arrayPlayList.add(new ItemMusic("https://images-na.ssl-images-amazon.com/images/I/71v1pBcehfL._AC_SX342_.jpg","Evolve","Imagine Dragons"));
        arrayPlayList.add(new ItemMusic("https://images-na.ssl-images-amazon.com/images/I/71v1pBcehfL._AC_SX342_.jpg","Evolve","Imagine Dragons"));
    }
}