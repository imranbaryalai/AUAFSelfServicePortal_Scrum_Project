package com.nextgendevs.auaf_stu_adv_app.fragements;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> firstFragment = new ArrayList<>();
    private final List<String> firstTitle = new ArrayList<>();

    // Constructor

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return firstFragment.get(position);
    }

    @Override
    public int getCount() {
        return firstTitle.size();
    }

    // Override methods


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }

    // Add Fragment
    public void addFragment(Fragment fragment, String title){
        firstFragment.add(fragment);
        firstTitle.add(title);
    }

}
