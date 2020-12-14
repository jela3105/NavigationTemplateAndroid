package com.example.spotifyclone.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spotifyclone.adapters.ItemSearchAdapter;
import com.example.spotifyclone.items.ItemSearch;
import com.example.spotifyclone.R;

import java.util.ArrayList;

public class SearchFragment extends Fragment {
    View fragmentSearch;
    RecyclerView recyclerSearchGenres;
    RecyclerView recyclerSearchPodcasts;
    RecyclerView recyclerSearchAll;

    ArrayList<ItemSearch> arrayGenres;
    ArrayList<ItemSearch> arrayPodcast;
    ArrayList<ItemSearch> arrayAll;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragmentSearch = inflater.inflate(R.layout.fragment_search, container, false);
        recyclerSearchGenres = fragmentSearch.findViewById(R.id.genres_most_listen_recycler);
        recyclerSearchPodcasts = fragmentSearch.findViewById(R.id.podcast_most_popular_recycler);
        recyclerSearchAll = fragmentSearch.findViewById(R.id.explore_all_recycler);
        return fragmentSearch;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        arrayGenres = new ArrayList<>();
        arrayPodcast = new ArrayList<>();
        arrayAll = new ArrayList<>();
        recyclerSearchGenres.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerSearchPodcasts.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerSearchAll.setLayoutManager(new GridLayoutManager(getContext(),2));
        fillGenres();
        fillPodcasts();
        fillAll();
        ItemSearchAdapter itemGenresAdapter = new ItemSearchAdapter(arrayGenres);
        recyclerSearchGenres.setAdapter(itemGenresAdapter);

        ItemSearchAdapter itemPodcastAdapter = new ItemSearchAdapter(arrayPodcast);
        recyclerSearchPodcasts.setAdapter(itemPodcastAdapter);

        ItemSearchAdapter itemAllAdapter = new ItemSearchAdapter(arrayAll);
        recyclerSearchAll.setAdapter(itemAllAdapter);
    }

    private void fillGenres() {
        arrayGenres.add(new ItemSearch("fff","fff"));
        arrayGenres.add(new ItemSearch("fff","fff"));
    }
    private void fillPodcasts(){
        arrayPodcast.add(new ItemSearch("fff","fff"));
        arrayPodcast.add(new ItemSearch("fff","fff"));

    }
    private void fillAll(){
        arrayAll.add(new ItemSearch("fff","fff"));
        arrayAll.add(new ItemSearch("fff","fff"));
        arrayAll.add(new ItemSearch("fff","fff"));
        arrayAll.add(new ItemSearch("fff","fff"));
        arrayAll.add(new ItemSearch("fff","fff"));
        arrayAll.add(new ItemSearch("fff","fff"));
        arrayAll.add(new ItemSearch("fff","fff"));
        arrayAll.add(new ItemSearch("fff","fff"));

    }
}