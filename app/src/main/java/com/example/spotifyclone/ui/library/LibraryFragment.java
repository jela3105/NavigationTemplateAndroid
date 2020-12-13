package com.example.spotifyclone.ui.library;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.spotifyclone.adapters.SectionPagerAdapter;
import com.example.spotifyclone.ui.library.TabsFragments.*;

import com.example.spotifyclone.R;
import com.google.android.material.tabs.TabLayout;


public class LibraryFragment extends Fragment {

    View myFragment;

    ViewPager viewPager;
    TabLayout tabLayout;

    public LibraryFragment() {
        // Required empty public constructor
    }

    public static LibraryFragment getInstance()    {
        return new LibraryFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myFragment = inflater.inflate(R.layout.fragment_library, container, false);

        viewPager = myFragment.findViewById(R.id.viewPagerFragmentHome);
        tabLayout = myFragment.findViewById(R.id.tabLayoutFragmentHome);

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

        adapter.addFragment(new MusicFragment(), "Music");
        adapter.addFragment(new PodcastFragment(), "Podcasts");

        viewPager.setAdapter(adapter);
    }
}