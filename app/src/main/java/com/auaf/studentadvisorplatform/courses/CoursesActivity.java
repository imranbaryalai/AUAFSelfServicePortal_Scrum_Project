package com.auaf.studentadvisorplatform.courses;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.auaf.studentadvisorplatform.R;
import com.google.android.material.tabs.TabLayout;
import com.auaf.studentadvisorplatform.courses.fragements.ViewPagerAdapter;
import com.auaf.studentadvisorplatform.courses.fragements.bbaCoursesFragment;
import com.auaf.studentadvisorplatform.courses.fragements.itcsCoursesFragment;
import com.auaf.studentadvisorplatform.courses.fragements.lawCoursesFragment;
import com.auaf.studentadvisorplatform.courses.fragements.polCoursesFragment;

public class CoursesActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_activity);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.courses));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Tabbed Activity
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        // viewPagerAdapter
        viewPagerAdapter.addFragment(new itcsCoursesFragment(), "");
        viewPagerAdapter.addFragment(new bbaCoursesFragment(), "");
        viewPagerAdapter.addFragment(new lawCoursesFragment(), "");
        viewPagerAdapter.addFragment(new polCoursesFragment(), "");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_round_itcs).setText("ITCS");
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_round_bba).setText("BBA");
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_round_law).setText("LAW");
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_round_pol).setText("POL");

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}