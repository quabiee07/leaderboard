package com.example.gads2020leaderboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

class ViewPagerFragmentAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> mArrayList = new ArrayList<>();
    private ArrayList<String> mArrayTitle = new ArrayList<>();

    public ViewPagerFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    public ViewPagerFragmentAdapter(FragmentLearning fragmentLearning) {
        super(fragmentLearning);
    }

    public ViewPagerFragmentAdapter(FragmentSkillIQ skillIQ) {
        super(skillIQ);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment= new DemoFragment();
        Bundle args = new Bundle();

        args.putInt(DemoFragment.ARG_OBJECT,position + 1);
        return mArrayList.get(position);
    }

    public void AddFragment(Fragment fragment, String title) {
        mArrayList.add(fragment);
        mArrayTitle.add(title);
    }

    @Override
    public int getItemCount() {
        return mArrayList.size() ;
    }


    public class DemoFragment extends Fragment {
        public static final String ARG_OBJECT =  "object";

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.activity_main, container,false);
        }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            Bundle args = getArguments();
            assert args != null;
            ((TextView) view.findViewById(android.R.id.text1))
                    .setText(Integer.toString(args.getInt(ARG_OBJECT)));
        }
    }
}
