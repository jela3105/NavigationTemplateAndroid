package com.example.spotifyclone.ui.library.TabsFragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.spotifyclone.R;
import com.google.android.material.tabs.TabLayout;

public class MusicFragment extends Fragment {

    View myFragment;

    ViewPager viewPager;
    TabLayout tabLayout;

    public MusicFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.fragment_music, container, false);

        viewPager = myFragment.findViewById(R.id.viewPagerTab1);
        tabLayout = myFragment.findViewById(R.id.tabLayoutTab1);

        return myFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new PlayListsFragment(), "Playlists");
        adapter.addFragment(new ArtistFragment(), "Artists");
        adapter.addFragment(new AlbumsFragment(), "Albums");

        viewPager.setAdapter(adapter);
    }

}