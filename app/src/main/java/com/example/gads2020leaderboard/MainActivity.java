package com.example.gads2020leaderboard;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager2 mViewPager;
    private ViewPagerFragmentAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);

        init();
    }

    private void init() {
        mAdapter = new ViewPagerFragmentAdapter(getSupportFragmentManager(), getLifecycle());
        //Add fragments
        mAdapter.AddFragment(new FragmentLearning(), "Learning Leaders");
        mAdapter.AddFragment(new FragmentSkillIQ(), "Skill IQ Leaders");
        mViewPager.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
        mViewPager.setAdapter(mAdapter);
        //Remove shadow from the action bar
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setElevation(0);
    }


}