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


public class ArtistFragment extends Fragment {

    View fragmentArtist;
    RecyclerView recyclerArtist;
    ArrayList<ItemMusic> arrayArtist;

    public ArtistFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentArtist = inflater.inflate(R.layout.fragment_artist, container, false);
        recyclerArtist = fragmentArtist.findViewById(R.id.artists_recycler);
        return fragmentArtist;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        arrayArtist = new ArrayList<>();
        recyclerArtist.setLayoutManager(new LinearLayoutManager(getContext()));
        fillArrayArtist();
        ItemMusicRoundAdapter itemMusicRoundAdapter = new ItemMusicRoundAdapter(arrayArtist);
        recyclerArtist.setAdapter(itemMusicRoundAdapter);
    }

    private void fillArrayArtist() {
        arrayArtist.add(new ItemMusic("https://images-na.ssl-images-amazon.com/images/I/71v1pBcehfL._AC_SX342_.jpg","Evolve","Imagine Dragons"));
        arrayArtist.add(new ItemMusic("https://t2.genius.com/unsafe/220x220/https%3A%2F%2Fimages.genius.com%2Fbbea4553e61a94577e5d928cb49a5406.999x999x1.jpg","Under the moon","Foster the people"));
        arrayArtist.add(new ItemMusic("https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Trench_Twenty_One_Pilots.png/220px-Trench_Twenty_One_Pilots.png","Trench","Twenty one pilots"));
        arrayArtist.add(new ItemMusic("https://upload.wikimedia.org/wikipedia/en/0/01/OneRepublic_-_Human.png","Human","One Republic"));
        arrayArtist.add(new ItemMusic("https://www.elquintobeatle.com/wp-content/uploads/2019/10/coldplay-everyday-life-1-1068x1068.jpeg","Everyday life",""));
    }
}