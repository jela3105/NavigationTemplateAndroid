package com.example.spotifyclone.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spotifyclone.items.ItemMusic;
import com.example.spotifyclone.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    View fragmentHome;
    RecyclerView recyclerWelcome;
    RecyclerView recyclerHeardRecently;
    RecyclerView recyclerPersonalizedPodcast;



    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fragmentHome = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerWelcome = fragmentHome.findViewById(R.id.welcome_recycler);
        recyclerHeardRecently = fragmentHome.findViewById(R.id.heard_recently_recycler);
        recyclerPersonalizedPodcast = fragmentHome.findViewById(R.id.podcast_personalized_recycler);
        return fragmentHome;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}