package com.auaf.studentadvisorplatform.courses.fragements;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> firstFragment = new ArrayList();
    private final List<String> firstTitle = new ArrayList();

    public ViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public Fragment getItem(int position) {
        return this.firstFragment.get(position);
    }

    public int getCount() {
        return this.firstTitle.size();
    }

    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }

    public void addFragment(Fragment fragment, String title) {
        this.firstFragment.add(fragment);
        this.firstTitle.add(title);
    }
}
