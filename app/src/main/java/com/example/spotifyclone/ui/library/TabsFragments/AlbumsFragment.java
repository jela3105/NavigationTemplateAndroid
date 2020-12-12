package com.example.spotifyclone.ui.library.TabsFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.spotifyclone.R;

public class AlbumsFragment extends Fragment {

    View fragment;
    public AlbumsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragment= inflater.inflate(R.layout.fragment_albums, container, false);
        return fragment;
    }
}