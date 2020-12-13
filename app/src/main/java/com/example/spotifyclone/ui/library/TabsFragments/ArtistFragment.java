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
        arrayArtist.add(new ItemMusic("https://pbs.twimg.com/profile_images/1047708254447357957/fvJXTeOY_400x400.jpg","Imagine Dragons","71 songs"));
        arrayArtist.add(new ItemMusic("https://pbs.twimg.com/profile_images/1326345760078585858/kp6quzrq_400x400.jpg","Foster the people","33 songs"));
        arrayArtist.add(new ItemMusic("https://pbs.twimg.com/profile_images/1268035874127675392/7HDvPya9_400x400.jpg","Twenty one pilots","63 songs"));
        arrayArtist.add(new ItemMusic("https://pbs.twimg.com/profile_images/1238313639192350720/yg3-GKKB_400x400.jpg","One Republic","74 songs"));
        arrayArtist.add(new ItemMusic("https://pbs.twimg.com/profile_images/1278971521982226432/aOOcaTro_400x400.jpg","Coldplay","78 songs"));
    }
}